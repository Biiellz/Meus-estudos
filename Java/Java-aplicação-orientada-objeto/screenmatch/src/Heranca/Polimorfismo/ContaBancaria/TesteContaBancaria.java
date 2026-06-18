package Praticando.Heranca.Polimorfismo.ContaBancaria;

public class TesteContaBancaria {
    static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();

        conta1.depositar(2000);
        conta1.sacar(500);
        conta1.consultarSaldo();

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(3000);
        contaCorrente.sacar(1200);
        contaCorrente.tafifaMensal(200);
        contaCorrente.consultarSaldo();
    }
}
