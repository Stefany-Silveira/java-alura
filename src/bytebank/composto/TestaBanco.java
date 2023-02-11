package bytebank.composto;

public class TestaBanco {
    public static void main(String[] args) {

        Cliente paulo = new Cliente();
        paulo.nome = "Paulo Silveira";
        paulo.cpf = "222.333.444.55";
        paulo.profissao = "Programador";

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(100);

        //associa o clinete paulo a conta contaDoPaulo
        contaDoPaulo.titular = paulo;
        System.out.println(contaDoPaulo.titular.nome);
    }
}
