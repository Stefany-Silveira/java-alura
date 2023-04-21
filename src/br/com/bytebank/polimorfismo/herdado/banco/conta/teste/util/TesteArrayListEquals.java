package br.com.bytebank.polimorfismo.herdado.banco.conta.teste.util;

import br.com.bytebank.polimorfismo.herdado.banco.conta.modelo.Conta;
import br.com.bytebank.polimorfismo.herdado.banco.conta.modelo.ContaCorrente;

import java.util.ArrayList;


public class TesteArrayListEquals {
    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<Conta>();



        Conta cc1 = new ContaCorrente(22, 11);
        Conta cc2 = new ContaCorrente(22, 22);

        lista.add(cc1);

//        boolean existe = lista.contains(cc2);
//        System.out.println("Já existe? " + existe);

        boolean igual = cc1.equals(cc2);
        System.out.println(igual);

        for (Conta conta : lista) {
            System.out.println(conta);
        }
    }
}
