package br.com.bytebank.polimorfismo.herdado.banco.conta.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
    public static void main(String[] args) {

        Integer idadeRef = 29; //autoboxing, é criado um objeto do tipo Integer
        int primitivo = new Integer(21); //unboxing

        List<Integer> lista = new ArrayList<>();
        lista.add(idadeRef); //autoboxing
        lista.add(primitivo); //autoboxing

        int i1 = lista.get(0); //unboxing
        Integer i2 = lista.get(1); //ok

        System.out.println(i1);
        System.out.println(i2);

        System.out.println("--------------------");

        Integer valorRef = Integer.valueOf(33) ; //autoboxing, delegando a criaçao para método valueOf
        int valorPri = valorRef.intValue(); //unboxing, desembrulhando, pegando o valor primitivo do objeto wapper

        System.out.println(valorPri); //33

        System.out.println("--------------------");

        Integer iParseado1 = Integer.valueOf("42"); //autoboxing, parseando e devolcendo referencia
        int iParseado2 = Integer.parseInt("44"); //parseando e devolvendo primitivo

        System.out.println(iParseado1); //42
        System.out.println(iParseado2); //44

        System.out.println("--------------------");

        System.out.println(Integer.MAX_VALUE); //2^31 - 1
        System.out.println(Integer.MIN_VALUE); //-2^31

        System.out.println(Integer.SIZE); //32 bits
        System.out.println(Integer.BYTES); //4 bytes

    }
}
