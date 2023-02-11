package bytebank.encapsulado;

public class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();
    private static int total = 0;

    public Conta() {
        System.out.println("Criando uma conta");
    }

    public Conta(int agencia, int numero) {
        total++;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100;
        System.out.println("Estou criando uma conta");
    }

    public Conta(double saldo, int agencia, int numero, Cliente titular) {
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (saldo >= valor) {
            saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return total;
    }
}
