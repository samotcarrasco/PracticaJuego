package EntradaSalida;

import java.io.IOException;

public class MyOutput {
	
	       /**
		     * M�todo que permite mostrar una cadena de caracteres del teclado
		     * @return retorna una cadena de caracteres
		     */
		public static void mostrarMensaje(String mensaje) {
		    try {
				System.out.println(mensaje); 
				}
		    catch (Exception e){
		        e.printStackTrace();}
			
		}	
		public static void mostrarMensaje(int mensaje) {
		    try {
				System.out.println(mensaje); 
				}
		    catch (Exception e){
		        e.printStackTrace();}
			
		}

}
