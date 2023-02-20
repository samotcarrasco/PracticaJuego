package Modelo;

public class JuegoAdivinaNumero extends JuegoConVidas implements Jugable {

    private int numAdivinar;

    public JuegoAdivinaNumero(int numVidas, int numAdivinar) {
        super(numVidas);
        this.numAdivinar = numAdivinar;
    }

    public boolean validaNumero(int numero) {
        if (numero >= 0 && numero <= 10) {
            return true;
        } else {
            System.out.println("Numero fuera del intervalo");
            return false;
        }
    }

    @Override
    public boolean juega(String numero) {
        int numeroIntento = Integer.parseInt(numero);

        if (validaNumero(numeroIntento)) {
            if (numeroIntento == numAdivinar) {
                System.out.println("Acertaste!!!!");
                this.actualizaRecord();
                return false;
            } else {
                if (numeroIntento < numAdivinar) {
                    System.out.println("El número a adivinar es mayor");
                } else {
                    System.out.println("El número a adivinar es menor");
                }
                quitaVida();
                return true;
            }
        }
        else return true;
    }



    @Override
    public void muestraNombre() {
        System.out.println("Juego Adivina Número");
    }

    @Override
    public void muestraInfo() {
        System.out.println("Este juego consiste en addivnar un numerro");
        muestraVidasIniciales();
    }
}
