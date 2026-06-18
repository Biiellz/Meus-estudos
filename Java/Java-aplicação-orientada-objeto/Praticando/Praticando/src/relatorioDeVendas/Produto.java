package relatorioDeVendas;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirInformacoes(){
        System.out.println("-----------------");
        System.out.println("relatorioDeVendas.Produto: " + nome);
        System.out.println("R$: " + preco);
        System.out.println("Em estoque : " + quantidade);
    }
}
