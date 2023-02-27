package Modelo;

import java.util.ArrayList;
import java.util.Random;

public class JuegoAhorcadoIngles extends JuegoConVidas implements Jugable {

    private final ArrayList<Character> palabraAdivinar = new ArrayList<>();
    private final ArrayList<Character> guiones = new ArrayList<>();
    private final ArrayList<String> diccionario;


    public JuegoAhorcadoIngles(int vidas, ArrayList<String> diccionario) {
        super(vidas);
        this.diccionario = diccionario;
    }


    public boolean existeCaracter(Character caracter) {
        int contador=0;
        for(int i = 0; i <palabraAdivinar.size(); i++) {
            if(palabraAdivinar.get(i).equals(caracter)) {
                contador++;
                guiones.set(i,caracter);
            }
        }
        return contador>0;
    }

    public void mostrarArray(ArrayList<Character> lista) {
        for(Character auxiliar:lista)
            System.out.print(auxiliar);
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
        palabraAdivinar.clear();
        guiones.clear();
        Random r = new Random(System.currentTimeMillis());
        int indice = r.nextInt(diccionario.size());
        String palAdivinar = diccionario.get(indice);
        for (int i = 0; i < palAdivinar.length(); i++) {
            palabraAdivinar.add(palAdivinar.charAt(i));
            guiones.add('-');
        }
        mostrarArray(guiones);

    }
    public boolean validaFormato(String cad){
        Character car = cad.charAt(0);
        if(!((cad.length() == 1) && (Character.isLetter(car)) && (Character.isLowerCase(car)))){
            System.out.println("El formato no es correcto, intentelo de nuevo");
            return false;
        } else return true;

    }

    @Override
    public boolean juega(String caracter) {
        Character car= caracter.charAt(0);
        if(existeCaracter(car)) {
            mostrarArray(guiones);
            if(palabraAdivinar.equals(guiones))
            {
                System.out.println("Has acertado!!!!");
                actualizaRecord();
                return false;
            }else  return true;
        }else {
            mostrarArray(guiones);
            System.out.print("Este caracter no se encuentra en la palabra");
            return quitaVida();
        }

    }
}
