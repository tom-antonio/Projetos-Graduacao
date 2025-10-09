import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App extends JFrame {
    private JTextField txtId;
    private JTextField txtNome;
    private JTextField txtCidade;
    private JButton btnSalvar;
    private JButton btnAlterar;
    private JButton btnExcluir;
    private JButton btnPesquisar;

    public App() {
        setTitle("Cadastro de Autor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        initializeComponents();
    }

    private void initializeComponents() {
        JPanel painelPrincipal = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        // ID
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

        // Nome
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

        // Cidade
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        painelPrincipal.add(new JLabel("Cidade:"), gbc);

        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        txtCidade = new JTextField(15);
        painelPrincipal.add(txtCidade, gbc);

        // Painel dos botões
        JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.CENTER));

        btnSalvar = new JButton("Salvar");
        btnAlterar = new JButton("Alterar");
        btnExcluir = new JButton("Excluir");
        btnPesquisar = new JButton("Pesquisar");

        painelBotoes.add(btnSalvar);
        painelBotoes.add(btnAlterar);
        painelBotoes.add(btnExcluir);
        painelBotoes.add(btnPesquisar);

        btnSalvar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarAutor();
            }
        });

        btnAlterar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                alterarAutor();
            }
        });

        btnExcluir.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                excluirAutor();
            }
        });

        btnPesquisar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                pesquisarAutor();
            }
        });

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        painelPrincipal.add(painelBotoes, gbc);

        add(painelPrincipal);
    }

    private void validarCampos() {
        
    }

    private void salvarAutor() {
      if (txtId.getText().trim().isEmpty() ||
                txtNome.getText().trim().isEmpty() ||
                txtCidade.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(this,
                    "Por favor, preencha todos os campos!",
                    "Campos obrigatórios",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        String id = txtId.getText().trim();
        String nome = txtNome.getText().trim();
        String cidade = txtCidade.getText().trim();
        String linha = String.format("%s;%s;%s%n", id, nome, cidade);
        String nomeArquivo = "autores.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo, true))) {
            bw.write(linha);
            bw.flush();
          String mensagem = String.format(
            "Autor salvo com sucesso!\n\n" +
            "ID: %s\n" +
            "Nome: %s\n" +
            "Cidade: %s\n",
            txtId.getText(),
            txtNome.getText(),
            txtCidade.getText()
        );
        JOptionPane.showMessageDialog(this, mensagem, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            txtId.setText("");
            txtNome.setText("");
            txtCidade.setText("");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar autor: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void alterarAutor() {
              if (txtId.getText().trim().isEmpty() ||
                txtNome.getText().trim().isEmpty() ||
                txtCidade.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(this,
                    "Por favor, preencha todos os campos!",
                    "Campos obrigatórios",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        String mensagem = String.format(
            "Autor alterado com sucesso!\n\n" +
            "ID: %s\n" +
            "Nome: %s\n" +
            "Cidade: %s\n",
            txtId.getText(),
            txtNome.getText(),
            txtCidade.getText()
        );
        JOptionPane.showMessageDialog(this, mensagem, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    private void excluirAutor() {
              if (txtId.getText().trim().isEmpty() ||
                txtNome.getText().trim().isEmpty() ||
                txtCidade.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(this,
                    "Por favor, preencha todos os campos!",
                    "Campos obrigatórios",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        String mensagem = String.format(
            "Autor excluído com sucesso!\n\n" +
            "ID: %s\n" +
            "Nome: %s\n" +
            "Cidade: %s\n",
            txtId.getText(),
            txtNome.getText(),
            txtCidade.getText()
        );
        JOptionPane.showMessageDialog(this, mensagem, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    private void pesquisarAutor() {
              if (txtId.getText().trim().isEmpty() ||
                txtNome.getText().trim().isEmpty() ||
                txtCidade.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(this,
                    "Por favor, preencha todos os campos!",
                    "Campos obrigatórios",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        String mensagem = String.format(
            "Autor pesquisado com sucesso!\n\n" +
            "ID: %s\n" +
            "Nome: %s\n" +
            "Cidade: %s\n",
            txtId.getText(),
            txtNome.getText(),
            txtCidade.getText()
        );
        JOptionPane.showMessageDialog(this, mensagem, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            App form = new App();
            form.setVisible(true);
        });
    }
}