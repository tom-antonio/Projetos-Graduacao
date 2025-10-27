import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String idTexto = txtId.getText().trim();
                    String nome = txtNome.getText().trim();

                    if (idTexto.isEmpty()) {
                        JOptionPane.showMessageDialog(FormResponsavel.this,
                                "ID não pode ser vazio.",
                                "Validação",
                                JOptionPane.WARNING_MESSAGE);
                        txtId.requestFocus();
                        return;
                    }

                    int id;
                    try {
                        id = Integer.parseInt(idTexto);
                    } catch (NumberFormatException nfe) {
                        JOptionPane.showMessageDialog(FormResponsavel.this,
                                "ID deve ser um número inteiro.",
                                "Validação",
                                JOptionPane.WARNING_MESSAGE);
                        txtId.requestFocus();
                        return;
                    }

                    if (nome.isEmpty()) {
                        JOptionPane.showMessageDialog(FormResponsavel.this,
                                "Nome não pode ser vazio.",
                                "Validação",
                                JOptionPane.WARNING_MESSAGE);
                        txtNome.requestFocus();
                        return;
                    }

                    if (responsavel == null) {
                        responsavel = new Responsavel();
                    }

                    responsavel.setId(id);
                    responsavel.setNome(nome);

                    boolean ok = responsavel.salvarResponsavel();
                    if (ok) {
                        JOptionPane.showMessageDialog(FormResponsavel.this,
                                "Responsável salvo com sucesso!",
                                "Sucesso",
                                JOptionPane.INFORMATION_MESSAGE);
                        // Mantém o ID informado e limpa apenas o nome
                        txtNome.setText("");
                        txtNome.requestFocus();
                    } else {
                        JOptionPane.showMessageDialog(FormResponsavel.this,
                                "Não foi possível salvar o responsável. Verifique o log/console.",
                                "Erro",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(FormResponsavel.this,
                            "Erro ao salvar: " + ex.getMessage(),
                            "Erro",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnAlterar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        btnExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                responsavel.excluirResponsavel();
            }
        });

        btnPesquisar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                responsavel.pesquisarResponsavel();
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