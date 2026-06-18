package Banco;

public class Deposito extends OperacaoBancaria{

    public Deposito(double vallor) {
        super(vallor);
    }

    @Override
    public void executar() {
        System.out.printf("Deposito de R$%.2f realizado\n", getVallor());
    }
}
