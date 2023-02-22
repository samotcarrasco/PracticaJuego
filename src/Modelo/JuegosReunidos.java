package Modelo;

import java.util.ArrayList;

public class JuegosReunidos {
    //private final Jugable[] juegos = new Jugable[3];

    private final ArrayList<Jugable> juegos = new ArrayList<Jugable>();


    public JuegosReunidos() {
        juegos.add(new JuegoAdivinaNumero(5));
        juegos.add(new JuegoAdivinaNumeroImpar(5));
        juegos.add(new JuegoAdivinaNumeroPar(5));
    }

    public Jugable recuperarJuego(int opcion) {
        return juegos.get(opcion - 1);
    }

    public void agregarJuego(Jugable juego) {
        juegos.add(juego);
    }
}
