package ProcurarLivro;

public class Livro {
    String titulo;
    String autor;
    int pags;

    public Livro(String titulo, String autor, int pags) {
        this.titulo = titulo;
        this.autor = autor;
        this.pags = pags;
    }

    public void exibirDados(){
        System.out.printf("\"%s\" de %s com %d páginas%n", titulo, autor, pags);
    }
}
