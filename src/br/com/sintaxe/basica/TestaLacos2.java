package br.com.sintaxe.basica;

public class TestaLacos2 {
    public static void main(String[] args) {
        for (int linha = 0; linha < 10; linha++) {
            for (int conluna = 0; conluna <= linha; conluna++) {
                System.out.println("*");
            }
            System.out.println("*");
        }
    }
}
