package com.heranca.models;

public class Pessoa {

    public long idPessoa;
    public String email;
    public String telefone;

    public Pessoa(String email, String telefone, long idPessoa) {
        this.email = email;
        this.telefone = telefone;
        this.idPessoa = idPessoa;
    }

    // Método para exibir dados
    public void exibirDados() {
        System.out.println("E-mail: " + this.email);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("ID Pessoa: " + this.idPessoa);
    }
}