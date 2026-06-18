package Midia;

public class Ebook extends Midia{
    private String formato;

    public Ebook(String titulo, int anoDePublicacao, String formato) {
        super(titulo, anoDePublicacao);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void exibirInfo() {
        System.out.println("Código: " + gerarCodigo() + " | Livro: \"" + getTitulo() + "\" - Autor: " + formato);
    }
}
