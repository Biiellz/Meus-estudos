package Relatorios;

public class Main {
    static void main(String[] args) {
        Relatorio relatorio = new Relatorio(
                "Relatório de fevereiro",
                "Tudo conforme o esperado");

        relatorio.imprimir();
    }
}
