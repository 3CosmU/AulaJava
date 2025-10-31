package com.contador.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Instancia o Scanner
        Scanner leia = new Scanner(System.in);

        // Variavel
        int n;

        // Entrada de dados
        System.out.println("Informe um numero inteiro: ");
        n = leia.nextInt();

        // Loop (Laço de repetição)

        while (n >= 0) {
            System.out.println(n);
            n--; // decremeta o valor

        }

        // fechar o objeto leia
        leia.close();
    }
}
