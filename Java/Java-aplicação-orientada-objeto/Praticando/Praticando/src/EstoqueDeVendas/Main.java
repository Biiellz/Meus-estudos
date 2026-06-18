package EstoqueDeVendas;

public class Main {
    static void main(String[] args) {
        Produto p1 = new Produto("blusa", 7);
        p1.vender(2);
        p1.vender(7);
    }
}
