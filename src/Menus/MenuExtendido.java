package Menus;
import Modelo.JuegosReunidos;
public class MenuExtendido extends Menu {

    public MenuExtendido(JuegosReunidos juegosReunidos) {
        super(juegosReunidos);
    }

    @Override
    public void mostrarOpciones() {
        super.mostrarOpciones();
        System.out.print("\t4.-Ahorcado en Inglés\n");
    }

    @Override
    public boolean chequeaOpcion(int opcion) {
        return super.chequeaOpcion(opcion) || (opcion == 4);
    }

}
