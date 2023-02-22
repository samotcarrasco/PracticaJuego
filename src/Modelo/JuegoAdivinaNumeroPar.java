package Modelo;

import java.util.Random;

public class JuegoAdivinaNumeroPar extends JuegoAdivinaNumero {

    public JuegoAdivinaNumeroPar(int vidas) {
        super(vidas);
    }


    public boolean validaNumero(int numero) {
        if (super.validaNumero(numero)) {
            if (numero % 2 == 0) return true;
            else {
                System.out.println("El numero introducido no es par");
                return false;
            }
        } else return false;
    }

    @Override
    public int numeroAleatorio() {
        Random r = new Random(System.currentTimeMillis());
        return 2 * r.nextInt(6);
    }

    @Override
    public void muestraNombre() {
        System.out.println("Juego Adivina Número Par");
    }

    @Override
    public void muestraInfo() {
        System.out.println("Este juego consiste en addivnar un numerro Par");
        muestraVidasIniciales();
    }
}
