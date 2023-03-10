package br.com.bytebank.polimorfismo.herdado.banco.conta.teste;

import br.com.bytebank.polimorfismo.herdado.banco.conta.modelo.CalculadorDeImposto;
import br.com.bytebank.polimorfismo.herdado.banco.conta.modelo.ContaCorrente;
import br.com.bytebank.polimorfismo.herdado.banco.conta.modelo.SeguroDeVida;

public class TesteTributaveis {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(222, 333);
        contaCorrente.deposita(100.0);

        SeguroDeVida seguroDeVida = new SeguroDeVida();

        CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();

        calculadorDeImposto.registra(contaCorrente);
        calculadorDeImposto.registra(seguroDeVida);

        System.out.println(calculadorDeImposto.getTotalImposto());
    }
}
