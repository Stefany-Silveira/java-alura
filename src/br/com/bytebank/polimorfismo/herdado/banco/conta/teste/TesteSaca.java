package br.com.bytebank.polimorfismo.herdado.banco.conta.teste;

import br.com.bytebank.polimorfismo.herdado.banco.conta.modelo.Conta;
import br.com.bytebank.polimorfismo.herdado.banco.conta.modelo.ContaCorrente;
import br.com.bytebank.polimorfismo.herdado.banco.conta.modelo.SaldoInsuficienteException;

public class TesteSaca {
    public static void main(String[] args) {

        Conta conta = new ContaCorrente(123, 321);
        conta.deposita(200.0);

        try {
            conta.saca(210.0);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Exception: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println(conta.getSaldo());
    }
}
