package com.novacalculadora.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Instancia o Scanner
        Scanner leia = new Scanner(System.in);

        // Variavel
        double x;
        double y;
        double resultado = 0.0;
        String operacao;
        int opcao = 0;

        // Entrada de dados

        // FIXME: loop (Laço de repetição)
        do {

            // Menu
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Resto da divisão");
            System.out.println("6 - Potência");
            System.out.println("7 - Sair do programa");
            System.out.println("Informe a opção desejada: ");
            operacao = leia.nextLine();

            if (operacao != "7") {

                // Entrada de dados
                System.out.println("Informe o valor de x: ");
                x = leia.nextDouble();
                System.out.println("Informe o valor de y: ");
                y = leia.nextDouble();

                switch (operacao) {
                    case "1":
                        resultado = x + y;
                        break;
                    case "2":
                        resultado = x - y;
                        break;
                    case "3":
                        resultado = x * y;
                        break;
                    case "4":
                        resultado = x / y;
                        break;
                    case "5":
                        resultado = x % y;
                        break;
                    case "6":
                        resultado = Math.pow(x, y);
                        break;
                    default:
                        System.out.println("Operador inválido.");

                }
                // Mostrar resultado

                System.out.println("Resultado: " + resultado);
            }

            else {
                opcao = Integer.parseInt(operacao);
            }

            // Limpeza de buff
            leia.nextLine();

        } while (opcao != 7);

        // Fecha o objeto leia
        leia.close();
    }
}
