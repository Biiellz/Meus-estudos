package Pagamentos;

public class Pix extends Pagamento{
    public Pix(double valor) {
        super(valor);
    }

    @Override
    void confirmarPagamento() {
        System.out.printf("\"O valor de %s foi concluído!\" Sem taxas\n", getValor());
    }
}
