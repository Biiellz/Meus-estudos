package Pagamentos;

public class Main {
    static void main(String[] args) {
        Pix pix = new Pix(1000);
        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito(1000);
        Boleto boleto = new Boleto(1000);

        pix.confirmarPagamento();
        cartaoDeCredito.confirmarPagamento();
        boleto.confirmarPagamento();
    }
}
