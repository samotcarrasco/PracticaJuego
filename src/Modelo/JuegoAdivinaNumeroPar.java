package Modelo;

import java.util.Random;
import EntradaSalida.MyOutput;


/*
 * Dentro de esta Clase, se utliza la constante NUMERO_MAX definida en la clase padre
 * */
public class JuegoAdivinaNumeroPar extends JuegoAdivinaNumero{

	
	//Constructor
		public JuegoAdivinaNumeroPar(int vidas) {
			super(vidas);
		}
		
	    @Override
		public void muestraNombre() {
			MyOutput.mostrarMensaje("##### Juego Adivina Numero Par #####");
		}
		
	    @Override
		public void muestraInfo() {
			MyOutput.mostrarMensaje("Este juego consiste en adivinar un numero entero par entre 0 y " + NUMERO_MAX);
			muestraVidasIniciales();
		}
		
	    @Override
		public int numeroAleatorio() {
			Random r = new Random(System.currentTimeMillis());
			//utilizamos la constante
			return 2*r.nextInt(NUMERO_MAX/2 + 1);
		}
	    
		//método polimórfico validaNumero
	    @Override
		public boolean validaNumero(int numero) {
	    	//añadimos llaves al if para hacerlo mas legible
			if (super.validaNumero(numero)) {
				if (numero % 2 == 0) return true;
				
				else {
					MyOutput.mostrarMensaje("\tEl numero " + numero + " no es par. Intentelo de nuevo");
					return false;
				}
			}	
			else return false;	
		}
		
}
