package com.atividade01.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Instancia java
        Scanner leia = new Scanner(System.in);

        // declaração de variaveis
        String nome;
        String dataNasc;
        String cpf;
        String email;
        String telefone;

        System.out.println("Infome seu nome:");
        nome = leia.nextLine();
        System.out.println("Informe sua data de nascimento (AAAA-MM-DD):");
        dataNasc = leia.nextLine();
        System.out.println("Informe seu cpf:");
        cpf = leia.nextLine();
        System.out.println("Informe seu email: ");
        email = leia.nextLine();
        System.out.println("Informe seu telefone :");
        telefone = leia.nextLine();

        // Saida de dados

        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNasc);
        System.out.println("Cpf : " + cpf);
        System.out.println("email: " + email);
        System.out.println("Telefone: " + telefone);

        // Fechar objeto Leia
        leia.close();
    }
}

// TODO -
// crie um programa que receba do usuario:
/*
 * nome
 * data de nascimento
 * cpf
 * E-mail
 * Telefone
 * Exiba os dados na tela
 */