package Banco;

public class Saque extends OperacaoBancaria{
    public Saque(double vallor) {
        super(vallor);
    }

    @Override
    public void executar() {
        System.out.printf("Saque de R$%.2f realizado\n", getVallor());
    }
}
