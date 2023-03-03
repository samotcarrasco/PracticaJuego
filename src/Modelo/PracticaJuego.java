package Modelo;

import EntradaSalida.MyInput;
import Menus.*;

public class PracticaJuego {
	 public static void main(String[] args) {

	        JuegosReunidosExtendidos juegosReunidos = JuegosReunidosExtendidos.getInstance(MyInput.leeFichero("words.txt"));
	        if (juegosReunidos == null)
	            juegosReunidos = JuegosReunidosExtendidos.getInstance(MyInput.leeFichero("words.txt"));
	        Menu menu = new MenuExtendido(juegosReunidos);
	        menu.ejecuta();
	        MyInput.serialize(juegosReunidos, "datos.dat");
	        System.out.println("##### Saliendo del Juego #####");

	    }

}
