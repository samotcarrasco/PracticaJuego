package Modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class JuegosReunidos implements Serializable {
    //private final Jugable[] juegos = new Jugable[3];

    //según la nueva especificación de Java, no es necesario inluir el tipo al instanciar, es decir, <> puede ir vacío, porque
    //en la declaración ya le indicamos ele tipo <Jugable>
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
