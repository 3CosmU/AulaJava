package com.calculaora.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Instancia a classe Scanner
        Scanner leia = new Scanner(System.in);

        // variaveis
        double x;
        double y;
        double resultado;
        String operador;

        //Entrada de dados
        System.out.println("Informe o valor de x: ");
        x = leia.nextDouble();
        System.out.println(" Informe o valor de Y: ");
        y = leia.nextDouble();

        leia.nextLine();

        // Menu
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        operador = leia.nextLine();

        switch (operador) {
            case "1":
                resultado = x + y;
                System.out.println("valor da soma: " + resultado);
                break;
            case "2":
                resultado = x - y;
                System.out.println("valor da Subitração: " + resultado);
                break;
            case "3":
                resultado = x * y;
                System.out.println("valor da Multiplicação: " + resultado);
                break;
            case "4":
                resultado = x / y;
                System.out.println("valor da Divisão: " + resultado);
                break;
            default:
                System.out.println("Operação invalida! ");

        }

        // fechar objeto leia
        leia.close();
    }
}
