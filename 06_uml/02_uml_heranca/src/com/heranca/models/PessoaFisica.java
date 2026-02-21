package com.heranca.models;

import java.time.LocalDate;

public class PessoaFisica extends Pessoa {

    public String nome;
    public String cpf;
    public LocalDate dataNascimento;

    public PessoaFisica(String nome, String cpf, LocalDate dataNascimento, String email, String telefone, long idPessoa) {
        super(email, telefone, idPessoa);  
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
        super.exibirDados();
    }
}