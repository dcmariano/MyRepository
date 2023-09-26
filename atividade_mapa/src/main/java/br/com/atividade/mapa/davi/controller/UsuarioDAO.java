package br.com.atividade.mapa.davi.controller;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.atividade.mapa.davi.model.Usuario;

public class UsuarioDAO {
    public static void cadastrarUsuario(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO usuario (nome, login, senha, email) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConexaoDB.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getLogin());
            stmt.setString(3, usuario.getSenha());
            stmt.setString(4, usuario.getEmail());

            stmt.executeUpdate();
        }
    }

    public static boolean validarLogin(String login, String senha) throws SQLException {
        String sql = "SELECT * FROM usuario WHERE login = ? AND senha = ?";

        try (Connection conn = ConexaoDB.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, login);
            stmt.setString(2, senha);

            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next();
            }
        }
    }
}


