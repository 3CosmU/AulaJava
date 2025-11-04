package com.atividade03.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Instanciando o Scanner
        Scanner leia = new Scanner(System.in);

        // Declaração de variaveis
        String nome;
        String resultado;
        double peso;
        double altura;
        double imc;

        // Entrada de dados
        System.out.println("Informe o nome: ");
        nome = leia.nextLine();
        System.out.println("Informe o peso em KG: ");
        peso = leia.nextDouble();
        System.out.println("Informe a altura: ");
        altura = leia.nextDouble();

        // calcule o Imc (Aqui significa “altura elevado a 2” (ou seja, altura²).)
        imc = peso / Math.pow(altura, 2);

        // exibe o imc na tela
        System.out.println(nome + ", seu IMC é " + String.format("%.2f", imc) + "."); // String.format faz com que o
                                                                                      // valor do imc seja exibido com 2
                                                                                      // casas decimas

        // Exibe o Diagnóstico (Operador ternário)
        resultado = (imc < 18.5) ? " Abaixo do peso"
                : (imc < 25) ? " Peso ideal"
                        : (imc < 30) ? " Sobrepeso "
                                : (imc < 35) ? " Obesidade nivel 1"
                                        : (imc < 40) ? " Obesidade nivel 2"
                                                : "  Obesidade nivel 3 (mórbida)";

        // Exibe o diagnóstico com if e else if

        if (imc < 18.5) {
            resultado = "Abaixo do peso";
        } else if (imc < 25) {
            resultado = "Peso ideal";
        } else if (imc < 30) {
            resultado = "Sobrepeso";
        } else if (imc < 35) {
            resultado = "Obesidade nível 1";
        } else if (imc < 40) {
            resultado = "Obesidade nível 2";
        } else {
            resultado = "Obesidade nível 3 (mórbida)";
        }

        // Exibir resultado

        System.out.println(nome + resultado + ".");

        // Fecha o objeto leia
        leia.close();
    }
}

// TODO: atividade 03
/*
 * Crie um programa que receba do usuário:
 * - Nome
 * - Peso em kg
 * - Altura em metros
 * E depois, calcule e exiba na tela o IMC.
 * Exiba o diagnóstico de acordo com a tabela do IMC.
 */
