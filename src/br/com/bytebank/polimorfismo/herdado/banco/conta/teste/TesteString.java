package br.com.bytebank.polimorfismo.herdado.banco.conta.teste;

public class TesteString {
    public static void main(String[] args) {

        String nome = "Mario"; //object literal
        String outro = new String("Alura"); // má prática

        String novo = outro.replace("A", "a");
        System.out.println(novo);

        String novo2 = nome.toLowerCase();
        System.out.println(novo2);

        char c = nome.charAt(3); // chhar i
        System.out.println(c);

        int pos = nome.indexOf("rio");
        System.out.println(pos);

        String sub = nome.substring(1);
        System.out.println(sub);

        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }
    }
}
