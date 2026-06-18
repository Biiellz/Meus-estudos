package AvaliacaoDeFilmes;

import java.util.ArrayList;

public class Filmes {
    private String titulo;
    private ArrayList<Integer> avaliacoes;

    public Filmes(String titulo, double nota) {
        this.titulo = titulo;
        this.avaliacoes = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public ArrayList<Integer> getAvaliacoes() {
        return avaliacoes;
    }

    public void adicionarAvaliacao(int nota){
        if (nota >= 1 && nota <= 5){
            avaliacoes.add(nota);
        }else {
            System.out.println("Nota inválida. Digite um número de 1 a 5.");
        }
    }

    public double calcularMedia(){
        int soma = 0;
        for (int nota : avaliacoes){
            soma += nota;
        }return (double) soma / avaliacoes.size();
    }
}
