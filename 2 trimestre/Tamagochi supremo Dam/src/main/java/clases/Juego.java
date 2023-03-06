package clases;
/**
 * Esta clase incluye las funciones de diversion y estres del juego. 
 * Aparte hereda cosas de la clase CosaConNombre.
 * @author Daniel Cesar Vargas Holguín.
 *
 */
public class Juego extends CosaConNombre {
	/**
	 * Byte que representa la diversion del juguete del tamagotchi.
	 */
	private Byte diversion;
	/**
	 * Byte que representa el estres del juguete del tamagotchi.
	 */
	private Byte estres;
	/**
	 *  Funcion que tiene como argumento el nombre, el diversion y la estres.
	 * @param nombre del juego
	 * @param diversion representado en byte
	 * @param estres representado en byte
	 */
	public Juego(String nombre, Byte diversion, Byte estres) {
		super(nombre);
		this.diversion = diversion;
		this.estres = estres;
	}
	/**
	 *La funcion obtiene la diversion del juego.
     * @return devuelve la diversion del juego obtenido.
	 */
	public Byte getDiversion() {
		return diversion;
	}
	/**
	 *La funcion establece la diversion del juego
     * @param diversion, establece el valor numerico que va ser
     * diversion.
	 */
	public void setDiversion(Byte diversion) {
		if (diversion < 0) {
			this.diversion = 0;
		} else if (diversion > 100) {
			this.diversion = 100;
		} else {
			this.diversion = diversion;
		}
	}
	/**
	 *La funcion obtiene el estres del juego de tamagotchi
     * @return devuelve el estres del juego obtenido.
	 */
	public Byte getEstres() {
		return estres;
	}
	/**
	  *La funcion establece el estres del juego
     * @param estres, establece el valor numerico que va ser
     * estres.
	 */
	public void setEstres(Byte estres) {
		if (estres < 0) {
			this.estres = 0;
		} else if (estres > 100) {
			this.estres = 100;
		} else {
			this.estres = estres;
		}
	}
	/**
	 * la funcion que imprime los datos del juego del tamagotchi.
	 */
	public String toString() {
		return super.toString()+"\n\tDiversion: " + diversion + "\n\tEstres: " + estres;
	}
	
	
}
