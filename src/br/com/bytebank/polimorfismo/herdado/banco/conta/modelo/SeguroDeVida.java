package br.com.bytebank.polimorfismo.herdado.banco.conta.modelo;

public class SeguroDeVida implements Tributavel {

    @Override
    public double getValorImposto() {
        return 0;
    }
}
