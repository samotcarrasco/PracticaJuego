package Modelo;

import java.io.Serializable;

public abstract class JuegoConVidas implements Serializable {

    private final int vidasIniciales;
    public int vidas;
    private int record = 0;

    JuegoConVidas(int vidas) {
        this.vidas = vidas;
        vidasIniciales = vidas;
    }

    void muestraVidasIniciales() {
        System.out.println("Vidas iniciales: " + vidasIniciales);
    }

    private void muestraVidasRestantes() {
        System.out.println("Vidas restantes: " + vidas);
    }

    public boolean quitaVida() {
        this.vidas--;
        if (this.vidas > 0) {
            System.out.println("Vidas restantes: " + vidas + " vidas");
        } else System.out.println("Juego terminado ");

        return this.vidas > 0;
    }

    public void reiniciarPartida() {
        this.vidas = vidasIniciales;
    }

    public void actualizaRecord() {
        if (record == vidas) {
            System.out.println("Enhorabuena, ha llegado al record!!! (" + record + ")");
        } else if (vidas > record) {
            record = vidas;
            System.out.println("Enhorabuena, ha batido al record!!! ");
            System.out.println("\t\tEl nuevo record es: " + record);
        }
    }

    //public abstract boolean juega (String cadena);

}
