package br.com.MinhasMusicas.principal;

import br.com.MinhasMusicas.modelos.MinhasPreferidas;
import br.com.MinhasMusicas.modelos.Musica;
import br.com.MinhasMusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("JAVA");
        meuPodcast.setDescricao("Aprendendo sobre a aula");
meuPodcast.setApresentador("ALURA");
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Dos predios ");
        minhaMusica.setAlbum("Garoto dos predios");
        minhaMusica.setArtista("Veigh");
        minhaMusica.setGenero("Trap");
        for (int i = 0;i < 2001;i++ ) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 100; i++) {
            minhaMusica.curte();
        }
        for (int i = 0; i < 200; i++){
            meuPodcast.reproduz();
        }

        for (int i = 0; i <200; i++){
            meuPodcast.curte();
        }
        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(meuPodcast);
minhasPreferidas.inclui(minhaMusica);
    }
}
