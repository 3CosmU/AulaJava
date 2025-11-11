package com.entrada.app;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        // Declaração de Variavel
        String nome;
        String resultado;
        int idade;

        // Entrada de dados
        nome = JOptionPane.showInputDialog("Informe seu nome: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: ")); // Convertendo Int pra String
                                                                                      // usando Integer parseInt

        // validação if/else e ternario
        /*
         * if (idade >= 18) {
         * JOptionPane.showMessageDialog(null, nome + " É Maior de idade.");
         * } else {
         * JOptionPane.showMessageDialog(null, nome + " É menor de idade.");
         * }
         */

        resultado = (idade >= 18) ? " é maior de idade" : " é menor de idade";

        // Saida de dados/ saida de dado ternario
        JOptionPane.showMessageDialog(null, nome + " " + resultado + ".");

        /*
         * JOptionPane.showMessageDialog(null, "Seu nome é: " + nome);
         * JOptionPane.showMessageDialog(null, "Seu Sobre-nome é : " + sobreNome);
         */

    }
}
