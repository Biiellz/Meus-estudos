package Banco;

public class Saldo {
    double saldo;

    public Saldo(double saldo) {
        this.saldo = saldo;
    }

    public void zerarSaldo(){
        saldo = 0;
    }

    public void exbirDados(){
        System.out.println("Seu Saldo Atual: " + saldo);
    }
}
