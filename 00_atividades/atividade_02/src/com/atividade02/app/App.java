package com.atividade02.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Instancia o Scanner
        Scanner leia = new Scanner(System.in);

        // Declaração de variavel
        double a;
        double b;
        double x;

        System.out.println("Informe o valor de 'A':");
        a = leia.nextDouble();
        System.out.println("Informe o valor de 'B':");
        b = leia.nextDouble();

        // calculando equação o 1º grau ( a*x + b = 0)
        if (a != 0) {
            x = -b / a;
            System.out.println("X = " + x);
        } else {
            System.out.println("Não existe raiz real.");
        }

        // Fechar o closer
        leia.close();
    }
}

// atividade 02
/*
 * Crie um programa que calcule a equação do 1º.
 */
