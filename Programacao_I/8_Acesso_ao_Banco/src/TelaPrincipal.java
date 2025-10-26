import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPrincipal extends JFrame {

    public TelaPrincipal() {
        // Configurações da janela principal
        setTitle("Sistema de Gerenciamento de Tarefas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null); // Centralizar na tela

        // Criar e configurar o menu
        criarMenu();

        // Criar conteúdo principal
        criarConteudoPrincipal();

        // Tornar a janela visível
        setVisible(true);
    }

    private void criarMenu() {
        // Criar a barra de menu
        JMenuBar menuBar = new JMenuBar();

        // Criar o menu "Cadastros"
        JMenu menuCadastros = new JMenu("Cadastros");

        // Criar submenu "Tarefas"
        JMenuItem menuTarefas = new JMenuItem("Tarefas");
        menuTarefas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirFormularioTarefas();
            }
        });

        // Criar submenu "Prioridade"
        JMenuItem menuPrioridade = new JMenuItem("Prioridade");
        menuPrioridade.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirFormularioPrioridade();
            }
        });

        //Criar submenu "Responsável""
        JMenuItem menuResponsavel = new JMenuItem("Responsável");
        menuResponsavel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirFormularioResponsavel();
            }
        });

        // Adicionar itens ao menu Cadastros
        menuCadastros.add(menuTarefas);
        menuCadastros.add(menuPrioridade);
        menuCadastros.add(menuResponsavel);

        // Criar menu "Ajuda"
        JMenu menuAjuda = new JMenu("Ajuda");
        JMenuItem menuItemSobre = new JMenuItem("Sobre");
        menuItemSobre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarSobre();
            }
        });
        menuAjuda.add(menuItemSobre);

        // Adicionar menus à barra de menu
        menuBar.add(menuCadastros);
        menuBar.add(menuAjuda);

        // Definir a barra de menu para a janela
        setJMenuBar(menuBar);
    }

    private void criarConteudoPrincipal() {
        // Criar painel principal
        JPanel painelPrincipal = new JPanel(new BorderLayout());

        // Criar painel de boas-vindas
        JPanel painelBoasVindas = new JPanel(new GridBagLayout());
        painelBoasVindas.setBackground(new Color(240, 248, 255)); // Azul claro

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 20, 20, 20);

        // Título principal
        JLabel lblTitulo = new JLabel("Sistema de Gerenciamento de Tarefas");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 28));
        lblTitulo.setForeground(new Color(25, 25, 112)); // Azul escuro
        gbc.gridx = 0;
        gbc.gridy = 0;
        painelBoasVindas.add(lblTitulo, gbc);

        // Subtítulo
        JLabel lblSubtitulo = new JLabel("Bem-vindo ao sistema de Cadastro de Tarefas!");
        lblSubtitulo.setFont(new Font("Arial", Font.PLAIN, 16));
        lblSubtitulo.setForeground(new Color(70, 70, 70));
        gbc.gridy = 1;
        painelBoasVindas.add(lblSubtitulo, gbc);

        // Instruções
        JLabel lblInstrucoes = new JLabel(
                "<html><center>Use o menu 'Cadastros' para acessar:<br>• Lista de Tarefas<br>• Cadastro de Prioridade<br>• Cadastro do Responsável</center></html>");
        lblInstrucoes.setFont(new Font("Arial", Font.PLAIN, 14));
        lblInstrucoes.setForeground(new Color(100, 100, 100));
        gbc.gridy = 2;
        gbc.insets = new Insets(30, 20, 20, 20);
        painelBoasVindas.add(lblInstrucoes, gbc);

        // Painel de botões de acesso rápido
        JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));
        painelBotoes.setBackground(new Color(240, 248, 255));

        // Botão para Cadastro de Tarefas
        JButton btnCadastroTarefas = new JButton("Lista de Tarefas");
        btnCadastroTarefas.setPreferredSize(new Dimension(200, 40));
        btnCadastroTarefas.setFont(new Font("Arial", Font.BOLD, 12));
        btnCadastroTarefas.setBackground(new Color(70, 130, 180));
        btnCadastroTarefas.setForeground(Color.WHITE);
        btnCadastroTarefas.setFocusPainted(false);
        //tornar o botão opaco e forçar a pintura do fundo
        btnCadastroTarefas.setOpaque(true);
        btnCadastroTarefas.setContentAreaFilled(true);
        btnCadastroTarefas.setBorderPainted(false);
        btnCadastroTarefas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirFormularioTarefas();
            }
        });

        // Botão para Cadastro de Prioridade
        JButton btnCadastroPrioridade = new JButton("Cadastrar Prioridade");
        btnCadastroPrioridade.setPreferredSize(new Dimension(200, 40));
        btnCadastroPrioridade.setFont(new Font("Arial", Font.BOLD, 12));
        btnCadastroPrioridade.setBackground(new Color(60, 179, 113));
        btnCadastroPrioridade.setForeground(Color.WHITE);
        btnCadastroPrioridade.setFocusPainted(false);
        //tornar o botão opaco e forçar a pintura do fundo
        btnCadastroPrioridade.setOpaque(true);
        btnCadastroPrioridade.setContentAreaFilled(true);
        btnCadastroPrioridade.setBorderPainted(false);
        btnCadastroPrioridade.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirFormularioPrioridade();
            }
        });

        // Botão para Cadastro de Responsável
        JButton btnCadastroResponsavel = new JButton("Cadastrar Responsável");
        btnCadastroResponsavel.setPreferredSize(new Dimension(200, 40));
        btnCadastroResponsavel.setFont(new Font("Arial", Font.BOLD, 12));
        btnCadastroResponsavel.setBackground(new Color(255, 140, 0));
        btnCadastroResponsavel.setForeground(Color.WHITE);
        btnCadastroResponsavel.setFocusPainted(false);
        //tornar o botão opaco e forçar a pintura do fundo
        btnCadastroResponsavel.setOpaque(true);
        btnCadastroResponsavel.setContentAreaFilled(true);
        btnCadastroResponsavel.setBorderPainted(false);
        btnCadastroResponsavel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirFormularioResponsavel();
            }
        });

        painelBotoes.add(btnCadastroTarefas);
        painelBotoes.add(btnCadastroPrioridade);
        painelBotoes.add(btnCadastroResponsavel);

        gbc.gridy = 3;
        gbc.insets = new Insets(40, 20, 20, 20);
        painelBoasVindas.add(painelBotoes, gbc);

        // Adicionar ao painel principal
        painelPrincipal.add(painelBoasVindas, BorderLayout.CENTER);

        // Barra de status
        JPanel painelStatus = new JPanel(new FlowLayout(FlowLayout.LEFT));
        painelStatus.setBackground(new Color(220, 220, 220));
        painelStatus.setBorder(BorderFactory.createEtchedBorder());

        JLabel lblStatus = new JLabel("Sistema pronto para uso");
        lblStatus.setFont(new Font("Arial", Font.PLAIN, 11));
        painelStatus.add(lblStatus);

        painelPrincipal.add(painelStatus, BorderLayout.SOUTH);

        // Adicionar painel principal à janela
        add(painelPrincipal);
    }

    private void abrirFormularioTarefas() {
        // Criar nova instância do formulário de tarefas
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FormTarefas();
            }
        });
    }

    private void abrirFormularioPrioridade() {
        // Criar nova instância do formulário de prioridade
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FormPrioridade();
            }
        });
    }

    private void abrirFormularioResponsavel() {
        // Criar nova instância do formulário de responsavel
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FormResponsavel();
            }
        });
    }

    private void mostrarSobre() {
        String mensagem = "Sistema de Gerenciamento de Tarefas\n" +
                "Versão 1.0\n\n" +
                "Desenvolvido para gerenciamento de:\n" +
                "• Lista de Tarefas\n" +
                "• Prioridades\n" +
                "• Responsáveis\n\n" +
                "© 2025 - Sistema de Gerenciamento de Tarefas";
        JOptionPane.showMessageDialog(this, mensagem, "Sobre o Sistema", JOptionPane.INFORMATION_MESSAGE);
    }

}