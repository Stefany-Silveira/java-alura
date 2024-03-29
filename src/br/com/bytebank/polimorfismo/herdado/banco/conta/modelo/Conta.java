package br.com.bytebank.polimorfismo.herdado.banco.conta.modelo;

import java.util.Comparator;

/**
 * Classe que representa um cliente no ByteBank
 *
 * @author Stefany Silveira
 * @version 0.1
 */
public abstract class Conta implements Comparable<Conta> {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    /**
     * Construtor para inicializar o objeto Conta a partir da agencia e numero
     * @param agencia
     * @param numero
     */
    public Conta(int agencia, int numero) {
        if (agencia < 1) {
            throw new IllegalArgumentException("Agencia inválida");
        }
        if (numero < 1) {
            throw new IllegalArgumentException("Número da conta inválido");
        }

        Conta.total++;
        //System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //this.saldo = 100;
        //System.out.println("Estou criando uma conta " + this.numero);
    }

    public Conta() {

    }

    public abstract void deposita(double valor);

    /**
     * Valo precisa ser menor ou igual ao saldo
     * @param valor
     * @throws SaldoInsuficienteException
     */
    public void saca(double valor) throws SaldoInsuficienteException {
        if (this.saldo < valor) {

            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        }
            this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
            destino.deposita(valor);
    }

    @Override
    public int compareTo(Conta outra) {
        return Double.compare(this.saldo, outra.saldo);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Não pode valor menos igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Não pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }

    @Override
    public String toString() {
        return "Número: " + this.numero +
                ", Agencia:" + agencia;
    }

    @Override
    public boolean equals(Object ref) {

        Conta outra = (Conta) ref;

        if (this.agencia != outra.agencia) {
            return  false;
        }

        if (this.numero != outra.numero) {
            return false;
        }

        return true;
    }
}

