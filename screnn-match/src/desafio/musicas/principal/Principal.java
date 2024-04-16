package desafio.musicas.principal;

import desafio.musicas.modelos.MinhasPreferidas;
import desafio.musicas.modelos.Musica;
import desafio.musicas.modelos.Podcast;

public class Principal {

    public static void main(String[] args) {
        Musica msc1 = new Musica();
        msc1.setTitulo("Tanto faz");
        msc1.setCantor("Orochi");

        for (int i = 0; i < 1000; i++) {
            msc1.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            msc1.curte();
        }

        Podcast pdct1 = new Podcast();
        pdct1.setTitulo("PodPah");
        pdct1.setApresentador("Silvio S.");
        pdct1.setDescricao("Vida financeira");

        for (int i = 0; i < 150; i++) {
            pdct1.reproduz();
        }

        for (int i = 0; i < 500; i++) {
            pdct1.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(pdct1);
        preferidas.inclui(msc1);

    }
}
