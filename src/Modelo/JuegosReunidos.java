package Modelo;
import java.io.Serializable;
import java.util.ArrayList;

public class JuegosReunidos implements Serializable{
	
	//dejamos el número de vidas en una constante
	public static final int VIDAS = 6;
	
	/*
	 * con las nuevas versiones de java no es necesario instanciar el tipo al instanciar los ArrayList  
	 */
	private ArrayList<Jugable> juegos = new ArrayList<>();
	
	//Constructor
	public JuegosReunidos(){
		juegos.add(new JuegoAdivinaNumero(VIDAS));
		juegos.add(new JuegoAdivinaNumeroImpar(VIDAS));
		juegos.add(new JuegoAdivinaNumeroPar(VIDAS));
	}
	
	
	public Jugable recuperarJuego(int opcion) {
		return juegos.get(opcion - 1);
	}
	
	public void agregarJuego(Jugable juego) {
		juegos.add(juego);
	}

}
