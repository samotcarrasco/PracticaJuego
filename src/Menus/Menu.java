package Menus;
import java.io.IOException;

import EntradaSalida.MyInput;
import Modelo.JuegosReunidos;
import Modelo.Jugable;

public class Menu {
	//Atributo
	private JuegosReunidos juegos;
	
	//Constructor
	public Menu(JuegosReunidos juegos) {
		this.juegos = juegos;
	}
	
	public void jugar(Jugable juego) {
		String intento; // numero que se le solicita al usuario
		juego.reiniciaPartida();
		juego.muestraNombre();
		juego.muestraInfo();
		do{
			System.out.print("Introduce tu respuesta ==> ");
			do {
				intento = MyInput.readString();
			}while(!juego.validaFormato(intento));
		}while(juego.juega(intento));
	}
	
		public void mostrarOpciones() {
			System.out.println("¿A que quieres jugar?");
			System.out.println("\t1.-Adivinar una Numero");
			System.out.println("\t2.-Adivinar una Numero Impar");
			System.out.println("\t3.-Adivinar una Numero Par");
		}
	
	public boolean chequeaOpcion(int opcion) {
		//dejamos el return en una sola linea
		return ((opcion == 1) || (opcion == 2) || (opcion == 3));
	
	}
	
	public int eligeOpciones() {
		int opcion;
		boolean flag=true;
		do {
			mostrarOpciones();
			System.out.print("Introduzca opción [1-4] ==> ");
			opcion = MyInput.readInt();
			if(chequeaOpcion(opcion)) flag = false;
			else System.out.println("La opcion introducida no es correcta. Intentelo de nuevo");
		}while(flag);
		return opcion;
	}
	
	public void ejecuta() {
		String respuesta;
		do {
			jugar(juegos.recuperarJuego(eligeOpciones()));
			System.out.println("¿Quiere seguir jugando [s(S)]? ");
			respuesta = MyInput.readString();
		}while(respuesta.equals("s") || respuesta.equals("S"));
	}
	
	

}
