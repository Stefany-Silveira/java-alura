package pilha;

public class TestaConexao {
    public static void main(String[] args) throws Exception {

        try (Conexao conexao = new Conexao()) {
            conexao.leDados();
        } catch (IllegalStateException e) {
            System.out.println("Deu erro na conexão");
        }

//        Conexao conexao = null;
//        try {
//            conexao = new Conexao();
//            conexao.leDados();
//            conexao.fecha();
//        } catch (IllegalStateException e) {
//            System.out.println("Deu erro na conexão");
//        } finally {
//            conexao.fecha();
//        }
    }
}
