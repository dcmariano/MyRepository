package br.com.atividade.mapa.davi.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import br.com.atividade.mapa.davi.controller.UsuarioDAO;
import br.com.atividade.mapa.davi.model.Usuario;

public class TelaCadastroUsuario extends JFrame {
    private JTextField txtNome;
    private JTextField txtLogin;
    private JPasswordField txtSenha;
    private JTextField txtEmail;

    public TelaCadastroUsuario() {
    	setTitle("Cadastro de Usuário");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 10, 10)); 

        int padding = 10; 
        panel.setBorder(BorderFactory.createEmptyBorder(padding, padding, padding, padding));

        JLabel lblNome = new JLabel("Nome:");
        txtNome = new JTextField();

        JLabel lblLogin = new JLabel("Login:");
        txtLogin = new JTextField();

        JLabel lblSenha = new JLabel("Senha:");
        txtSenha = new JPasswordField();

        JLabel lblEmail = new JLabel("Email:");
        txtEmail = new JTextField();

        JButton btnCadastrar = new JButton("Cadastrar");

        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                String nome = txtNome.getText();
                String login = txtLogin.getText();
                String senha = new String(txtSenha.getPassword());
                String email = txtEmail.getText();

                
                Usuario novoUsuario = new Usuario();
                novoUsuario.setNome(nome);
                novoUsuario.setLogin(login);
                novoUsuario.setSenha(senha);
                novoUsuario.setEmail(email);

                try {
                    UsuarioDAO.cadastrarUsuario(novoUsuario);
                    JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuário: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        panel.add(lblNome);
        panel.add(txtNome);
        panel.add(lblLogin);
        panel.add(txtLogin);
        panel.add(lblSenha);
        panel.add(txtSenha);
        panel.add(lblEmail);
        panel.add(txtEmail);
        panel.add(new JLabel());
        panel.add(btnCadastrar);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaCadastroUsuario telaCadastro = new TelaCadastroUsuario();
            telaCadastro.setVisible(true);
        });
    }
}
