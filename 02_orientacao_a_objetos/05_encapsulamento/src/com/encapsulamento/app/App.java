package com.encapsulamento.app;

import com.encapsulamento.models.Pessoa;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Instancia
        Scanner leia = new Scanner(System.in);
        Pessoa usuario = new Pessoa();

        // Atribuição de dados
        /*
         * usuario.setNome("Wagner Moreira");
         * usuario.setEmail("wagnercosmu@gmail.com");
         * usuario.setCpf("123.456.789.10");
         * usuario.setIdade(35);
         */

        // Entada de dados
        System.out.println("Informe seu nome: ");
        usuario.setNome(leia.nextLine());
        System.out.println("Informe seu email: ");
        usuario.setEmail(leia.nextLine());
        System.out.println("Informe seu Cpf: ");
        usuario.setCpf(leia.nextLine());
        System.out.println("Informe sua idade: ");
        usuario.setIdade(leia.nextInt());

        // Saida de dados

        System.out.println("============================================");
        System.out.println("DADOS DO USUÁRIO");
        System.out.println("============================================");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("Cpf: " + usuario.getCpf());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("""
                            OOO   K   K
                           O   O  K  K
                           O   O  KKK
                           O   O  K  K
                            OOO   K   K
                """);

        // Fechar objeto
        leia.close();
    }
}

/*
 * Modificadores de acesso principais
 * public= Em qualquer lugar
 * private= Somente dentro da própria classe
 * protected= Na mesma classe, pacote e subclasses
 * Package private (default)= Apenas dentro do mesmo pacote
 */

/* Get/SET
 * Set = Recebe os dados
 * Get = Emite os dados
 */