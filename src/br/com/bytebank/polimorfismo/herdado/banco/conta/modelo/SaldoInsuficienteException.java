package br.com.bytebank.polimorfismo.herdado.banco.conta.modelo;

public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException(String msg) {
        super(msg);
    }
}
