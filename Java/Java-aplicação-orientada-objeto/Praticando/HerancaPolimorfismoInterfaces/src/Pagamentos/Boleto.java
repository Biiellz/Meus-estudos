package Pagamentos;

public class Boleto extends Pagamento{
    public Boleto(double valor) {
        super(valor);
    }

    @Override
    double juros() {
        return getValor() * 0.01;
    }

    @Override
    void confirmarPagamento() {
        System.out.printf("\"O valor de %s foi concluído!\" Com taxa de (%.2f)\n", getValor(), juros());
    }
}
