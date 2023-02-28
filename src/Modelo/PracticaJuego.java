package Modelo;

import EntradaSalida.MyInput;
import Menu.Menu;
import Menu.MenuExt;

public class PracticaJuego {
    public static void main(String[] args) {

        JuegosReunidos juegosReunidos = MyInput.deserialize("datos.dat");
        if (juegosReunidos == null)
            juegosReunidos = new JuegosReunidosExt(MyInput.leeFichero("words.txt"));
        Menu menu = new MenuExt(juegosReunidos);
        menu.ejecuta();
        MyInput.serialize(juegosReunidos, "datos.dat");

    }
}