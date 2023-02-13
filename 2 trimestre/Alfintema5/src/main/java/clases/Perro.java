package clases;
/**
 * Clase que modela a un perro en los sims
 * @author Emperador
 *
 */
public class Perro {
	/** El nombre del perro */
	public String nombre;
	
	/**
	 * Género del perro, tiene que valer h (hombre) y m(mujer)
	 */
	public char genero;
	
	/**
	 * nivel de hambre del perro 0 a 100, 
	 * 0 es saciado totalmente. 100 esta muerto de hambre
	 */
	public byte hambre;
	
	/**
	 *nivel de sueño del perro de 0 a 100. 0 es totalmente descansado,
	 *y 100 esta muerto de sueño. 
	 */
	public byte sueño;
	
	/**
	 *nivel de suciedad del perro 0 a 100. 0 es limpísimo y 100 esta totalmente sucio. 
	 */
	public byte suciedad;
	
	/**nivel de aburrimiento del 0 a 100. 0 esta bien divertido y 100 totlamente aburrido.*/
	public byte aburrimiento;
	/**
	 * Raza del perro
	 */
	public String raza;
	/**
	 * pelaje del perro
	 */
	public String pelaje;
	/**
	 * Dueño/a del perro
	 */
	public Sim dueño;
	
	//Métodos: Lo que las personas saben hacer
		/**
		 * funcion que resta 20 de hambrea del sim que llame
		 */
		public void comer() {
			this.hambre-=20;
		}
		
		/**
		 * funcion que imprime formateados todos los datos de un perro
		 * @return los datos del perro en varias líneas de texto.
		 */
		
		public String toString() {
			String ret="";
			ret+=this.nombre+" - " +
			(genero=='h'?"(Perro)":"Perra")+" "+this.raza+
			".(Pelaje "+this.pelaje+
			")\n\tHambre:"+this.hambre+
			"\n\tSueño:"+this.sueño+
			"\n\tSuciedad:"+this.suciedad+
			"\n\tAburrimiento:"+this.aburrimiento;
			
			return ret;
		}
}
