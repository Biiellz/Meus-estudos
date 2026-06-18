package Midia;

public class Midia {
    private String titulo;
    private int anoDePublicacao;

    public Midia(String titulo, int anoDePublicacao) {
        this.titulo = titulo;
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public String gerarCodigo() {
        return "LIB-" + titulo.substring(0, 3) + anoDePublicacao;
    }
}
