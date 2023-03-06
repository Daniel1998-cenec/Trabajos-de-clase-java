package clases;
/**
 * Esta clase incluye las funciones de valor energetico y morriña de la comida.
 * Aparte hereda cosas de la clase CosaConNombre.
 * @author Daniel Cesar Vargas Holguín.
 *
 */
public class Comida extends CosaConNombre {
	/**
	 * Byte que representa el valorEnergetico de la comida tamagotchi.
	 */
	private Byte valorEnergetico;
	/**
	 * Byte que representa la morriña del la comida del tamagotchi.
	 */
	private Byte morriña;
    /**
     * Funcion que tiene como argumento el nombre, el valorEnergetico y la morriña.
     * @param nombre de la comida
     * @param valorEnergetico representado en byte
     * @param morriña representando en byte
     */
	public Comida(String nombre, Byte valorEnergetico, Byte morriña) {
		super(nombre);
		this.valorEnergetico = valorEnergetico;
		this.morriña = morriña;
	}
    /**
     *  La funcion obtiene el valorEnergetico de la comida.
     * @return devuelve el valorEnergetico de la comida obtenido. 
     */
	public Byte getValorEnergetico() {
		return valorEnergetico;
	}
    /**
     * La funcion establece el valorEnergetico.
     * @param valorEnergetico, establece el valor numerico que va ser
     * el valorEnergetico.
     */
	public void setValorEnergetico(Byte valorEnergetico) {
		if (valorEnergetico < 0) {
			this.valorEnergetico = 0;
		} else if (valorEnergetico > 100) {
			this.valorEnergetico = 100;
		} else {
			this.valorEnergetico = valorEnergetico;
		}
	}
    /**
     * La funcion obtiene la morriña.
     * @return devuelve la morriña obtenida. 
     */
	public Byte getMorriña() {
		return morriña;
	}
    /**
     * La funcion establece la morriña.
     * @param morriña establece el valor numerico que va ser
     * la morriña.
     */
	public void setMorriña(Byte morriña) {
		if (morriña < 0) {
			this.morriña = 0;
		} else if (morriña > 100) {
			this.morriña = 100;
		} else {
			this.morriña = morriña;
		}
	}
    /**
     * la funcion que imprime los datos de la comida del tamagotchi.
     */
	public String toString() {
		return super.toString() + "\n\tValorEnergetico: " + valorEnergetico + "\n\tmorriña=" + morriña;
	}

}
