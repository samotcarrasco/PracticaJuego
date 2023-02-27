package Menu;

import EntradaSalida.MyInput;
import Modelo.JuegosReunidos;
import Modelo.Jugable;

public class Menu {
    private final JuegosReunidos juegos;

    public Menu(JuegosReunidos juegos) {
        this.juegos = juegos;
    }

    public void jugar(Jugable juego) {
        String numeroIntento; // num�ro que se le solicita al usuario
        juego.reiniciarPartida();
        juego.muestraNombre();
        juego.muestraInfo();
        do{
            System.out.println("Introduce tu respuesta");
            do {
                numeroIntento = MyInput.readString();
            } while (!juego.validaFormato(numeroIntento));
        }while(juego.juega(numeroIntento));
    }


    public void mostrarOpciones() {
        System.out.println("¿A qué quieres jugar? \n\t 1.- Adivinar numero \n\t 2.- Adivinar impar \n\t 3.- Adivinar par");
    }

    public boolean chequeaOpcion(int opcion) {
        return (opcion == 1 || opcion == 2 || opcion == 3);
    }

    public int eligeOpciones() {
        int opcion;
        boolean flag = true;
        do {
            mostrarOpciones();
            opcion = MyInput.readInt();
            if (chequeaOpcion(opcion)) flag = false;
            else System.out.println("Opción incorrecta, repita de nuevo");
        } while (flag);
        return opcion;
    }

    public void ejecuta() {
        String respuesta;
        do {
            jugar(juegos.recuperarJuego(eligeOpciones()));
            System.out.println("Quiere seguir jugando (s|n)");
            respuesta = MyInput.readString();
        } while (respuesta.equals("s"));
    }

}
