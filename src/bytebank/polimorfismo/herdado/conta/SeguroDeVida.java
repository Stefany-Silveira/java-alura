package bytebank.polimorfismo.herdado.conta;

public class SeguroDeVida implements Tributavel {

    @Override
    public double getValorImposto() {
        return 0;
    }
}
