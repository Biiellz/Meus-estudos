package Praticando.musica;

//Classe Principal
public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();

        minhaMusica.titulo = "Mockinbird";
        minhaMusica.artista = "Eminem";
        minhaMusica.anoLancamento = 2010;

        minhaMusica.exibeFichaTecnica();

        minhaMusica.avalia(6);
        minhaMusica.avalia(7);
        minhaMusica.avalia(9);

        double mediaAvaliacoes = minhaMusica.pegaMedia();
        System.out.println("Média das avaliações: " + mediaAvaliacoes);
    }
}
