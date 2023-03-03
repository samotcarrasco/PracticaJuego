package Modelo;

public interface Jugable {
	public boolean juega(String cadena);
	public void reiniciaPartida();
	public void muestraNombre();
	public void muestraInfo();
	public boolean validaFormato(String cad);
}
