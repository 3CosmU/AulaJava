package com.tremfantasma.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Instanciar a classe Scanner
        Scanner leia = new Scanner(System.in);

        // Variáveis
        String nome;
        int idade;
        double altura;

        // Entrada de dados
        System.out.print("Informe o nome: ");
        nome = leia.nextLine();

        System.out.print("Informe a idade: ");
        idade = leia.nextInt();

        System.out.print("Informe a altura (em metros): ");
        altura = leia.nextDouble();

        // Estrutura de decisão
        if (idade >= 18 && altura <= 1.50) {
            System.out.println(nome + " tem " + altura + "m e é maior de idade, mas a altura não corresponde");
        } else if (idade >= 18) {
            System.out.println(nome + " tem " + altura + "m e é maior de idade.");
        } else {
            System.out.println(nome + " tem " + idade + " anos e " + altura 
                    + "m. Sua idade e altura não correspondem aos critérios.");
        }

        // Fechar o Scanner
        leia.close();
    }
}
