package br.com.bytebank.polimorfismo.herdado.banco.conta.modelo;

import br.com.bytebank.polimorfismo.herdado.banco.conta.teste.Tributavel;

public class SeguroDeVida implements Tributavel {

    @Override
    public double getValorImposto() {
        return 0;
    }
}
