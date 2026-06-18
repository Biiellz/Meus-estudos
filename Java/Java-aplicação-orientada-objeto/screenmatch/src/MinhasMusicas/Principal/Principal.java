package br.com.alura.MinhasMusicas.Principal;

import br.com.alura.MinhasMusicas.Modelos.MinhasPreferidas;
import br.com.alura.MinhasMusicas.Modelos.Musicas;
import br.com.alura.MinhasMusicas.Modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musicas minhaMusica = new Musicas();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setArtista("Kiss");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curtir();
        }

        Podcast meuPodecast = new Podcast();
        meuPodecast.setApresentador("Marcus Mendes");
        meuPodecast.setTitulo("BolhaDev");

        for (int i = 0; i < 5000; i++) {
            meuPodecast.reproduzir();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodecast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodecast);
        preferidas.inclui(minhaMusica);
    }
}
