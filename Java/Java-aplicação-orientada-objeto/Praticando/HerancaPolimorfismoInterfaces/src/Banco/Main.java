package Banco;

public class Main {
    static void main(String[] args) {
        OperacaoBancaria deposito = new Deposito(50.67);
        OperacaoBancaria saque = new Saque(199.99);

        deposito.executar();
        saque.executar();
    }
}
