package br.com.atividade.mapa.davi.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
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

public class TelaLogin extends JFrame {
	private JTextField txtLogin;
	private JPasswordField txtSenha;

	public TelaLogin() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		JPanel inputPanel = new JPanel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 5, 5, 5);

		JLabel lblLogin = new JLabel("Login:");
		txtLogin = new JTextField(15);
		txtLogin.setPreferredSize(new Dimension(200, 30));
		JLabel lblSenha = new JLabel("Senha:");
		txtSenha = new JPasswordField(15);
		txtSenha.setPreferredSize(new Dimension(200, 30));

		gbc.anchor = GridBagConstraints.WEST;
		inputPanel.add(lblLogin, gbc);
		gbc.gridy = 1;
		inputPanel.add(lblSenha, gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		inputPanel.add(txtLogin, gbc);

		gbc.gridy = 1;
		inputPanel.add(txtSenha, gbc);

		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(2, 1, 0, 5));

		JButton btnLogin = new JButton("Entrar");
		JButton btnCadastrar = new JButton("Cadastrar novo usuário");

		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String login = txtLogin.getText();
				String senha = new String(txtSenha.getPassword());

				try {
					boolean loginValido = UsuarioDAO.validarLogin(login, senha);

					if (loginValido) {
						JOptionPane.showMessageDialog(null, "Login bem-sucedido!");
					} else {
						JOptionPane.showMessageDialog(null, "Login ou senha inválidos", "Erro",
								JOptionPane.ERROR_MESSAGE);
					}
				} catch (SQLException ex) {
					JOptionPane.showMessageDialog(null, "Erro ao validar login: " + ex.getMessage(), "Erro",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroUsuario telaCadastro = new TelaCadastroUsuario();
				telaCadastro.setVisible(true);
			}
		});

		buttonPanel.add(btnLogin);
		buttonPanel.add(btnCadastrar);

		panel.add(inputPanel, BorderLayout.CENTER);
		panel.add(buttonPanel, BorderLayout.SOUTH);

		add(panel);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			TelaLogin telaLogin = new TelaLogin();
			telaLogin.setVisible(true);
		});
	}
}
