import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        btnSalvar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String descricao = txtDescricao.getText().trim();

                    if (descricao.isEmpty()) {
                        JOptionPane.showMessageDialog(FormPrioridade.this,
                                "Descrição não pode ser vazia.",
                                "Validação",
                                JOptionPane.WARNING_MESSAGE);
                        return;
                    }

                    if (prioridade == null) {
                        prioridade = new Prioridade();
                    }

                    prioridade.setDescricao(descricao);

                    boolean ok = prioridade.salvarPrioridade();
                    if (ok) {
                        JOptionPane.showMessageDialog(FormPrioridade.this,
                                "Prioridade salva com sucesso!",
                                "Sucesso",
                                JOptionPane.INFORMATION_MESSAGE);
                        // Exibe o ID gerado pelo banco
                        txtId.setText(String.valueOf(prioridade.getId()));
                        txtDescricao.setText("");
                        txtDescricao.requestFocus();
                    } else {
                        JOptionPane.showMessageDialog(FormPrioridade.this,
                                "Não foi possível salvar a prioridade. Verifique o log/console.",
                                "Erro",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(FormPrioridade.this,
                            "Erro ao salvar: " + ex.getMessage(),
                            "Erro",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnAlterar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prioridade.alterarPrioridade();
            }
        });

        btnExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prioridade.excluirPrioridade();
            }
        });

        btnPesquisar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prioridade.pesquisarPrioridade();
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
}