package Midia;

public class Revista extends Midia{
    private String edicao;

    public Revista(String titulo, int anoDePublicacao, String edicao) {
        super(titulo, anoDePublicacao);
        this.edicao = edicao;
    }

    public String getEdicao() {
        return edicao;
    }

    public void exibirInfo() {
        System.out.println("Código: " + gerarCodigo() + " | Livro: \"" + getTitulo() + "\" - Autor: " + edicao);
    }
}
