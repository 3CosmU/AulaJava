package com.combustivel.app;

import javax.swing.JOptionPane;

import com.combustivel.models.Combustivel;

public class App {
    public static void main(String[] args) throws Exception {
        // Instancia
        Combustivel combustivel = new Combustivel();

        // Array
        String[] opcoes = { "Informar valores", "Sair do programa" };
        Object opcao; // Variavel

        // Laço de repetição
        do {

            // Entrada de dados
            opcao = JOptionPane.showInputDialog(
                    null,
                    "Selecione uma opção", // Texto na box
                    "Combustivel", // Titulo da box
                    JOptionPane.INFORMATION_MESSAGE, // Icon da box
                    null,
                    opcoes, // Array
                    opcoes[0]);

            if (opcao != "Sair do programa") {
                // Entrada de dados
                combustivel.setGasolina(
                        Double.parseDouble(
                                JOptionPane.showInputDialog("Informe o valor da Gasolina: ").replace(",", ".")));
                combustivel.setEtanol(
                        Double.parseDouble(
                                JOptionPane.showInputDialog("Informe o valor do Etanol: ").replace(",", ".")));

                // Saida de dados
                JOptionPane.showMessageDialog(null, combustivel.calcularCombustivel());

            }

        } while (opcao != "Sair do programa");
    }
}

// O método replace é usado para substituir partes de uma string (ou caracteres
// específicos) por outro texto.

/*
 * Usamos Object quando:
 * Queremos armazenar valores de tipos diferentes na mesma variável ou coleção.
 * Ou quando queremos criar funções genéricas, que aceitam qualquer tipo de
 * objeto.
 */