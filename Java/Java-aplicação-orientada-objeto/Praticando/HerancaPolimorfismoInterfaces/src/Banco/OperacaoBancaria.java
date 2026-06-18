package Banco;

abstract class OperacaoBancaria implements AcaoBancaria{
    private double vallor;

    public double getVallor() {
        return vallor;
    }

    public OperacaoBancaria(double vallor) {
        this.vallor = vallor;
    }

    @Override
    public void executar() {

    }
}
