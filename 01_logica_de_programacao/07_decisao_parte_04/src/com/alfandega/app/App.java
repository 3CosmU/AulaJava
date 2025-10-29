package com.alfandega.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Instanciar a classe Scanner
        Scanner leia = new Scanner(System.in);

        // Variaveis
        String nome;
        String resultado;
        double valor;

        // entrada de dados
        System.out.print("Informe o nome do passageiro: ");
        nome = leia.nextLine();

        System.out.print("Informe o valor da Bagagem: ");
        valor = leia.nextDouble();
        
        // Verificar o valor

     /*   if (valor <= 1000) {
            System.out.println(nome + " O valor esta liberado!");
        } else {
            System.out.println(nome + " o valor não esta liberado!");
        } */

        //Modo ternario (?= If := Else)

        resultado = (valor <=1000) ?  " está Liberado." : " está retido!";

        //Mostrar resultado na tela
        System.out.println(nome + resultado);
        // fechar o close
        leia.close();

    }
}
