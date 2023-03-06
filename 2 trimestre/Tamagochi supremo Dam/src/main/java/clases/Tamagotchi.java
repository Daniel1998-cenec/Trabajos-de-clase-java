package clases;

import enumeration.Especies;

/**
 * Esta clase incluye las funciones de edad, especie, hambre, sueño, diversión y
 * estres del tamagotchi que hereda de la clase CosaConNombre
 * 
 * @author Daniel Cesar Vargas Holguín.
 */
public class Tamagotchi extends CosaConNombre {
	/**
	 * Float que representa la edad del tamagotchi.
	 */
	private Float edad;
	/**
	 * Especie que representa el tipo de tamagotchi.
	 */
	private Especies especie;
	/**
	 * Byte que representa el hambre del tamagotchi.
	 */
	private Byte hambre;
	/**
	 * Byte que representa el sueño del tamagotchi.
	 */
	private Byte sueño;
	/**
	 * Byte que representa la diversion del tamagotchi.
	 */
	private Byte diversion;
	/**
	 * Byte que representa el estrés del tamagotchi.
	 */
	private Byte estres;

	/**
	 * Funcion que establece las estadística del tamagotchi. He establecido hambre,
	 * sueño, diversion y estres a 50 como valor predeterminado. Recibe como
	 * argumento un string de nombre y una especies de tipo de especie que sea el
	 * tamagotchi.
	 * 
	 * @param nombre  el nombre que va a tener el tamagotchi
	 * @param especie la especie que va ser elegida el tamagotchi.
	 */
	public Tamagotchi(String nombre, Especies especie) {
		super(nombre);
		this.edad = (float) 0;
		this.especie = especie;
		this.hambre = 50;
		this.sueño = 50;
		this.diversion = 50;
		this.estres = 50;
	}

	/**
	 * La funcion obtiene el valor de la edad.
	 * 
	 * @return devuelve el valor de la edad.
	 */
	public Float getEdad() {
		return edad;
	}

	/**
	 * La funcion establece el valor de la edad.
	 * 
	 * @param devuelve el valor de la edad establecido.
	 */
	public void setEdad(Float edad) {
		this.edad = edad;
	}

	/**
	 * La funcion obtiene el valor de la especie.
	 * 
	 * @return devuelve el valor de la especie obtenida.
	 */
	public Especies getEspecie() {
		return especie;
	}

	/**
	 * La funcion establece la especie del tamagotchi.
	 * 
	 * @param especie, establecemos como argumento el tipo de especie que va ser
	 *                 nuestro tamagotchi.
	 */
	public void setEspecie(Especies especie) {
		this.especie = especie;
	}

	/**
	 * La funcion obtiene el valor del hambre del tamagotchi.
	 * 
	 * @return devuelve el valor del hambre.
	 */
	public Byte getHambre() {
		return hambre;
	}

	/**
	 * La funcion establece el hambre del tamagotchi. Aparte he protegido el valor
	 * hambre para que no sea menor que 0 y ni mayor que 100.
	 * 
	 * @param hambre es el valor predeterminado del hambre
	 */
	public void setHambre(Byte hambre) {
		if (hambre < 0) {
			this.hambre = 0;
		} else if (hambre > 100) {
			this.hambre = 100;
		} else {
			this.hambre = hambre;
		}
	}

	/**
	 * la funcion obtiene el valor de sueño.
	 * 
	 * @return devuelve el valor de sueño
	 */
	public Byte getSueño() {
		return sueño;
	}

	/**
	 * La funcion establece el sueño del tamagotchi. Aparte he protegido el valor
	 * sueño para que no sea menor que 0 y ni mayor que 100.
	 * 
	 * @param sueño es el valor predeterminado de sueño
	 */
	public void setSueño(Byte sueño) {
		if (sueño < 0) {
			this.sueño = 0;
		} else if (sueño > 100) {
			this.sueño = 100;
		} else {
			this.sueño = sueño;
		}
	}

	/**
	 * la funcion obtiene el valor de diversion.
	 * 
	 * @return devuelve el valor de diversion.
	 */
	public Byte getDiversion() {
		return diversion;
	}

	/**
	 * La funcion establece la diversion del tamagotchi. Aparte he protegido el
	 * valor de diversion para que no sea menor que 0 y ni mayor que 100.
	 * 
	 * @param diversion es el valor predeterminado de diversion
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
	 * la funcion obtiene el valor de estres.
	 * 
	 * @return devuelve el valor de estres.
	 */
	public Byte getEstres() {
		return estres;
	}

	/**
	 * La funcion establece el estres del tamagotchi. Aparte he protegido el valor
	 * estres para que no sea menor que 0 y ni mayor que 100.
	 * 
	 * @param estres es el valor predeterminado de estres
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

	// metodo
	/**
	 * La funcion hace la accion de comer que basicamente consiste quitar el hambre.
	 * 
	 * @param c es un objeto de la clase comida que quita el hambre y suma el sueño
	 *          como valor negativo.
	 */
	public void comer(Comida c) {
		this.setHambre((byte) (this.getHambre() - c.getValorEnergetico()));
		this.setSueño((byte) (this.getSueño() + c.getMorriña()));
	}

	/**
	 * La funcion hace la accion de dormir que basicamente consiste quitar el sueño.
	 * Aparte, le da un valor negativo que es dar hambre al tamagotchi.
	 */
	public void dormir() {
		this.setSueño((byte) (this.getSueño() - 20));
		this.setHambre((byte) (this.getHambre() + 20));
	}

	/**
	 * La funcion hace la accion de jugar que basicamente consiste quitar el estres.
	 * Aparte, divierte al tamagotchi.
	 * 
	 * @param j es un objeto de la clase juego que da diversion y quita el estres
	 *          como valor negativo.
	 */
	public void jugar(Juego j) {
		this.setDiversion((byte) (this.getDiversion() + j.getDiversion()));
		this.setEstres((byte) (this.getEstres() + j.getEstres()));
	}

	/**
	 * La funcion hace la accion de relajarse que basicamente consiste quitar el
	 * estres. Aparte, le da un valor negativo que es dar hambre al tamagotchi.
	 */
	public void relajarse() {
		this.setEstres((byte) (this.getEstres() - 20));
		this.setHambre((byte) (this.getHambre() + 20));
	}

	/**
	 * Funcion que decide que el tamagotchi este muerto cuando el hambre sea mayor o
	 * igual que 100, que el sueño sea mayor o igual a 100, que la diversion sea
	 * menor o igual 0, que el estres sea mayor o igual a 100 y que la edad sea
	 * mayor o igual a 30.
	 * 
	 * @return false cuando muere el tamagotchi y true cuando sigue vivo el
	 *         tamagotchi.
	 */
	public boolean estaVivo() {
		if (hambre >= 100 || sueño >= 100 || diversion <= 0 || estres >= 100 || edad >= 30) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * La funcion que decide las ''rondas'' que va a durar el tamagotchi.
	 */
	public void crecer() {
		edad++;
	}

	/**
	 * la funcion que imprime los datos del tamagotchi.
	 */
	public String toString() {
		return super.toString() + "\n\tEdad: " + edad + "\n\tEspecie: " + especie + "\n\t Hambre: " + hambre
				+ "\n\t Sueño: " + sueño + "\n\t Diversion: " + diversion + "\n\t Estres: " + estres;
	}

}
