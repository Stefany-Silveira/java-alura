package bytebank.polimorfismo;

public class Gerente extends FuncionarioAutenticavel {
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação do Gerente");
        return super.getBonificacao() + super.getSalario();
    }
}
