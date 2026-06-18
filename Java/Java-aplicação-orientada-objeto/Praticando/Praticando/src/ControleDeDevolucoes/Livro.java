package ControleDeDevolucoes;

public class Livro {
    String titulo;
    int diasDeAtraso;
    double multa;

    public Livro(String titulo, int diasDeAtraso) {
        this.titulo = titulo;
        this.diasDeAtraso = diasDeAtraso;
    }

    public void exibirStatus(){
        if (diasDeAtraso != 0){
            multa = diasDeAtraso * 2.5;
        }

        System.out.printf("Livro: %s | Multa por %d dias de atraso: R$ %.2f", this.titulo, this.diasDeAtraso, this.multa);
    }
}
