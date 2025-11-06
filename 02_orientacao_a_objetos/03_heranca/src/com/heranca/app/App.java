package com.heranca.app;

//import com.heranca.models.Pessoa;
import com.heranca.models.PessoaFisica;
import com.heranca.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        // Instancias
        PessoaFisica usuario = new PessoaFisica();
        PessoaJuridica empresa = new PessoaJuridica();

        usuario.nome = "Wagner Moreira";
        usuario.cpf = " 048.874.471-75";
        usuario.email = "Wagner@gmail.com";
        usuario.telefone = "(61)98164-2148";
        usuario.idade = 35;

        empresa.razaoSocial = "Wagner ltda desenvolvimento";
        empresa.nomeFantasia = "CosmU Dev ";
        empresa.cnpj = "1333314.111142/00001";
        empresa.email = "CosmuDev@gmail.com";
        empresa.telefone = "(61) 98441-2774";

        System.out.println("E-mail do usuário: " + usuario.email);
        System.out.println("Telefone do usuário: " + usuario.telefone);
        System.out.println("Nome do usuário: " + usuario.nome);
        System.out.println("Cpf do usuário: " + usuario.cpf);
        System.out.println("Idade do usuário: " + usuario.idade + " anos.");
        System.out.println("\n====================================\n");
        System.out.println("Razao Social da Empresa: " + empresa.razaoSocial);
        System.out.println("Nome fantasia da empresa: " + empresa.nomeFantasia);
        System.out.println("Cnpj da empresa: " + empresa.cnpj);
        System.out.println("E-mail da empresa: " + empresa.email);
        System.out.println("Telefone da empresa: " + empresa.telefone);


    }
}
