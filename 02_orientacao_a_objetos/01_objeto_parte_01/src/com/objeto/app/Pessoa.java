package com.objeto.app;

public class Pessoa {

    // atributos
    public String nome;
    public String cpf;
    public String email;
    public int idade;
    public double altura;

    // métodos
    public void exibirDados() {
        System.out.println("\nDADOS DO USUÁRIO: \n");
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Email: " + this.email);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura + " M");
    }
}
