package com.atividade05.com;

import javax.swing.JOptionPane;
import com.atividade05.models.Imc;

public class App {
    public static void main(String[] args) throws Exception {

        // Instância da classe Imc
        Imc usuario = new Imc();

        // Array de opções do menu
        String[] opcoes = { "Calcular IMC", "Sair do programa" };
        Object opcao; // variável que vai armazenar a escolha

        // Laço principal
        do {
            // Exibição do menu com JOptionPane
            opcao = JOptionPane.showInputDialog(
                    null,
                    "Selecione uma opção:", // Texto na box
                    "CALCULADORA DE IMC", // Titulo da box
                    JOptionPane.INFORMATION_MESSAGE, // Icon da box
                    null,
                    opcoes,
                    opcoes[0]);

            // Se o usuário escolher "Calcular IMC"
            if (opcao == "Calcular IMC") {
                usuario.setNome(JOptionPane.showInputDialog("Informe seu nome: "));
                usuario.setPeso(Double.parseDouble(
                        JOptionPane.showInputDialog("Informe seu peso (kg): ").replace(",", ".")));
                usuario.setAltura(Double.parseDouble(
                        JOptionPane.showInputDialog("Informe sua altura (m): ").replace(",", ".")));

                usuario.calcularImc();

                // Exibir o resultado
                JOptionPane.showMessageDialog(null,
                        "Nome: " + usuario.getNome()
                                + "\nIMC: " + String.format("%.2f", usuario.getImc())
                                + "\nResultado: " + usuario.getResultado());
            }

        } while (opcao != "Sair do programa");

        // Saida de dados
        JOptionPane.showMessageDialog(null, "Sair do programa");
    }
}
