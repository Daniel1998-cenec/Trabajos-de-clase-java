package clases;
/**
 * Clase que modela a un perro en los sims
 * @author Emperador
 *
 */
public class Perro {
	/** El nombre del perro */
	private String nombre;
	
	/**
	 * Género del perro, tiene que valer h (hombre) y m(mujer)
	 */
	private char genero;
	
	/**
	 * nivel de hambre del perro 0 a 100, 
	 * 0 es saciado totalmente. 100 esta muerto de hambre
	 */
	private byte hambre;
	
	/**
	 *nivel de sueño del perro de 0 a 100. 0 es totalmente descansado,
	 *y 100 esta muerto de sueño. 
	 */
	private byte sueño;
	
	/**
	 *nivel de suciedad del perro 0 a 100. 0 es limpísimo y 100 esta totalmente sucio. 
	 */
	private byte suciedad;
	
	/**nivel de aburrimiento del 0 a 100. 0 esta bien divertido y 100 totlamente aburrido.*/
	private byte aburrimiento;
	/**
	 * Raza del perro
	 */
	private String raza;
	/**
	 * pelaje del perro
	 */
	private String pelaje;
	/**
	 * Dueño/a del perro
	 */
	private Sim dueño;
	
	public Perro(String nombre, String raza, String pelaje, char genero,
			byte hambre, byte sueño, byte suciedad, byte aburrimiento,
			 Sim dueño) {
		this.nombre = nombre;
		this.genero = genero;
		this.hambre = hambre;
		this.sueño = sueño;
		this.suciedad = suciedad;
		this.aburrimiento = aburrimiento;
		this.raza = raza;
		this.pelaje = pelaje;
		this.dueño = dueño;
	}
	
	public Perro(String nombre, String raza, String pelaje, char genero,
			 Sim dueño) {
		this.nombre = nombre;
		this.genero = genero;
		this.hambre = 50;
		this.sueño = 50;
		this.suciedad = 50;
		this.aburrimiento = 50;
		this.raza = raza;
		this.pelaje = pelaje;
		this.dueño = dueño;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public char getGenero() {
		return this.genero;
	}
	
	public void setNombre(String n) {
		this.nombre=n;
	}
	
	public Sim getDueño() {
		return this.dueño;
	}
	
	public void setDueño(Sim d) {
		this.dueño=d;
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
