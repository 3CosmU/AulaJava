package com.media.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leia = new Scanner(System.in);

        // Declaração de variaveis
        String nome;
        double nota;

        // Input(entradas) de dados
        System.out.print("Informe o nome: ");
        nome = leia.nextLine();

        System.out.print("Informe a  nota do aluno de 0 a 10: ");
        nota = leia.nextDouble();

        // Verifica se a nota é válida

        if (nota >= 0 && nota <= 10) {
            if (nota >= 7) {
                System.out.println(nome + " está aprovado.");
            } else if (nota >= 5) {
                System.out.println(nome + "está de recuperação");
            } else {
                System.out.println(nome + " está reprovado");
            }
        }
        else {
            System.out.println("Nota inválida!");
        }

        // informe o leia
        leia.close();

    }
}
