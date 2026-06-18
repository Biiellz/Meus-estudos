package Praticando.Heranca.Polimorfismo.ContaBancaria;

public class ContaBancaria {
    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double deposito){
        saldo += deposito;
        System.out.println("Deposito realizado com sucesso! ");
        System.out.println("Saldo atualizado: " + this.getSaldo());
    }

    public void sacar(double saque){
        if (saque > saldo){
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= saque;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Saldo atualizado: " + this.getSaldo());
        }
    }

    public void consultarSaldo(){
        System.out.println("Saldo atualizado: " + this.getSaldo());
    }

}
