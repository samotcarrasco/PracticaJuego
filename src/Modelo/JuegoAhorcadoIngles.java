package Modelo;

import java.util.ArrayList;
import java.util.Random;

public class JuegoAhorcadoIngles extends JuegoConVidas implements Jugable {

    private final ArrayList<Character> palabraAdivinar = new ArrayList<Character>();
    private final ArrayList<Character> guiones = new ArrayList<Character>();
    private final ArrayList<String> diccionario;


    public JuegoAhorcadoIngles(int vidas, ArrayList<String> diccionario) {
        super(vidas);
        this.diccionario = diccionario;
    }


    public boolean existeCaracter(Character caracter) {
        int contador = 0;
        for (int i = 0; i < palabraAdivinar.size(); i++) {
            if (palabraAdivinar.get(i).equals(caracter)) {
                contador++;
                guiones.set(contador, caracter);
            }
        }
        return (contador > 0);
    }

    public void mostrarArray(ArrayList<Character> lista) {
        for (Character auxiliar : lista)
            System.out.println(auxiliar);
        System.out.println();
    }

    @Override
    public void muestraNombre() {
        System.out.println("Juego del ahorcado");
    }

    @Override
    public void muestraInfo() {
        System.out.println("Este juego consiste en adivinar una palabra en inglés");
        muestraVidasIniciales();
    }

    @Override
    public void reiniciarPartida() {
        super.reiniciarPartida();
        this.palabraAdivinar.clear();
        this.guiones.clear();
        Random r = new Random(System.currentTimeMillis());
        int indice = r.nextInt(diccionario.size());
        String palAdivinar = diccionario.get(indice);
        for (int i = 0; i < palAdivinar.length(); i++) {
            palabraAdivinar.add(palAdivinar.charAt(i));
            guiones.add('-');
        }
        mostrarArray(guiones);
    }

    @Override
    public boolean juega(String carater) {
        Character car = carater.charAt(0);
        if (existeCaracter((car))) {
            if (palabraAdivinar.equals(guiones)) {
                System.out.println("Has acertado!!!");
                actualizaRecord();
                return false;
            } else return true;
        } else {
            System.out.println("El caracter no se encuentra en la palabra, siga jugando");
            return quitaVida();
        }
    }
}
