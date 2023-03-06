package clases;

import enumeration.Especies;

/**
 * Esta clase es un tipo especie "perro" del tamagotchi. Hereda todo el contenido de la clase Tamagotchi.
 * @author Daniel Cesar Vargas Holguin.
 *
 */
public class Perro extends Tamagotchi {
	/**
	 * Byte que representa el paseo del tamagotchi.
	 */
	private Byte paseo;

	/**
	 * Funcion que recibe como argumento el nombre y el tipo de especie del tamagotchi 
	 * Establece paseo como valor predeterminado a 50.
	 * @param nombre nombre el nombre del tamagotchi
	 * @param especie el tipo de especie del tamagotchi.
	 */
	public Perro(String nombre, Especies especie) {
		super(nombre, especie);
		this.paseo = 50;
	}

	/**
	 * La funcion obtiene el valor de paseo. 
	 * @return
	 */
	public Byte getPaseo() {
		return paseo;
	}

	/**
	 * la funcion establece el paseo del tamagotchi. Aparte he protegido el valor causarCaos para
	 * que no sea menor que 0 y ni mayor que 100.
	 * @param paseo
	 */
	public void setPaseo(Byte paseo) {
		if (paseo < 0) {
			this.paseo = 0;
		} else if (paseo > 100) {
			this.paseo = 100;
		} else {
			this.paseo = paseo;
		}
	}

	/**
	 * Funcion hace que el perro pasee. Por tanto, pasear benefecia positivamente
	 * a la estadistica de paseo y al estres pero tiene un punto negativo que le da 
	 * sueño al tamagotchi
	 */
	public void pasear() {
		this.setPaseo((byte) (this.getPaseo() + 20));
		this.setEstres((byte) (this.getEstres() - 20));
		this.setSueño((byte) (this.getSueño() + 20));
	}

	/**
	*  Funcion que decide que el tamagotchi este muerto cuando el hambre sea mayor o igual que 100,
	 * que el sueño sea mayor o igual a 100, que la diversion sea menor o igual 0, que el estres sea
	 * mayor o igual a 100, que la edad sea mayor o igual a 30 y que paseo sea menor o igual 0.
	 * @return false cuando muere el tamagotchi y true cuando sigue vivo el tamagotchi.
	*/
	public boolean estaVivo() {
		if (this.getHambre() >= 100 || this.getSueño() >= 100 || this.getDiversion() <= 0 || this.getEstres() >= 100
				|| this.getEdad() >= 30 || this.getPaseo() <= 0) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * la funcion que imprime los datos del tamagotchi tipo Perro.
	 */
	public String toString() {
		return super.toString() + "\n\t Paseo: " + paseo;
	}

}
