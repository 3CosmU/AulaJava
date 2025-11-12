package com.objeto.app;

import javax.swing.JOptionPane;

import com.objeto.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {

        // Instanciando
        Pessoa usuario = new Pessoa();

        // Entrada de dados
        usuario.setNome(JOptionPane.showInputDialog("Informe seu nome: "));
        usuario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: ")));// Convertendo Int pra
                                                                                               // String usando Integer
                                                                                               // parseInt

        usuario.setCpf(JOptionPane.showInputDialog("Informe o Cpf: "));
        usuario.setEmail(JOptionPane.showInputDialog("Informe o Email: "));
        usuario.setTelefone(JOptionPane.showInputDialog("Informe o Telefone: "));

        // Saida de dados

        JOptionPane.showMessageDialog(null,
                "DADOS DO USUARIO: \nNome: " + usuario.getNome() +
                        "\nIdade: " + usuario.getIdade() +
                        "\nCPF: " + usuario.getCpf() +
                        "\nE-mail: " + usuario.getEmail() +
                        "\nTelefone: " + usuario.getTelefone());

    }
}
