package com.objeto.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Instancias
        Scanner leia = new Scanner(System.in);
        Pessoa usuario = new Pessoa();

        // Entrada de dados
        System.out.println("Informe o nome: ");
        usuario.nome = leia.nextLine();
        System.out.println("Informe o cpf: ");
        usuario.cpf = leia.nextLine();
        System.out.println("Informe o email: ");
        usuario.email = leia.nextLine();
        System.out.println("Informe o idade: ");
        usuario.idade = leia.nextInt();
        System.out.println("Informe o altura em metros:  ");
        usuario.altura = leia.nextDouble();

        // Saida de dados
        usuario.exibirDados();

        // Fechar objeto leia
        leia.close();

    }
}

// Criar um objeto chamado usuário, esse objeto e baseado em uma classe chamado
// pessoa.

/*
 * usuarios informa os dados do objeto e o programa exibe os dados na tela.
 * nome
 * idade
 * altura
 * cpf
 */