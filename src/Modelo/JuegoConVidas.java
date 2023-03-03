package Modelo;

import java.io.Serializable;

public abstract class JuegoConVidas implements Serializable {
    private int vidasIniciales;
    private int vidas;
    private int record = 0;

   
    public JuegoConVidas(int vidas){
        this.vidasIniciales = vidas;
        this.vidas = vidas;
    }

      
    public void muestraVidasIniciales(){
        System.out.println("\t¡¡¡¡¡¡¡¡¡¡ATENCIÓN COMIENZAD CON " + vidasIniciales + " VIDAS!!!!!");
    }

   
    public void muestraVidasRestantes(){
        System.out.println("\tTe quedan " + vidas + " vidas");
    }

   
    public boolean quitaVida(){
        if (--this.vidas == 0) {
            System.out.println("\tOOOOHHHHH!!!!!No te quedan vidas. Juego terminado....");
            return false;}
        else{
            muestraVidasRestantes();
            return true;
        }
    }

    
    public void reiniciaPartida(){
        this.vidas = vidasIniciales;
    }

    
    public void actualizaRecord(){
        if(this.vidas == record) System.out.println("\tHAS IGUALADO EL RECORD!!!");
        if(this.vidas > record){
            this.record = this.vidas;
            System.out.println("\tHAS BATIDO EL RECORD EN ESTE JUEVO. TU NUEVO RECORD ES: " + this.record + "!!!!");
        }
    }
    
}
