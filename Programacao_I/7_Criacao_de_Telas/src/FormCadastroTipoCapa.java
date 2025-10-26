import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormCadastroTipoCapa extends JFrame {

    // Componentes da interface
    private JTextField txtId;
    private JTextField txtNome;
    private JButton btnSalvar;
    private JButton btnLimpar;
    private JButton btnSair;

    public FormCadastroTipoCapa() {
        // Configurações da janela
        setTitle("Cadastro do Tipo de Capa");
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

        // Painel de botões
        JPanel painelBotoes = new JPanel(new FlowLayout());

        btnSalvar = new JButton("Salvar");
        btnLimpar = new JButton("Limpar");
        btnSair = new JButton("Sair");

        // Adicionar listeners aos botões
        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarTipoCapa();
            }
        });

        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparCampos();
            }
        });

        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        painelBotoes.add(btnSalvar);
        painelBotoes.add(btnLimpar);
        painelBotoes.add(btnSair);

        // Adicionar painel de botões ao painel principal
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        painelPrincipal.add(painelBotoes, gbc);

        // Adicionar painel principal à janela
        add(painelPrincipal);
    }

    private void salvarTipoCapa() {
        // Validar se os campos estão preenchidos
        if (txtId.getText().trim().isEmpty() ||
                txtNome.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(this,
                    "Por favor, preencha todos os campos!",
                    "Campos obrigatórios",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Validar se o ID é um número válido
        try {
            Integer.parseInt(txtId.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "O campo ID deve conter apenas números!",
                    "ID inválido",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {

            TipoCapa tipoCapa = new TipoCapa(Integer.parseInt(txtId.getText().trim()), txtNome.getText().trim());

            tipoCapa.salvar();

            salvarNoArquivo(tipoCapa);

            JOptionPane.showMessageDialog(this, "Dados salvos com sucesso!", "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE);

            limparCampos();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao salvar dados no arquivo: " + e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void salvarNoArquivo(TipoCapa tipoCapa) throws IOException {
        // Obter data e hora atual
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHora = agora.format(formatter);

        // Criar o conteúdo a ser salvo
        String conteudo = String.format(
                "=== EDITORA CADASTRADA ===\n" +
                        "Data/Hora: %s\n" +
                        "ID: %s\n" +
                        "Nome: %s\n" +
                        "========================\n\n",
                dataHora,
                tipoCapa.getId(),
                tipoCapa.getNome());

        try (FileWriter writer = new FileWriter("tipoCapa.txt", true)) {
            writer.write(conteudo);
        }
    }

    private void limparCampos() {
        txtId.setText("");
        txtNome.setText("");
        txtId.requestFocus(); // Focar no primeiro campo
    }

}