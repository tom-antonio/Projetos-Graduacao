import java.awt.*;
import javax.swing.*;

public class FormResponsavel extends JFrame {

    // Componentes da interface
    private JTextField txtId;
    private JTextField txtNome;
    private Responsavel responsavel;
    private JButton btnSalvar;
    private JButton btnAlterar;
    private JButton btnExcluir;
    private JButton btnPesquisar;

    public FormResponsavel() {
        // Configurações da janela
        setTitle("Registro do Responsável");
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
        txtNome = new JTextField(15);
        painelPrincipal.add(txtNome, gbc);

        // (Removido) Combo de seleção para manter a tela como FormPrioridade

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
                boolean ok = responsavel.salvarResponsavel();
                if (ok) {
                    JOptionPane.showMessageDialog(FormResponsavel.this,
                            "Responsável salvo com sucesso!",
                            "Sucesso",
                            JOptionPane.INFORMATION_MESSAGE);
                    // Padronização: limpar todos os campos após salvar
                    limparCampos();
                } else {
                    JOptionPane.showMessageDialog(FormResponsavel.this,
                            "Não foi possível salvar o responsável. Verifique o log/console.",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                mostrarErro("salvar", ex);
            }
        });

        btnAlterar.addActionListener(e -> {
            try {
                if (!preencherModeloComValidacoes(true)) return;
                boolean ok = responsavel.alterarResponsavel();
                if (ok) {
                    JOptionPane.showMessageDialog(FormResponsavel.this,
                            "Responsável alterado com sucesso!",
                            "Sucesso",
                            JOptionPane.INFORMATION_MESSAGE);
                    limparCampos();
                }
            } catch (Exception ex) {
                mostrarErro("alterar", ex);
            }
        });

        btnExcluir.addActionListener(e -> {
            try {
                if (!preencherModeloComValidacoes(false)) return;
                boolean ok = responsavel.excluirResponsavel();
                if (ok) {
                    JOptionPane.showMessageDialog(FormResponsavel.this,
                            "Responsável excluído com sucesso!",
                            "Sucesso",
                            JOptionPane.INFORMATION_MESSAGE);
                    limparCampos();
                } else {
                    JOptionPane.showMessageDialog(FormResponsavel.this,
                            "Não foi possível excluir o responsável. Verifique o log/console.",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                mostrarErro("excluir", ex);
            }
        });

        btnPesquisar.addActionListener(e -> {
            try {
                if (!preencherModeloComValidacoes(false)) return;
                boolean ok = responsavel.pesquisarResponsavel();
                if (ok) {
                    txtNome.setText(responsavel.getNome());
                } else {
                    JOptionPane.showMessageDialog(FormResponsavel.this,
                            "Responsável não encontrado.",
                            "Pesquisa",
                            JOptionPane.INFORMATION_MESSAGE);
                    txtNome.setText("");
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

    // Validação reutilizável do ID para salvar/excluir
    private Integer obterIdValido() {
        String idTexto = txtId.getText().trim();
        if (idTexto.isEmpty()) {
            JOptionPane.showMessageDialog(FormResponsavel.this,
                    "ID não pode ser vazio.",
                    "Validação",
                    JOptionPane.WARNING_MESSAGE);
            txtId.requestFocus();
            return null;
        }

        try {
            return Integer.parseInt(idTexto);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(FormResponsavel.this,
                    "ID deve ser um número inteiro.",
                    "Validação",
                    JOptionPane.WARNING_MESSAGE);
            txtId.requestFocus();
            return null;
        }
    }

    // Validação reutilizável do Nome
    private String obterNomeValido() {
        String nome = txtNome.getText().trim();
        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(FormResponsavel.this,
                    "Nome não pode ser vazio.",
                    "Validação",
                    JOptionPane.WARNING_MESSAGE);
            txtNome.requestFocus();
            return null;
        }
        return nome;
    }

    // Garante que o modelo existe
    private Responsavel getOrCreateModel() {
        if (responsavel == null) {
            responsavel = new Responsavel();
        }
        return responsavel;
    }

    // Centraliza validações e preenchimento do modelo: sempre ID; nome quando necessário
    private boolean preencherModeloComValidacoes(boolean precisaNome) {
        Integer id = obterIdValido();
        if (id == null) return false;

        String nome = null;
        if (precisaNome) {
            nome = obterNomeValido();
            if (nome == null) return false;
        }

        Responsavel r = getOrCreateModel();
        r.setId(id);
        if (nome != null) {
            r.setNome(nome);
        }
        return true;
    }

    private void mostrarErro(String acao, Exception ex) {
        JOptionPane.showMessageDialog(FormResponsavel.this,
                "Erro ao " + acao + ": " + ex.getMessage(),
                "Erro",
                JOptionPane.ERROR_MESSAGE);
    }

    private void limparCampos() {
        txtId.setText("");
        txtNome.setText("");
        txtId.requestFocus();
    }
}