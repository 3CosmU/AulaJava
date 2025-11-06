package com.construtor.models;

public class Pessoa {

    // Atributos
    public String nome;
    public String cpf;
    public String email;
    public String telefone;
    public int idade;

    // Construtor
    public Pessoa(String nome, String cpf, String email, String telefone, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.idade = idade;
    }

    // Metodo retornando valor
    public String apresentar() {
        return "Ola, meu nome é " + this.nome + ", tenho " + this.idade + " anos, meu e-mail é " + this.email
                + ", meu telefone é " + this.telefone + " e meu CPF é " + this.cpf + ".";

    }

}
