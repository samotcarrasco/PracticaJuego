package Modelo;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import EntradaSalida.MyOutput;



/* implementamos patron singleton, segun indicado en clase.
 constructor privado, y un metodo especial getInstance(), que
 permitirá que solo haya una instancia de esta clase 
*/


public class JuegosReunidosExtendidos extends JuegosReunidos{
	
	   private static JuegosReunidosExtendidos juegosReunidos;

	    // constructor privado --> singleton
	    private JuegosReunidosExtendidos(ArrayList<String> diccionario) {
	        super();
	        //cogemos las vidas de la constante de la clase padre
	        agregarJuego(new JuegoAhorcadoIngles(super.VIDAS_AHORCADO, diccionario));
	    }

	    public static JuegosReunidosExtendidos getInstance(ArrayList<String> diccionario) {
	        juegosReunidos = deserialize("datos.dat");
	        if (juegosReunidos == null)
	            return new JuegosReunidosExtendidos(diccionario);
	        else return juegosReunidos;
	    }

	    public static <A> A deserialize(String nombreFichero) {
	        MyOutput.mostrarMensaje("DeSerializing...");
	        try {
	            FileInputStream fis = new FileInputStream(nombreFichero);
	            MyOutput.mostrarMensaje("el fichero es:  " + nombreFichero);
	            ObjectInputStream iis = new ObjectInputStream(fis);
	            MyOutput.mostrarMensaje(iis.available());
	            return (A) iis.readObject();
	        } catch (Exception e) {
	            System.err.println("Problem: " + e);
	        }
	        return null;
	    }

	    public Object clone() throws CloneNotSupportedException {
	        throw new CloneNotSupportedException();

	    }
}
