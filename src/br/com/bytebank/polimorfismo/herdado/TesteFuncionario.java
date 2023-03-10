package br.com.bytebank.polimorfismo.herdado;

public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario nico = new Funcionario();
        nico.setNome("Nico Steppat");
        nico.setCpf("111.222.333.44");
        nico.setSalario(2600.00);

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());

        //nico.salario = 3000.0;
       // System.out.println(nico.salario);
    }
}
