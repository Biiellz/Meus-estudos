package Pagamentos;

public class Pagamento {
    private double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    void confirmarPagamento(){
        System.out.printf("O valor de %s foi concluído!");
    }

    double juros(){
        return valor * 0.0;
    }
}
