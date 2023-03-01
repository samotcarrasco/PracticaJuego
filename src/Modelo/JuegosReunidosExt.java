package Modelo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

//implementamos patron singleton

public final class JuegosReunidosExt extends JuegosReunidos {
    private static JuegosReunidosExt juegosReunidos;

    private JuegosReunidosExt(ArrayList<String> diccionario) {
        super();
        agregarJuego(new JuegoAhorcadoIngles(5, diccionario));
    }

    public static JuegosReunidosExt getInstance(ArrayList<String> diccionario) {
        juegosReunidos = deserialize("datos.dat");
        if (juegosReunidos == null)
            return new JuegosReunidosExt(diccionario);
        else return juegosReunidos;
    }

    public static <A> A deserialize(String nombreFichero) {
        System.out.println("DeSerializing...");
        try {
            FileInputStream fis = new FileInputStream(nombreFichero);
            ObjectInputStream iis = new ObjectInputStream(fis);
            return (A) iis.readObject();
        } catch (Exception e) {
            System.err.println("Problem: " + e);
        }
        return null;
    }

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();

    }

}
