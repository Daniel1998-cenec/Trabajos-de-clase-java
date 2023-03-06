package clases;

import enumeration.Especies;
/**
 * Esta clase es un tipo especie "gato" del tamagotchi. Hereda todo el contenido de la clase Tamagotchi. 
 * @author Daniel César Vargas Holguín.
 */
public class Gato extends Tamagotchi {
	/**
	 * Byte que representa el caos del tamagotchi.
	 */
	private Byte causarCaos;
	/**
	 *Funcion que recibe como argumento el nombre y el tipo de especie del tamagotchi.
	 *Establece causar a caos como valor predeterminado a 50.
	 * @param nombre el nombre del tamagotchi
	 * @param especie el tipo de especie del tamagotchi.
	 */
	public Gato(String nombre, Especies especie) {
		super(nombre, especie);
		this.causarCaos = 50;
	}
	/**
	 * La funcion obtiene el valor de la causarCaos.
	 * @return devuelve el valor obtenido de causarCaos.
	 */
	public Byte getCausarCaos() {
		return causarCaos;
	}
	/**
	 * La funcion establece el caos del tamagotchi. Aparte he protegido el valor causarCaos para
	 * que no sea menor que 0 y ni mayor que 100.
	 * @param causarCaos es el valor predeterminado de causarCaos.
	 */
	public void setCausarCaos(Byte causarCaos) {
		if (causarCaos < 0) {
			this.causarCaos = 0;
		} else if (causarCaos > 100) {
			this.causarCaos = 100;
		} else {
			this.causarCaos = causarCaos;
		}
	}

	// método
	
	/**
	 * Funcion que hace que el gato cause caos, aparte le quita el estrés y ademas, le da sueño al tamagotchi. 
	 */
	
	public void causarCaos() {
		this.setCausarCaos((byte) (this.getCausarCaos() + 20));
		this.setEstres((byte)(this.getEstres() - 20 ));
		this.setSueño((byte) (this.getSueño() + 20));
	}

	/**
	 * Funcion que decide que el tamagotchi este muerto cuando el hambre sea mayor o igual que 100,
	 * que el sueño sea mayor o igual a 100, que la diversion sea menor o igual 0, que el estres sea
	 * mayor o igual a 100, que la edad sea mayor o igual a 30 y que la causaCaos sea menor o igual 0.
	 * @return false cuando muere el tamagotchi y true cuando sigue vivo el tamagotchi.
	 */
	
	public boolean estaVivo() {
		if (this.getHambre() >= 100 || this.getSueño() >= 100 || this.getDiversion() <= 0 || this.getEstres() >= 100
				|| this.getEdad() >= 30 || this.getCausarCaos() <=0) {
			return false;
		} else {
			return true;
		}
	}
	/**
	 * la funcion que imprime los datos del tamagotchi tipo Gato.
	 */
	public String toString() {
		return super.toString() + "\n\t CausarCaos: " + causarCaos;
	}

}
