package ValidandoPrecos;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void dadosDoProduto(){
        if (getPreco() > 0){
            System.out.printf("nome = %s\n preço = %.2f\n", getNome(), getPreco());
        }else {
            System.out.printf("preço inválido \n nome = %s\n preço = 0,00", getNome());
        }
    }
}
