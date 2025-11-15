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
        double valor;

        // Entrada de dados
        cc.setTitular(JOptionPane.showInputDialog("Informe o nome do titular da conta: "));
        cc.setCpf(JOptionPane.showInputDialog("Informe o Cpf da conta: "));
        
        do {

            opcao = JOptionPane.showInternalInputDialog(
                    null,
                    "Escolha a opção desejada",
                    null,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]);

            if (opcao == "Consultar dados") {
                JOptionPane.showMessageDialog(null, cc.consultarDados());
            } else if (opcao == "Depositar") {
                valor = Double.parseDouble(
                        JOptionPane.showInputDialog("Informe o valor do deposito em R$: ").replace(",", "."));
                JOptionPane.showMessageDialog(null, "Deposito efetuado com sucesso. \nValor do saldo: R$ "
                        + String.format("%.2f", cc.depositar(valor)));
            }

            else if (opcao == "Sacar") {
                valor = Double.parseDouble(
                        JOptionPane.showInputDialog(("Informe o valor do saque em R%: ")).replace(",", "."));
                if (cc.getSaldo() >= valor) {
                    JOptionPane.showMessageDialog(null,
                            "Saque efetuado com sucesso." +
                                    "\nValor do saldo: R$ " +
                                    String.format("%.2f", cc.sacar(valor)));
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Saldo Insuficiente" +
                                    "\nSaldo atual: R$" +
                                    String.format("%.2f", cc.getSaldo()));
                }

            }

        } while (opcao != "Sair");

    }
}

// Criar um app do banco,onde o usuario vai abrir e criar uma conta no banco,
// onde ele vai digitar nome e cpf, isso já vai dar o nome da agencia,nome da
// conta e o saldo, ira ter 3 operações basicas, consular saldo, sacar dinheiro
// e sair do programa.

// clase geralemnte tem 2 elementos, atributos e metos
// Interface só possui metodo