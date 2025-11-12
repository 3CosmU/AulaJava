package com.combustivel.models;

public class Combustivel {

    // Atributos
    private double gasolina;
    private double etanol;

    // Construtor vazio
    public Combustivel() {
    }

    // Getters/Setters
    public double getGasolina() {
        return this.gasolina;
    }

    public void setGasolina(double gasolina) {
        this.gasolina = gasolina;
    }

    public double getEtanol() {
        return this.etanol;
    }

    public void setEtanol(double etanol) {
        this.etanol = etanol;
    }

    // metodo saida do input

    // Ternario
 /*    public String calcularCombustivel() {
        return (this.etanol >= this.gasolina * 0.7) ? "Melhor abastecer com gasolina." : "Melhor abastecer com Etanol.";
    } */

    // If/else
    public String calcularCombustivel() {
        if (this.etanol >= this.gasolina * 0.7) {
            return "Melhor abastecer com gasolina.";
        } else {
            return "Melhor abastecer com etanol.";
        }
    }

}
