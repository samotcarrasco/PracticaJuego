package Modelo;

public class JuegoAdivinaNumeroImpar extends JuegoAdivinaNumero {

    public JuegoAdivinaNumeroImpar(int vidas, int numeroAdivinar) {
        super(vidas, numeroAdivinar);
    }

    public boolean validaNumero(int numero){
        if (super.validaNumero(numero)){
            if(numero % 2 == 1) return true;
            else {
                System.out.println ("El numero introducido no es impar");
                return false;
            }
        }
        else return false;
    }



    @Override
    public void muestraNombre() {
        System.out.println("Juego Adivina Número Impar");
    }

    @Override
    public void muestraInfo() {
        System.out.println("Este juego consiste en addivnar un numerro Impar");
        muestraVidasIniciales();
    }
}
