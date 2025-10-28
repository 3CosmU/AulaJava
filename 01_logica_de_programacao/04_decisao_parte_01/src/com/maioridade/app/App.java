package com.maioridade.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leia = new Scanner(System.in);

        /* Declaração de variavel */

        String nome;
        int idade;

        /* entrada de dados */
        System.out.println("Infome o nome: ");
        nome = leia.nextLine();
        System.out.println("infome a idade: ");
        idade = leia.nextInt();

        /* Estrutura de decisão */
        if (idade >= 18) {
            System.out.println(nome + " é maior de idade.");
        } else {
            System.out.println(idade + " é menor de idade");
        }
        /* fecha objeto leia */ 
        leia.close();
    }
}
