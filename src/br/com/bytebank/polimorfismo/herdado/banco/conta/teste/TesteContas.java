package br.com.bytebank.polimorfismo.herdado.banco.conta.teste;

import br.com.bytebank.polimorfismo.herdado.banco.conta.modelo.ContaCorrente;
import br.com.bytebank.polimorfismo.herdado.banco.conta.modelo.ContaPoupanca;
import br.com.bytebank.polimorfismo.herdado.banco.conta.modelo.SaldoInsuficienteException;

public class TesteContas {
    public static void main(String[] args) throws SaldoInsuficienteException {

        ContaCorrente contaCorrente = new ContaCorrente(111, 111);
        contaCorrente.deposita(100.0);

        ContaPoupanca contaPoupanca = new ContaPoupanca(222, 222);
        contaPoupanca.deposita(200.0);

        contaCorrente.transfere(10.0, contaPoupanca);

        System.out.println("Conta Corrente " + contaCorrente.getSaldo());
        System.out.println("Conta Poupança " + contaPoupanca.getSaldo());
    }
}
