package br.com.bytebank.polimorfismo.herdado.banco.conta.teste;

import br.com.bytebank.polimorfismo.herdado.banco.conta.modelo.Conta;
import br.com.bytebank.polimorfismo.herdado.banco.conta.modelo.ContaCorrente;
import br.com.bytebank.polimorfismo.herdado.banco.conta.modelo.GuardadorDeContas;
import br.com.bytebank.polimorfismo.herdado.banco.conta.modelo.GuardadorDeReferencias;

public class TesteGuardadorDeReferencias {
    public static void main(String[] args) {

        GuardadorDeReferencias guardadorDeReferencias = new GuardadorDeReferencias();

        Conta cc = new ContaCorrente(22,11);
        guardadorDeReferencias.adiciona(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        guardadorDeReferencias.adiciona(cc2);

        int tamanho = guardadorDeReferencias.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = (Conta) guardadorDeReferencias.getReferencia(0);
        System.out.println(ref.getNumero());
    }
}
