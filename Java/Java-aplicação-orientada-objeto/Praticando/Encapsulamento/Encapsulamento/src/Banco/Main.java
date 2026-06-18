package Banco;

public class Main {
    static void main(String[] args) {

        Conta conta1 = new Conta("Gabriel", 2987);
        conta1.sacar(120);
        conta1.depositar(5000);
        conta1.exibirSaldo();
    }
}
