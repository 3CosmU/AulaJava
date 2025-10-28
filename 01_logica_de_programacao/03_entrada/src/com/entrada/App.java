package com.entrada.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /* Instancia do objeto leia */
        Scanner leia = new Scanner(System.in);

        /* Declaração de variaveis */
        String nome;
        String email;
        int idade;
        double altura;
        

        /* Entrada de dados */
       
        System.out.println("Infome seu nome:");
        nome = leia.nextLine();
        System.out.println("Informe sua idade:");
        idade = leia.nextInt();
        System.out.println("Informe sua Altura:");
        altura = leia.nextDouble();

        /* Limpeza de buffer */
        leia.nextLine();
        
         System.out.println("Informe seu email: ");
        email = leia.nextLine();
        

        /* Saida de dados */
        System.out.println("nome: " + nome);
        System.out.println("nome: " + idade);
        System.out.println("nome: " + altura + " M");
        System.out.println("email: " + email);  

        /* fechar objeto close */
        leia.close();
    }
}
