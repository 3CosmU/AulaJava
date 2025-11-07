package com.heranca.models;

public class Pessoa {

    public String email;
    public String telefone;

    public Pessoa(String email, String telefone) {
        this.email = email;
        this.telefone = telefone;
    }

        //Metodo para exibir dados
        public void exibirDados( ){
            System.out.println("E-mail: " + this.email);
            System.out.println("Telefone: " + this.telefone);
        }
}
