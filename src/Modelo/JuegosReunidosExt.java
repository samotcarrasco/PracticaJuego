package Modelo;

import java.util.ArrayList;

public class JuegosReunidosExt extends JuegosReunidos {

    public JuegosReunidosExt(ArrayList<String> diccionario) {
        super();
        agregarJuego(new JuegoAhorcadoIngles(5, diccionario));
    }
}
