import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        try {
            for (Responsavel r : Responsavel.listarTodas()) {
                if (r != null && r.getNome() != null && !r.getNome().trim().isEmpty()) {
                    modeloResponsavel.addElement(r.getNome());
                }
            }
        } catch (Exception ex) {
            // Mantém apenas a opção padrão caso falhe o carregamento
            System.out.println("Não foi possível carregar responsáveis: " + ex.getMessage());
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
        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Exemplo: valide e obtenha a data no formato desejado antes de salvar
                LocalDate data = getDataFromField();
                if (data == null) {
                    JOptionPane.showMessageDialog(FormTarefas.this,
                            "Informe uma data válida no formato dd/MM/yyyy.",
                            "Data inválida",
                            JOptionPane.WARNING_MESSAGE);
                    txtData.requestFocus();
                    return;
                }

                // Aqui você seguiria para popular o objeto 'tarefas' e salvar
                // Ex.: tarefas.setData(data);
                if (tarefas != null) {
                    tarefas.salvarTarefas();
                }
            }
        });

        btnAlterar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tarefas.alterarTarefas();
            }
        });

        btnExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tarefas.excluirTarefas();
            }
        });

        btnPesquisar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tarefas.pesquisarTarefas();
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

    // Formata e coloca a data no campo (útil ao carregar registros)
    private void setDataField(LocalDate data) {
        if (data == null) {
            txtData.setText("");
        } else {
            txtData.setText(data.format(dateFormatter));
        }
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
}