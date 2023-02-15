package Modelo;

public class PracticaJuego {
    public static void main(String[] args) {
        JuegoConVidas partida1 = new JuegoConVidas(5);
        partida1.muestraVidasIniciales();
        partida1.quitaVida();

        JuegoConVidas partida2 = new JuegoConVidas(5);
        partida2.actualizaRecord();
        partida2.quitaVida();

        partida1.reiniciaPartida();
        partida1.muestraVidasRestantes();
        partida1.actualizaRecord();

    }
}