package com.atividade01.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Instancia java
        Scanner leia = new Scanner(System.in);

        // Variaveis
        String nome;
        String email;
        String data;
        String cpf;
        double telefone;

        System.out.println("Infome seu nome:");
        nome = leia.nextLine();
        System.out.println("Informe sua data de nascimento (AAAA-MM-DD):");
        data = leia.nextLine();
        System.out.println("Informe seu cpf:");
        cpf = leia.nextLine();
        System.out.println("Informe seu telefone :");
        telefone = leia.nextDouble();

        /* Limpeza de buffer */
        leia.nextLine();

        System.out.println("Informe seu email: ");
        email = leia.nextLine();

        // Saida de dados

        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + data);
        System.out.println("Cpf : " + cpf);
        System.out.println("email: " + email);
        System.out.println("Telefone: " + telefone);

        leia.close();
    }
}

// crie um programa que receba do usuario:
/*
 * nome
 * data de nascimento
 * cpf
 * E-mail
 * Telefone
 * Exiba os dados na tela
 */