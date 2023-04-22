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

    public Cliente() {
        super();
    }


    @Override
    public void deposita(double valor) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
