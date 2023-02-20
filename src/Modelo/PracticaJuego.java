package Modelo;

import EntradaSalida.MyInput;
import Menu.Menu;

public class PracticaJuego {
    public static void main(String[] args) {
        JuegosReunidos juegos = new JuegosReunidos();
        Menu menu = new Menu(juegos);
        menu.ejecuta();

    }

}