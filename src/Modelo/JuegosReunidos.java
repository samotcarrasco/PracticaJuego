package Modelo;

public class JuegosReunidos {
    private Jugable[] juegos = new Jugable[3];

    public JuegosReunidos(){
        juegos[0] =  new JuegoAdivinaNumero(5,7);
        juegos[1] =  new JuegoAdivinaNumeroImpar(5,3);
        juegos[2] =  new JuegoAdivinaNumeroPar(5,6);
    }

    public Jugable recuperarJuego(int opcion)  {
        return juegos[opcion-1];

    }
}
