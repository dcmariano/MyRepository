package br.com.atividade.mapa.davi.application;

import javax.swing.SwingUtilities;

import br.com.atividade.mapa.davi.view.TelaLogin;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaLogin telaLogin = new TelaLogin();
            telaLogin.setVisible(true);
        });
    }
}

