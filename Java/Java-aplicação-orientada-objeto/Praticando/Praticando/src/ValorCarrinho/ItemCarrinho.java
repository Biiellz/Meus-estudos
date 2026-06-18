package ValorCarrinho;

public class ItemCarrinho {
    String nome;
    double preco;
    int quantidade;
    double precoTotal;

    public ItemCarrinho(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    double totalDoProduto(){
        return quantidade * preco;
    }
}
