package Modelo;

import EntradaSalida.MyInput;
import Menu.Menu;
import Menu.MenuExt;

public class PracticaJuego {
    public static void main(String[] args) {

        JuegosReunidosExt juegosReunidos = JuegosReunidosExt.getInstance(MyInput.leeFichero("words.txt"));

        if (juegosReunidos == null)
            juegosReunidos = JuegosReunidosExt.getInstance(MyInput.leeFichero("words.txt"));
        Menu menu = new MenuExt(juegosReunidos);
        menu.ejecuta();
        MyInput.serialize(juegosReunidos, "datos.dat");

    }
}