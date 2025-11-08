package com.abstracao.app;

import java.util.Scanner;

import com.abstracao.models.Carro;
import com.abstracao.models.Moto;

public class App {
    public static void main(String[] args) throws Exception {

        // Instanciar objeto de entrada de dados
        Scanner leia = new Scanner(System.in);

        // Instancia as classes
        Carro carro = new Carro();
        Moto moto = new Moto();

        // declaração de variavel
        String combustivel;

        // entrada de dados
        System.out.println("\nINFORME OS DADOS DO CARRO\n");
        System.out.println("=================================");

        System.out.println("Informe o fabricante: ");
        carro.fabricante = leia.nextLine();
        System.out.println("Informe modelo do carro: ");
        carro.modelo = leia.nextLine();
        System.out.println("Informe o ano: ");
        carro.ano = leia.nextLine();
        System.out.println("Informe a cor: ");
        carro.cor = leia.nextLine();
        System.out.println("Informe a placa: ");
        carro.placa = leia.nextLine();

        // padrao de combustivel
        carro.motorFlex = false;
        carro.motorEletrico = false;
        carro.motorDiesel = false;
        carro.motorGasolina = false;
        carro.motorEtanol = false;

        // usuario informa o tipo de combustivel
        System.out.println("=================================");
        System.out.println("\nINFORME O TIPO DE COMBISTUVEL\n");
        System.out.println("=================================");
        System.out.println("1 - Gasolina ");
        System.out.println("2 - Etanol");
        System.out.println("3 - Tanto Gasolinha como Etanol");
        System.out.println("4 - Diesel");
        System.out.println("5 - Eletrico");
       
        
        combustivel = leia.nextLine(); // Passando a variavel

        switch (combustivel) {
            case "1":
            carro.motorGasolina = true;
                break;
            case "2":
                carro.motorEtanol = true;
                break;
            case "3":
                carro.motorFlex = true;
                break;
            case "4":
                carro.motorDiesel = true;
                break;
            case "5":
                carro.motorEletrico = true;
                break;
            default:
                System.out.println("Motor inexistente.");

        }

        // entrada de dados do moto
        System.out.println("\nINFORME OS DADOS DA MOTO\n");
        System.out.println("=================================");

        System.out.println("Informe o fabricante: ");
        moto.fabricante = leia.nextLine();
        System.out.println("Informe modelo da moto: ");
        moto.modelo = leia.nextLine();
        System.out.println("Informe o ano: ");
        moto.ano = leia.nextLine();
        System.out.println("Informe a cor: ");
        moto.cor = leia.nextLine();
        System.out.println("Informe a placa: ");
               moto.placa = leia.nextLine();

        // exibir dados

        System.out.println("\nDADOS DO CARRO\n");
        carro.exibirDados();
          System.out.println("  ______");
        System.out.println(" /|_||_|\\\\");
        System.out.println("( o_o_o_o )");
        System.out.println("`-@----@-'");
        
        System.out.println("\nDADOS DO MOTOR\n");
        moto.exibirDados();
          System.out.println("      __O");
        System.out.println("    _ \\<,_");
        System.out.println("  _(_)/_(_)");
        System.out.println(" (   \\ | / )");
        System.out.println("  `--^` ^--'");

        // Fechar o objeto leia
        leia.close();
    }
}
