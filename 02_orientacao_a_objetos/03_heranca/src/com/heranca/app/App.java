package com.heranca.app;

// classe java importada
import java.util.Scanner;

// classes criada pelo programador 
import com.heranca.models.PessoaFisica;
import com.heranca.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        // Instancia das classes
        Scanner leia = new Scanner(System.in);

        PessoaFisica usuario = new PessoaFisica(
                null,
                null,
                0,
                null,
                null);

        PessoaJuridica corp = new PessoaJuridica(
                null,
                null,
                null,
                null,
                null);

        // entrada de dados

        System.out.println("\nINFORME OS DADOS DO USUÁRIO\n");
        System.out.println("Informe o nome: ");
        usuario.nome = leia.nextLine();
        System.out.println("Informe o cpf: ");
        usuario.cpf = leia.nextLine();
        System.out.println("Informe o e-mail: ");
        usuario.email = leia.nextLine();
        System.out.println("Informe o telefone: ");
        usuario.telefone = leia.nextLine();
        System.out.println("Informe a idade: ");
        usuario.idade = leia.nextInt();

        // limpeza de buff
        leia.nextLine();

        // Entrada de dados da empresa
        System.out.println("================================================");
        System.out.println("\nINFORME OS DADOS DA EMPRESA\n");
        System.out.println("Infome o nome da empresa: ");
        corp.nomeFantasia = leia.nextLine();
        System.out.println("Infome a razão social: ");
        corp.razaoSocial = leia.nextLine();
        System.out.println("Infome o cnpj: ");
        corp.cnpj = leia.nextLine();
        System.out.println("Infome o email: ");
        corp.email = leia.nextLine();
        System.out.println("Infome o telefone: ");
        corp.telefone = leia.nextLine();

        // Saida de dados
        System.out.println("================================================");
        System.out.println("\nDADOS DO USUARIO\n");
        usuario.exibirDados();
        System.out.println("\nDADOS DA EMPRESA\n");
        System.out.println("================================================");
        corp.exibirDados();

        // fechar objeto leia
        leia.close();
    }
}
