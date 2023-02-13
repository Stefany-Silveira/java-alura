package bytebank;

public class CriaConta {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println("O saldo da conta é: " + primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;
        System.out.println("O saldo da primeiro conta é: " + primeiraConta.saldo);
        System.out.println("O saldo da segunda conta é: " + segundaConta.saldo);


    }
}
