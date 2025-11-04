import java.awt.*;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

public class FormTarefas extends JFrame {

    // Componentes da interface
    private JTextField txtId;
    private JFormattedTextField txtData;
    private JTextField txtDescricao;
    private JTextField txtObservacoes;
    private JComboBox<String> cmbPrioridade;
    private JComboBox<String> cmbResponsavel;
    private Tarefas tarefas;
    private JButton btnSalvar;
    private JButton btnAlterar;
    private JButton btnExcluir;
    private JButton btnPesquisar;

    public FormTarefas() {
        // Configurações da janela
        setTitle("Registro de Tarefas");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 350);
        setLocationRelativeTo(null); // Centralizar na tela

        // Inicializar componentes
        inicializarComponentes();

        // Tornar a janela visível
        setVisible(true);
    }

    // Formatter para data no padrão dd/MM/yyyy
    private final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private void inicializarComponentes() {
        // Criar painel principal
        JPanel painelPrincipal = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Configurações gerais do GridBagConstraints
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        // Campo ID
        gbc.gridx = 0;
        gbc.gridy = 0;
        painelPrincipal.add(new JLabel("ID:"), gbc);

        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        txtId = new JTextField(15);
        painelPrincipal.add(txtId, gbc);

        // Campo Data
        gbc.gridx = 0;
        gbc.gridy = 1;
        painelPrincipal.add(new JLabel("Data da Tarefa:"), gbc);

        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        try {
            MaskFormatter mf = new MaskFormatter("##/##/####");
            mf.setPlaceholderCharacter('_');
            txtData = new JFormattedTextField(mf);
            txtData.setColumns(15);
            txtData.setFocusLostBehavior(JFormattedTextField.COMMIT);
        } catch (ParseException e) {
            // Fallback: caso a máscara falhe, utiliza um JTextField comum
            txtData = new JFormattedTextField();
            txtData.setColumns(15);
        }
        painelPrincipal.add(txtData, gbc);

        // ComboBox Prioridade
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        painelPrincipal.add(new JLabel("Prioridade:"), gbc);

        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;

        DefaultComboBoxModel<String> modeloPrioridade = new DefaultComboBoxModel<>();
        modeloPrioridade.addElement("Escolha uma Prioridade");
        try {
            for (Prioridade p : Prioridade.listarTodas()) {
                if (p != null && p.getDescricao() != null && !p.getDescricao().trim().isEmpty()) {
                    modeloPrioridade.addElement(p.getDescricao());
                }
            }
        } catch (Exception ex) {
            // Mantém apenas a opção padrão caso falhe o carregamento
            System.out.println("Não foi possível carregar prioridades: " + ex.getMessage());
        }

        cmbPrioridade = new JComboBox<>(modeloPrioridade);
        painelPrincipal.add(cmbPrioridade, gbc);

        // ComboBox Responsável
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        painelPrincipal.add(new JLabel("Responsável:"), gbc);

        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;

        DefaultComboBoxModel<String> modeloResponsavel = new DefaultComboBoxModel<>();
        modeloResponsavel.addElement("Escolha um Responsável");
            for (Responsavel r : Responsavel.listarTodas()) {
                if (r != null && r.getNome() != null && !r.getNome().trim().isEmpty()) {
                    modeloResponsavel.addElement(r.getNome());
                }
            }

        cmbResponsavel = new JComboBox<>(modeloResponsavel);
        painelPrincipal.add(cmbResponsavel, gbc);

        // Campo Descricao
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        painelPrincipal.add(new JLabel("Descrição:"), gbc);

        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        txtDescricao = new JTextField(15);
        painelPrincipal.add(txtDescricao, gbc);

        // Campo Observações
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        painelPrincipal.add(new JLabel("Observações:"), gbc);

        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        txtObservacoes = new JTextField(15);
        painelPrincipal.add(txtObservacoes, gbc);

        
        // Painel de botões
        JPanel painelBotoes = new JPanel(new FlowLayout());

        btnSalvar = new JButton("Salvar");
        btnAlterar = new JButton("Alterar");
        btnExcluir = new JButton("Excluir");
        btnPesquisar = new JButton("Pesquisar");

        // Adicionar listeners aos botões
        btnSalvar.addActionListener(e -> {
            try {
                if (!preencherModeloComValidacoes(true)) return;
                boolean ok = tarefas.salvarTarefas();
                if (ok) {
                    JOptionPane.showMessageDialog(FormTarefas.this,
                            "Tarefa salva com sucesso!",
                            "Sucesso",
                            JOptionPane.INFORMATION_MESSAGE);
                    limparCamposAposSalvar();
                }else {
                    JOptionPane.showMessageDialog(FormTarefas.this,
                            "Nenhum registro salvo. Verifique os dados informados.",
                            "Aviso",
                            JOptionPane.WARNING_MESSAGE);
                }
            } catch (Exception ex) {
                mostrarErro("salvar", ex);
            }
        });

        btnAlterar.addActionListener(e -> {
            try {
                if (!preencherModeloComValidacoes(true)) return;
                boolean ok = tarefas.alterarTarefas();
                if (ok) {
                    JOptionPane.showMessageDialog(FormTarefas.this,
                            "Tarefa alterada com sucesso!",
                            "Sucesso",
                            JOptionPane.INFORMATION_MESSAGE);
                    // Limpar todos os campos após alterar
                    limparCamposAposSalvar();
                } else {
                    JOptionPane.showMessageDialog(FormTarefas.this,
                            "Nenhum registro alterado. Verifique se o ID existe.",
                            "Aviso",
                            JOptionPane.WARNING_MESSAGE);
                }
            } catch (Exception ex) {
                mostrarErro("alterar", ex);
            }
        });

        btnExcluir.addActionListener(e -> {
            try {
                if (!preencherModeloComValidacoes(false)) return;
                boolean ok = tarefas.excluirTarefas();
                if (ok) {
                    JOptionPane.showMessageDialog(FormTarefas.this,
                            "Tarefa excluída com sucesso!",
                            "Sucesso",
                            JOptionPane.INFORMATION_MESSAGE);
                    // Limpar todos os campos após excluir
                    limparCamposAposSalvar();
                    txtId.requestFocus();
                }else {
                    JOptionPane.showMessageDialog(FormTarefas.this,
                            "Nenhum registro excluído. Verifique se o ID existe.",
                            "Aviso",
                            JOptionPane.WARNING_MESSAGE);
                }
            } catch (Exception ex) {
                mostrarErro("excluir", ex);
            }
        });

        btnPesquisar.addActionListener(e -> {
            try {
                if (!preencherModeloComValidacoes(false)) return;
                boolean ok = tarefas.pesquisarTarefas();
                if (ok) {
                    preencherCamposAPartirDoModelo();
                } else {
                    JOptionPane.showMessageDialog(FormTarefas.this,
                            "Tarefa não encontrada.",
                            "Pesquisa",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception ex) {
                mostrarErro("pesquisar", ex);
            }
        });

        painelBotoes.add(btnSalvar);
        painelBotoes.add(btnAlterar);
        painelBotoes.add(btnExcluir);
        painelBotoes.add(btnPesquisar);

        // Adicionar painel de botões ao painel principal
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        painelPrincipal.add(painelBotoes, gbc);

        // Adicionar painel principal à janela
        add(painelPrincipal);
    }

    // Lê o campo e converte para LocalDate; retorna null se vazio ou inválido
    private LocalDate getDataFromField() {
        String texto = txtData.getText();
        if (texto == null) return null;

        // Remove placeholder
        String clean = texto.replace('_', ' ').trim();
        if (clean.isBlank()) return null;

        try {
            return LocalDate.parse(texto, dateFormatter);
        } catch (DateTimeParseException ex) {
            return null;
        }
    }

    // Validação reutilizável do ID (para salvar/excluir)
    private Integer obterIdValido() {
        String idTexto = txtId.getText().trim();
        if (idTexto.isEmpty()) {
            JOptionPane.showMessageDialog(FormTarefas.this,
                    "ID não pode ser vazio.",
                    "Validação",
                    JOptionPane.WARNING_MESSAGE);
            txtId.requestFocus();
            return null;
        }

        try {
            return Integer.parseInt(idTexto);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(FormTarefas.this,
                    "ID deve ser um número inteiro.",
                    "Validação",
                    JOptionPane.WARNING_MESSAGE);
            txtId.requestFocus();
            return null;
        }
    }

    // Valida e devolve a descrição
    private String obterDescricaoValida() {
        String descricao = txtDescricao.getText().trim();
        if (descricao.isEmpty()) {
            JOptionPane.showMessageDialog(FormTarefas.this,
                    "Descrição não pode ser vazia.",
                    "Validação",
                    JOptionPane.WARNING_MESSAGE);
            txtDescricao.requestFocus();
            return null;
        }
        return descricao;
    }

    private Tarefas getOrCreateModel() {
        if (tarefas == null) {
            tarefas = new Tarefas();
        }
        return tarefas;
    }

    private Prioridade resolverPrioridadeSelecionada() {
        String sel = (String) cmbPrioridade.getSelectedItem();
        if (sel == null || sel.startsWith("Escolha")) {
            JOptionPane.showMessageDialog(FormTarefas.this,
                    "Selecione uma Prioridade.",
                    "Validação",
                    JOptionPane.WARNING_MESSAGE);
            cmbPrioridade.requestFocus();
            return null;
        }
        for (Prioridade p : Prioridade.listarTodas()) {
            if (p != null && sel.equals(p.getDescricao())) {
                return p;
            }
        }
        return null;
    }

    private Responsavel resolverResponsavelSelecionado() {
        String sel = (String) cmbResponsavel.getSelectedItem();
        if (sel == null || sel.startsWith("Escolha")) {
            JOptionPane.showMessageDialog(FormTarefas.this,
                    "Selecione um Responsável.",
                    "Validação",
                    JOptionPane.WARNING_MESSAGE);
            cmbResponsavel.requestFocus();
            return null;
        }
        for (Responsavel r : Responsavel.listarTodas()) {
            if (r != null && sel.equals(r.getNome())) {
                return r;
            }
        }
        return null;
    }

    // Centraliza validações e preenche o modelo. Quando completo=true, valida e preenche todos os campos.
    private boolean preencherModeloComValidacoes(boolean completo) {
        Integer id = obterIdValido();
        if (id == null) return false;

        Tarefas t = getOrCreateModel();
        t.setId(id);

        if (!completo) return true;

        LocalDate data = getDataFromField();
        if (data == null) {
            JOptionPane.showMessageDialog(FormTarefas.this,
                    "Informe uma data válida no formato dd/MM/yyyy.",
                    "Data inválida",
                    JOptionPane.WARNING_MESSAGE);
            txtData.requestFocus();
            return false;
        }

        String descricao = obterDescricaoValida();
        if (descricao == null) return false;

        String obs = txtObservacoes.getText();

        Prioridade p = resolverPrioridadeSelecionada();
        if (p == null) return false;
        Responsavel r = resolverResponsavelSelecionado();
        if (r == null) return false;

        t.setData_tarefa(data);
        t.setDescricao_tarefa(descricao);
        t.setObservacao(obs);
        t.setPrioridade(p);
        t.setResponsavel(r);
        return true;
    }

    private void preencherCamposAPartirDoModelo() {
        LocalDate data = tarefas.getData_tarefa();
        if (data != null) {
            txtData.setText(data.format(dateFormatter));
        } else {
            txtData.setText("");
        }
        txtDescricao.setText(tarefas.getDescricao_tarefa() != null ? tarefas.getDescricao_tarefa() : "");
        txtObservacoes.setText(tarefas.getObservacao() != null ? tarefas.getObservacao() : "");

        Prioridade p = tarefas.getPrioridade();
        if (p != null && p.getDescricao() != null) {
            cmbPrioridade.setSelectedItem(p.getDescricao());
        }
        Responsavel r = tarefas.getResponsavel();
        if (r != null && r.getNome() != null) {
            cmbResponsavel.setSelectedItem(r.getNome());
        }
    }

    private void mostrarErro(String acao, Exception ex) {
        JOptionPane.showMessageDialog(FormTarefas.this,
                "Erro ao " + acao + ": " + ex.getMessage(),
                "Erro",
                JOptionPane.ERROR_MESSAGE);
    }

    private void limparCamposAposSalvar() {
        txtId.setText("");
        txtData.setText("");
        txtDescricao.setText("");
        txtObservacoes.setText("");
        cmbPrioridade.setSelectedIndex(0);
        cmbResponsavel.setSelectedIndex(0);
        txtId.requestFocus();
    }
}