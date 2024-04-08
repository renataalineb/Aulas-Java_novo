package br.com.alura.mihasmusicas.principal;

import br.com.alura.mihasmusicas.modelos.MinhasPreferidas;
import br.com.alura.mihasmusicas.modelos.Musica;
import br.com.alura.mihasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Musica m = new Musica();
        m.setTitulo("Forever");
        m.setCantor("Kiss");

        for (int i  = 0; i  < 1000; i ++) {
            m.reproduz();
        }

        for (int i = 0; i < 50; i++) {
             m.curte();
        }

        Podcast p = new Podcast();
        p.setTitulo("BolhaDev");
        p.setApresentador("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            p.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            p.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui((p));
        preferidas.inclui(m);


    }
}
