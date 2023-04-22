package br.com.bytebank.polimorfismo.herdado.banco.conta.teste.util;

import br.com.bytebank.polimorfismo.herdado.banco.conta.modelo.Conta;
import br.com.bytebank.polimorfismo.herdado.banco.conta.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


public class TesteArrayListEquals {
    public static void main(String[] args) {

//        List<Conta> lista = new ArrayList<Conta>(); // usa array por baixo
//        List<Conta> lista = new LinkedList<Conta>(); // lista linkada
//        List<Conta> lista = new Vector<Conta>(); // usa array por baixo, mas tb é threadsafe

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
