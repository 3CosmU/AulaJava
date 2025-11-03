package com.lista.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Instancias
        Scanner leia = new Scanner(System.in); // Scanner
        String[] nomes = new String[10]; // Array

        // Entrada de dados

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º nome: ");
            nomes[i] = leia.nextLine();
        }

        // Saida de dados
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Fechar objeto leia
        leia.close();
    }
}

// HISTORIA = cliente quer que crie um programa que receba do usuario uma lista
// de 10 nomes e imprima esses 10 nomes na tela.

// Array é basicamente uma variavel que consegue guardar mais de um dado na
// mesma variavel