package relatorioDeVendas;

public class Main {
    static void main(String[] args) {

        Produto produto1 = new Produto("sandalia", 50, 5);
        produto1.exibirInformacoes();

        Produto produto2 = new Produto("gaarrafa de água", 2.50, 50);
        produto2.exibirInformacoes();

        Produto produto3 = new Produto("Cadeira", 150, 10);
        produto1.exibirInformacoes();

    }
}