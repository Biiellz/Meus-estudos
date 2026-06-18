package Banco;

public class Conta {
    private String nome;
    private double saldo;

    public Conta(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor < 0) {
            System.out.println("Deposito inválido");
            exibirSaldo();
        }else {
            this.saldo += valor;
            System.out.println("Deposito realizado com sucesso!");
            exibirSaldo();
        }

    }

    public void sacar(double valor){
        if (valor < getSaldo()){
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
            exibirSaldo();
        }else {
            System.out.println("Saque impedido devido a falta de saldo na conta.");
            exibirSaldo();
        }
    }

    public void exibirSaldo(){
        System.out.println("Saldo atual de " + getNome() + ": " + getSaldo());
    }
}
