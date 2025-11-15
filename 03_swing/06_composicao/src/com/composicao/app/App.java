package com.composicao.app;

import javax.swing.JOptionPane;

import com.composicao.models.Pessoa;
import com.composicao.models.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {
        // Instanciar
        Pessoa motorista = new Pessoa();
        Veiculo carro = new Veiculo();

        // Entrada de dados do motorista
        motorista.setNome(JOptionPane.showInputDialog("Informe o nome do motorista "));
        motorista.setCpf(JOptionPane.showInputDialog("Informe o cpf do motorista: "));
        motorista.setTelefone(JOptionPane.showInputDialog("Informe o telefone do motorista"));

        // Entrada de dados do veiculo
        carro.setMarca(JOptionPane.showInputDialog("Informe a marca do carro:"));
        carro.setModelo(JOptionPane.showInputDialog("Informe o modelo do carro:"));
        carro.setAno(JOptionPane.showInputDialog("Informe o ano do carro:"));
        carro.setCor(JOptionPane.showInputDialog("Informe a cor do carro:"));
        carro.setPlaca(JOptionPane.showInputDialog("Informe a placa do carro:"));


        //Puxando os atributos da classe
        carro.setProprietario(motorista);

        //Saida de dados
        JOptionPane.showMessageDialog(
                null,
                "Marca :" + carro.getMarca() +
                        "\nModelo: " + carro.getModelo() +
                        "\nAno: " + carro.getAno() +
                        "\nCor: " + carro.getCor() +
                        "\nPlaca: " + carro.getPlaca() +
                        "\nDono do veiculo: " + carro.getProprietario().getNome() +
                        "\nCpf do dono do veiculo: " + carro.getProprietario().getCpf() +
                        "\n Telefone do dono do veiculo: " + carro.getProprietario().getTelefone()

        );

    }
}

// Cliente quer criar um programa de cadastro de motorista
/*   */