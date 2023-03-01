package Menu;

import Modelo.JuegosReunidos;

public class MenuExt extends Menu {

    public MenuExt(JuegosReunidos juegosReunidos) {
        super(juegosReunidos);
    }

    @Override
    public void mostrarOpciones() {
        super.mostrarOpciones();
        System.out.print("\t 4.- Ahorcado en Inglés");
    }

    @Override
    public boolean chequeaOpcion(int opcion) {
        return super.chequeaOpcion(opcion) || (opcion == 4);
    }

}
