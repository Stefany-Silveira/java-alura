package br.com.sintaxe.basica;

public class TestaCondicional {
    public static void main(String[] args) {

        int idade = 20;int wuantidadePessoas = 3;
        boolean acompanhando = wuantidadePessoas >= 2;

        System.out.println("valor de acompanhando = " + acompanhando);
        if (idade >= 18 && acompanhando) {
            System.out.println("Seja bem vindo");
        } else {
            System.out.println("Infelizmente voce nao pode entrar");
        }
    }
}
