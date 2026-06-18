package AvaliacaoDeFilmes;

public class Main {
    static void main(String[] args) {

        Filmes semRemorso = new Filmes("Sem Remorso", 8);

        semRemorso.adicionarAvaliacao(5);
        semRemorso.adicionarAvaliacao(4);
        semRemorso.adicionarAvaliacao(3);
        semRemorso.adicionarAvaliacao(2);
        semRemorso.adicionarAvaliacao(4);

        semRemorso.calcularMedia();

        System.out.printf("Média de avaliações para %s: %.2f\n",
                semRemorso.getTitulo(), semRemorso.calcularMedia());
    }
}
