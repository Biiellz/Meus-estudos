package EstoqueDeVendas;

public class Produto {
    String nome;
    int quantidade;

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void vender(int venderQuantidade) {

        if (this.quantidade >= venderQuantidade){
            this.quantidade -= venderQuantidade;
            System.out.println("Venda realizada. Estoque restante de " + this.nome + ": " + this.quantidade);
        }else{
            System.out.println("Estoque insuficiente");
        }
    }
}
