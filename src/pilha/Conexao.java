package pilha;

public class Conexao implements AutoCloseable {

    public Conexao() {
        System.out.println("Abrindo a conexão");
    }

    public void leDados() {
        System.out.println("Recebendo os dados");
        throw new IllegalStateException();
    }

    @Override
    public void close() throws Exception {
        System.out.println("Fechando a conexão");
    }
}
