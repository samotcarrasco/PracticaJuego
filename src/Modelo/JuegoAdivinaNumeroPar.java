package Modelo;

public class JuegoAdivinaNumeroPar extends JuegoAdivinaNumero{

    public JuegoAdivinaNumeroPar(int vidas, int numeroAdivinar) {
        super(vidas, numeroAdivinar);
    }

    public boolean validaNumero(int numero){
        if (super.validaNumero(numero)){
            if(numero % 2 == 0) return true;
            else {
                System.out.println ("El numero introducido no es par");
                return false;
            }
        }
        else return false;
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
