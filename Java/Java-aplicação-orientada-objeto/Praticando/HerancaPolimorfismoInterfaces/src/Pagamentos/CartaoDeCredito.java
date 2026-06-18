package Pagamentos;

public class CartaoDeCredito extends Pagamento{
    public CartaoDeCredito(double valor) {
        super(valor);
    }

    @Override
    double juros() {
        return getValor() * 0.03;
    }

    @Override
    void confirmarPagamento() {
        System.out.printf("\"O valor de %s foi concluído!\" Com taxa de (%.2f)\n", getValor(), juros());
    }
}
