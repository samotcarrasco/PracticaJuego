package Modelo;

public class JuegoConVidas {

    private static int record = 0;
    private final int vidasIniciales;
    private int vidas;

    JuegoConVidas(int vidas) {
        this.vidas = vidas;
        vidasIniciales = vidas;
    }

    public void muestraVidasIniciales() {
        System.out.println("Vidas iniciales: " + vidasIniciales);
    }

    public void muestraVidasRestantes() {
        System.out.println("Vidas restantes: " + vidas);
    }

    public boolean quitaVida() {
        this.vidas--;
        if (this.vidas > 0) {
            System.out.println("Vidas restantes: " + vidas + " vidas");
        } else System.out.println("Juego terminado ");

        return this.vidas > 0;
    }

    public void reiniciaPartida() {
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

    // public abstract boolean juego(String cadena);

}
