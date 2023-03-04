package Modelo;

import java.util.Random;

/**
 * Se ha añadido la notación @Override en los metodos heredados (de la clase JuevoConVidas o de la interfaz)
 * Además se han incluido al final. Esto ayuda mucho a la hora de leer el código. 
 * **/
public class JuegoAdivinaNumero extends JuegoConVidas implements Jugable {
	
	/* 
	 * añadimos como una constnatnte el número máximo,ya que se utiliza en varias partes.
	 * de esta forma, si en un futuro lo tenemos que modificar, solo hay que cambiarlo aquí 
	 * pública para que pueda ser accedida por las clases hijas
	*/
	public static final int NUMERO_MAX = 18;
	
	// numeroAdivinar representa el atributo propio de la clase JuegoAdivinaNumero
	private int numeroAdivinar;
		
		
	//Contructor
	public JuegoAdivinaNumero(int vidas) {
		super(vidas);
	}
	
	// método que genera un número aleatorio entre 0 y NUMERO_MAX
	public int numeroAleatorio() {	
		Random r = new Random(System.currentTimeMillis());
		return r.nextInt(NUMERO_MAX + 1);
	}
	
	// metodos (polimorfirmo)
	public boolean validaNumero(int numero) {
		if((numero >= 0) && (numero <= NUMERO_MAX)) return true;
		else {
			System.out.println("\tNúmero " + numero + " fuera de rango");
			return false;
		}
	}
	
	/*
	 * Métodos heredados bien de la clase padre o de la interfaz Jugable
	 * */
	
	@Override
	public boolean validaFormato(String cad) {
		int numero;
		try {
			numero = Integer.parseInt(cad);
		}catch(NumberFormatException ex) {
			System.out.println("\tEl formato no es correcto. Intentelo de nuevo");
			return false;
		}
		return true;
	}
	
	
	// reescritura del método reiniciaPartida
	@Override
		public void reiniciaPartida() {
			super.reiniciaPartida();
			numeroAdivinar = numeroAleatorio();
		}
		
		
	// Este método representa las reglas para juegar un único paso en el juego Adivina número
	@Override
	public boolean juega (String numero) {
		Integer numeroIntento= Integer.parseInt(numero);
		if(validaNumero(numeroIntento)) {
			if(numeroIntento == numeroAdivinar) {
				System.out.println(" HAS ACERTADO!!!!, ENHORABUENA");
				actualizaRecord();
				return false;
			}else {
				if(numeroIntento > numeroAdivinar) 
					System.out.println("\tEl número a adivinar es más pequeño");	
				else 
					System.out.println("\tEl número a adivinar es mas grande");
				return quitaVida();
			}	
		}else return true;	
	}
	
	@Override
	public void muestraNombre() {
		System.out.println("##### Juego Adivina Numero #####");
	}
	
	@Override
	//incluimois el número max en este mensaje
	public void muestraInfo() {
		System.out.println("Este juego consiste en adivinar un numero entero entre 0 y " + NUMERO_MAX);
		muestraVidasIniciales();
	}

}
