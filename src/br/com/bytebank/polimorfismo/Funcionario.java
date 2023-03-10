package br.com.bytebank.polimorfismo;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    //método sem corpo, nao há implementacao
    public double getBonificacao() {
        return 0;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
