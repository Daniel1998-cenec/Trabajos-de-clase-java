package clases;

public class Gato {
	/** El nombre del gato */
	public String nombre;

	/**
	 * Género del gato, tiene que valer h (hombre) y m(mujer)
	 */
	public char genero;

	/**
	 * nivel de hambre del gato 0 a 100, 0 es saciado totalmente. 100 esta muerto de
	 * hambre
	 */
	public byte hambre;

	/**
	 * nivel de sueño del gato de 0 a 100. 0 es totalmente descansado, y 100 esta
	 * muerto de sueño.
	 */
	public byte sueño;

	/**
	 * nivel de suciedad del gato 0 a 100. 0 es limpísimo y 100 esta totalmente
	 * sucio.
	 */
	public byte suciedad;

	/**
	 * nivel de aburrimiento del gato 0 a 100. 0 esta bien divertido y 100 totalmente
	 * aburrido.
	 */
	public byte aburrimiento;
	/**
	 * nivel de tedenciaAlCaos del gato 0 a 100. 0 esta bien tranquilo y 100 totalmente
	 * cenbrarás el caos.
	 */
	public byte tendenciaAlCaos;
	/**
	 * Raza del gato
	 */
	public String raza;
	/**
	 * pelaje del gato
	 */
	public String pelaje;
	/**
	 * Dueño/a del gato
	 */
	public Sim dueño;
	
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
