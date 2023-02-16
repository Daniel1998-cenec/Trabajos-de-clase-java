package clases;

public class Gato {
	/** El nombre del gato */
	private String nombre;

	/**
	 * Género del gato, tiene que valer h (hombre) y m(mujer)
	 */
	private char genero;

	/**
	 * nivel de hambre del gato 0 a 100, 0 es saciado totalmente. 100 esta muerto de
	 * hambre
	 */
	private byte hambre;

	/**
	 * nivel de sueño del gato de 0 a 100. 0 es totalmente descansado, y 100 esta
	 * muerto de sueño.
	 */
	private byte sueño;

	/**
	 * nivel de suciedad del gato 0 a 100. 0 es limpísimo y 100 esta totalmente
	 * sucio.
	 */
	private byte suciedad;

	/**
	 * nivel de aburrimiento del gato 0 a 100. 0 esta bien divertido y 100 totalmente
	 * aburrido.
	 */
	private byte aburrimiento;
	/**
	 * nivel de tedenciaAlCaos del gato 0 a 100. 0 esta bien tranquilo y 100 totalmente
	 * cenbrarás el caos.
	 */
	private byte tendenciaAlCaos;
	/**
	 * Raza del gato
	 */
	private String raza;
	/**
	 * pelaje del gato
	 */
	private String pelaje;
	/**
	 * Dueño/a del gato
	 */
	private Sim dueño;
	
	public Gato(String nombre, String raza, char genero,
			byte hambre, byte sueño, byte suciedad, byte aburrimiento,
			byte tendenciaAlCaos,Sim dueño) {
		this.nombre = nombre;
		this.genero = genero;
		this.hambre = hambre;
		this.sueño = sueño;
		this.suciedad = suciedad;
		this.aburrimiento = aburrimiento;
		this.tendenciaAlCaos = tendenciaAlCaos;
		this.raza = raza;
		this.dueño = dueño;
	}
	
	public Gato(String nombre, String raza, char genero,Sim dueño) {
		this.nombre = nombre;
		this.genero = genero;
		this.hambre = 50;
		this.sueño = 50;
		this.suciedad = 50;
		this.aburrimiento = 50;
		this.tendenciaAlCaos = 50;
		this.raza = raza;
		this.dueño = dueño;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public byte getHambre() {
		return hambre;
	}

	public void setHambre(byte hambre) {
		this.hambre = hambre;
	}

	public byte getSueño() {
		return sueño;
	}

	public void setSueño(byte sueño) {
		this.sueño = sueño;
	}

	public byte getSuciedad() {
		return suciedad;
	}

	public void setSuciedad(byte suciedad) {
		this.suciedad = suciedad;
	}

	public byte getAburrimiento() {
		return aburrimiento;
	}

	public void setAburrimiento(byte aburrimiento) {
		this.aburrimiento = aburrimiento;
	}

	public byte getTendenciaAlCaos() {
		return tendenciaAlCaos;
	}

	public void setTendenciaAlCaos(byte tendenciaAlCaos) {
		this.tendenciaAlCaos = tendenciaAlCaos;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getPelaje() {
		return pelaje;
	}

	public void setPelaje(String pelaje) {
		this.pelaje = pelaje;
	}

	public Sim getDueño() {
		return dueño;
	}

	public void setDueño(Sim dueño) {
		this.dueño = dueño;
	}

	// Métodos: Lo que los gatos saben hacer
	/**
	 * funcion que resta 20 de hambrea del gato que llame
	 */
	public void comer() {
		this.hambre -= 20;
	}

	/**
	 * funcion que imprime formateados todos los datos de un gato
	 * @return los datos del sim en varias líneas de texto.
	 */

	public String toString() {
		String ret = "";
		ret += this.nombre + " - " +" (" + (genero == 'h' ? "(gato)" : "gata") + " " + this.raza
				+ ")\n\tHambre:" + this.hambre + "\n\tSueño:" + this.sueño + "\n\tSuciedad:" + this.suciedad
				+ "\n\tAburrimiento:" + this.aburrimiento + "\n\ttendenciaAlCaos:" + this.tendenciaAlCaos+"\n";

		return ret;
	}
}
