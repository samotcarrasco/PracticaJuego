package Modelo;

import java.io.Serializable;
import EntradaSalida.MyOutput;


public abstract class JuegoConVidas implements Serializable {
    private int vidasIniciales;
    private int vidas;
    private int record = 0;

   
    public JuegoConVidas(int vidas){
        this.vidasIniciales = vidas;
        this.vidas = vidas;
    }

      
    public void muestraVidasIniciales(){
        MyOutput.mostrarMensaje("\t¡¡¡¡¡¡¡¡¡¡ATENCIÓN COMIENZAD CON " + vidasIniciales + " VIDAS!!!!!");
    }

   
    public void muestraVidasRestantes(){
        MyOutput.mostrarMensaje("\tTe quedan " + vidas + " vidas");
    }

   
    public boolean quitaVida(){
        if (--this.vidas == 0) {
            MyOutput.mostrarMensaje("\tOOOOHHHHH!!!!!No te quedan vidas. Juego terminado....");
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
        if(this.vidas == record) MyOutput.mostrarMensaje("\tHAS IGUALADO EL RECORD!!!");
        if(this.vidas > record){
            this.record = this.vidas;
            MyOutput.mostrarMensaje("\tHAS BATIDO EL RECORD EN ESTE JUEVO. TU NUEVO RECORD ES: " + this.record + "!!!!");
        }
    }
    
}
