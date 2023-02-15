package Modelo;

public class JuegoConVidas {

    private static final int record = 0;
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
            System.out.println("Le quedan: " + vidas + " vidas");
        } else System.out.println("Juego terminado ");

        return this.vidas > 0;
    }
}
