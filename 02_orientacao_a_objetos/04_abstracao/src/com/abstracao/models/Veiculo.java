package com.abstracao.models;

abstract public class Veiculo {

    // Atributos
    public String fabricante;
    public String modelo;
    public String ano;
    public String cor;
    public String placa;

    // Contrutor
    public Veiculo(String fabricante, String modelo, String ano, String cor, String placa) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
    }

    // Contrutor vazio
    public Veiculo() {
    }

    // Metodo para exibir dados
    public void exibirDados() {
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Cor: " + this.cor);
        System.out.println("Placa: " + this.placa);
    }

}
