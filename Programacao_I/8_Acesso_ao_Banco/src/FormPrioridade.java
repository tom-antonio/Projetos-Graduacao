import java.awt.*;
import javax.swing.*;

public class FormPrioridade extends JFrame {

    // Componentes da interface
    private JTextField txtId;
    private JTextField txtDescricao;
    private Prioridade prioridade;
    private JButton btnSalvar;
    private JButton btnAlterar;
    private JButton btnExcluir;
    private JButton btnPesquisar;

    public FormPrioridade() {
        // Configurações da janela
        setTitle("Registro de Prioridade");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 250);
        setLocationRelativeTo(null); // Centralizar na tela

        // Inicializar componentes
        inicializarComponentes();

        // Tornar a janela visível
        setVisible(true);
    }

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
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        painelPrincipal.add(new JLabel("ID:"), gbc);


        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        txtId = new JTextField(15);
        painelPrincipal.add(txtId, gbc);

        // Campo Nome
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        painelPrincipal.add(new JLabel("Nome:"), gbc);

        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        txtDescricao = new JTextField(15);
        painelPrincipal.add(txtDescricao, gbc);

        // Painel de botões
        JPanel painelBotoes = new JPanel(new FlowLayout());

        btnSalvar = new JButton("Salvar");
        btnAlterar = new JButton("Alterar");
        btnExcluir = new JButton("Excluir");
        btnPesquisar = new JButton("Pesquisar");

        // Método salvar ação do botão Salvar
        btnSalvar.addActionListener(e -> {
            try {
                if (!preencherModeloComValidacoes(true)) return;
                boolean ok = prioridade.salvarPrioridade();
                if (ok) {
                    JOptionPane.showMessageDialog(FormPrioridade.this,
                            "Prioridade salva com sucesso!",
                            "Sucesso",
                            JOptionPane.INFORMATION_MESSAGE);
                    // Padronização: limpar todos os campos após salvar
                    limparCampos();
                }
            } catch (Exception ex) {
                mostrarErro("salvar", ex);
            }
        });

        btnAlterar.addActionListener(e -> {
            try {
                if (!preencherModeloComValidacoes(true)) return;
                boolean ok = prioridade.alterarPrioridade();
                if (ok) {
                    JOptionPane.showMessageDialog(FormPrioridade.this,
                            "Prioridade alterada com sucesso!",
                            "Sucesso",
                            JOptionPane.INFORMATION_MESSAGE);
                    limparCampos();
                } else {
                    JOptionPane.showMessageDialog(FormPrioridade.this,
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
                boolean ok = prioridade.excluirPrioridade();
                if (ok) {
                    JOptionPane.showMessageDialog(FormPrioridade.this,
                            "Prioridade excluída com sucesso!",
                            "Sucesso",
                            JOptionPane.INFORMATION_MESSAGE);
                    limparCampos();
                }
            } catch (Exception ex) {
                mostrarErro("excluir", ex);
            }
        });

        btnPesquisar.addActionListener(e -> {
            try {
                if (!preencherModeloComValidacoes(false)) return;
                boolean ok = prioridade.pesquisarPrioridade();
                if (ok) {
                    txtDescricao.setText(prioridade.getDescricao());
                } else {
                    JOptionPane.showMessageDialog(FormPrioridade.this,
                            "Prioridade não encontrada.",
                            "Pesquisa",
                            JOptionPane.INFORMATION_MESSAGE);
                    txtDescricao.setText("");
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
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        painelPrincipal.add(painelBotoes, gbc);

        // Adicionar painel principal à janela
        add(painelPrincipal);
    }

    // Validação reutilizável do ID (para salvar/excluir)
    private Integer obterIdValido() {
        String idTexto = txtId.getText().trim();
        if (idTexto.isEmpty()) {
            JOptionPane.showMessageDialog(FormPrioridade.this,
                    "ID não pode ser vazio.",
                    "Validação",
                    JOptionPane.WARNING_MESSAGE);
            txtId.requestFocus();
            return null;
        }

        try {
            return Integer.parseInt(idTexto);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(FormPrioridade.this,
                    "ID deve ser um número inteiro.",
                    "Validação",
                    JOptionPane.WARNING_MESSAGE);
            txtId.requestFocus();
            return null;
        }
    }

    // Validação reutilizável da descrição
    private String obterDescricaoValida() {
        String descricao = txtDescricao.getText().trim();
        if (descricao.isEmpty()) {
            JOptionPane.showMessageDialog(FormPrioridade.this,
                    "Descrição não pode ser vazia.",
                    "Validação",
                    JOptionPane.WARNING_MESSAGE);
            txtDescricao.requestFocus();
            return null;
        }
        return descricao;
    }

    // Garante que o modelo 'prioridade' existe
    private Prioridade getOrCreateModel() {
        if (prioridade == null) {
            prioridade = new Prioridade();
        }
        return prioridade;
    }

    // Centraliza validações e preenchimento do modelo: sempre valida ID; valida descrição quando necessário
    private boolean preencherModeloComValidacoes(boolean precisaDescricao) {
        Integer id = obterIdValido();
        if (id == null) return false;

        String descricao = null;
        if (precisaDescricao) {
            descricao = obterDescricaoValida();
            if (descricao == null) return false;
        }

        Prioridade p = getOrCreateModel();
        p.setId(id);
        if (descricao != null) {
            p.setDescricao(descricao);
        }
        return true;
    }

    // Exibe diálogo de erro padronizado
    private void mostrarErro(String acao, Exception ex) {
        JOptionPane.showMessageDialog(FormPrioridade.this,
                "Erro ao " + acao + ": " + ex.getMessage(),
                "Erro",
                JOptionPane.ERROR_MESSAGE);
    }

    // Limpa todos os campos da tela
    private void limparCampos() {
        txtId.setText("");
        txtDescricao.setText("");
        txtId.requestFocus();
    }
}