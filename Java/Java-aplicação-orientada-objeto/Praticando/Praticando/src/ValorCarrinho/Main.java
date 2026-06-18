package ValorCarrinho;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        ItemCarrinho camisas = new ItemCarrinho("Camisa", 30, 5);
        ItemCarrinho mouses = new ItemCarrinho("mouses", 60, 6);

        List<ItemCarrinho> carrinho = new ArrayList<>();
        carrinho.add(camisas);
        carrinho.add(mouses);

        double totalCompra = 0;

        for (ItemCarrinho i : carrinho){
            totalCompra += i.totalDoProduto();
        }

        System.out.printf("Total da compra: %.2f\n", totalCompra);
    }
}
