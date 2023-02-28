package bytebank.polimorfismo;

public class Administrador extends FuncionarioAutenticavel {
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public double getBonificacao() {
        return 50;
    }

}
