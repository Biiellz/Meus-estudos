package Praticando.Heranca.Polimorfismo.ContaBancaria;

public class ContaCorrente extends ContaBancaria{

    public void tafifaMensal(double tarifa){
        saldo -= tarifa;
        System.out.println("Tarifa de " + tarifa + " paga!");
        System.out.println("Saldo atualizado: " + saldo);
    }
}
