package br.com.bytebank.polimorfismo.herdado.banco.conta.modelo;

/**
 * @author Stefany Silveira
 * @version 0.1
 */
public class Cliente extends Conta {
    String nome;
    String cpf;
    String profissao;

    /**
     * Construtor para inicializar o objeto Conta a partir da agencia e numero
     *
     * @param agencia
     * @param numero
     */
    public Cliente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {

    }
}
