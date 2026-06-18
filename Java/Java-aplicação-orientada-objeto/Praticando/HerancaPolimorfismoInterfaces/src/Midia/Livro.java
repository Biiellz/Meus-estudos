package Midia;

public class Livro extends Midia{
    private String autor;

    public Livro(String titulo, int anoDePublicacao, String autor) {
        super(titulo, anoDePublicacao);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void exibirInfo() {
        System.out.println("Código: " + gerarCodigo() + " | Livro: \"" + getTitulo() + "\" - Autor: " + autor);
    }
}
