package Modelo;
import java.util.Random;

/*
 * Dentro de esta Clase, se utliza la constante NUMERO_MAX definida en la clase padre
 * */
public class JuegoAdivinaNumeroImpar extends JuegoAdivinaNumero{
	
	
	//Constructor
	public JuegoAdivinaNumeroImpar(int vidas) {
		super(vidas);
	}
	
	
	/*
	 * En esta clase, todos los métodos son sobreescritos
	 * */
	@Override
	public void muestraNombre() {
		System.out.println("##### Juego Adivina Número Impar #####");
	}
	
	@Override
	public void muestraInfo() {
		System.out.println("Este juego consiste en adivinar un numero entero impar entre 0 y "+ NUMERO_MAX);
		muestraVidasIniciales();
	}
	
	@Override
	public int numeroAleatorio() {
		Random r = new Random(System.currentTimeMillis());
		//utilizamos la constante
		return 2 * r.nextInt(NUMERO_MAX / 2) + 1;
	}
	
	//método polimórfico validaNumero
	@Override
	public boolean validaNumero(int numero) {
		//añadimos llaves al if para hacerlo mas legible
		if (super.validaNumero(numero)) {
		if(numero % 2 != 0) return true;
			else {
				System.out.println("el número " + numero + " no es impar. Intentelo de nuevo");
				return false;
			}
		}	
		else return false;	
	}

}
