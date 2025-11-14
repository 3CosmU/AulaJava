package com.bank.app;

import javax.swing.JOptionPane;
import com.bank.models.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        // Instnacia
        Conta cc = new Conta(null,
                null,
                "1234-5",
                "12345-6",
                0.0);

        // Array / variavel
        String[] opcoes = { "Consultar dados",
                "Depositar",
                "Sacar",
                "Sair do programa" };

        Object opcao;

        // Entrada de dados
        cc.setTitular(JOptionPane.showInputDialog("Informe o nome do titular da conta: "));
        cc.setCpf(JOptionPane.showInputDialog("Informe o Cpf da conta: "));

        // TODO: Fazer o laço de repetição...

    }
}

// Criar um app do banco,onde o usuario vai abrir e criar uma conta no banco,
// onde ele vai digitar nome e cpf, isso já vai dar o nome da agencia,nome da
// conta e o saldo, ira ter 3 operações basicas, consular saldo, sacar dinheiro
// e sair do programa.

// clase geralemnte tem 2 elementos, atributos e metos
// Interface só possui metodo