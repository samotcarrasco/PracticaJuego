package Modelo;

import java.util.ArrayList;
import java.util.Random;

public class JuegoAhorcadoIngles extends JuegoConVidas implements Jugable{
	//Atributos
	/*
	 * con las nuevas versiones de java no es necesario instanciar el tipo al instanciar los ArrayList
	 * ya se lo indicamos en la declaración del atributo  
	 */
	private ArrayList<Character> palabraAdivinar= new ArrayList<>();
	private ArrayList<Character> guiones= new ArrayList<>();
	private ArrayList<String> diccionario;
	
	//Constructor
	public JuegoAhorcadoIngles(int vidas, ArrayList<String> diccionario) {
		super(vidas);
		this.diccionario = diccionario;
	}
	
	//Metodos
	public void muestraNombre() {
		System.out.println("#### Juego del Ahorcado #####");
	}
	
	public void muestraInfo() {
		System.out.println("Este juego consiste en adivinar una palabra en ingles.  ");
		muestraVidasIniciales();
	}
	
	public boolean existeCaracter(Character caracter) {
		int contador = 0;
		for(int i = 0; i < palabraAdivinar.size(); i++) {
			if(palabraAdivinar.get(i).equals(caracter)) {
				contador++;	
			    guiones.set(i, caracter);
			    }
		}
		return contador > 0;
	}
	
	public void mostrarArray(ArrayList<Character> lista) {
		for(Character auxiliar:lista)
			System.out.print(auxiliar);
		System.out.println();
	}
	
	public void reiniciaPartida() {
		super.reiniciaPartida();
		palabraAdivinar.clear();
		guiones.clear();
		Random r = new Random(System.currentTimeMillis());
		int indice = r.nextInt(diccionario.size());
		String palAdivinar = diccionario.get(indice);
		for(int i = 0; i< palAdivinar.length(); i++) {
			palabraAdivinar.add(palAdivinar.charAt(i));
			guiones.add('-');
		}
		mostrarArray(guiones);
		
	}
	
	public boolean validaFormato(String cad) {
		Character car = cad.charAt(0);
		if((cad.length() == 1) && (Character.isLetter(car)) && (Character.isLowerCase(car))){
			return true;
		}else {
			System.out.println("\tEl formato no es correcto. Intentelo de nuevo");
			return false;
		}
	}
	
	
	// Este método representa las reglas para juegar un único paso en el juego Adivina número
	//placeholder, implementamos el método de la interfaz, no está definido en la clase padre
	//Patron Template
	@Override
	public boolean juega(String caracter) {
		Character car= caracter.charAt(0);
		if(existeCaracter(car)){
			mostrarArray(guiones);
			if(palabraAdivinar.equals(guiones)) {
				System.out.println("Has acertado!!!!");
				actualizaRecord();
				return false;
			}else  return true;
		}else {
			mostrarArray(guiones);
			System.out.print("Este caracter no se encuentra en la palabra");
			return quitaVida();	
		}
	}	
}
