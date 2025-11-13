package com.atividade05.models;

public class Imc {

    // Atributos
    private String nome;
    private String resultado;
    private double peso;
    private double altura;
    private double imc;

    // Construtor
    public Imc() {
    }

    // Getters e Setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResultado() {
        return this.resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getImc() {
        return this.imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    // Método para calcular IMC
    public void calcularImc() {
        this.imc = peso / Math.pow(altura, 2);

        if (imc < 18.5) {
            this.resultado = "Abaixo do peso";
        } else if (imc < 25) {
            this.resultado = "Peso ideal";
        } else if (imc < 30) {
            this.resultado = "Sobrepeso";
        } else if (imc < 35) {
            this.resultado = "Obesidade grau I";
        } else if (imc < 40) {
            this.resultado = "Obesidade grau II";
        } else {
            this.resultado = "Obesidade grau III";
        }
    }
}
