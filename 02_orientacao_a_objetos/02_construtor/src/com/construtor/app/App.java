package com.construtor.app;

import java.util.Scanner;
import com.construtor.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {

        // Instancias
        Scanner leia = new Scanner(System.in);
        Pessoa usuario = new Pessoa("", "", "", "", 0);

        // Entrada de dados

        System.out.println("Informe seu nome: ");
        usuario.nome = leia.nextLine();
        System.out.println("Informe seu cpf: ");
        usuario.cpf = leia.nextLine();
        System.out.println("Informe seu email: ");
        usuario.email = leia.nextLine();
        System.out.println("Informe seu telefone: ");
        usuario.telefone = leia.nextLine();
        System.out.println("Informe a idade: ");
        usuario.idade = leia.nextInt();

        // Saida de dados
        System.out.println(usuario.apresentar());

        // Fechar o objeto leia
        leia.close();

    }
}
