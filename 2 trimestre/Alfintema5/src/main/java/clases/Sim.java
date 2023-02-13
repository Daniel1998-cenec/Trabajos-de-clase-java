package clases;
/**
 * Clase que modela un sim del juego de texto los sims
 * @author Emperador
 *
 */
public class Sim {
	
	//Variables interno o atributos: Definen lo que las personas son
	/** El nombre del sim */
	public String nombre;
	
	/** El apellido o apellidos del sim*/
	public String apellido;
	
	/**
	 * Género del sim, tiene que valer h (hombre),
	 * m(mujer) o n (neutro)
	 */
	public char genero;
	
	/**
	 * nivel de hambre del sim 0 a 100, 
	 * 0 es saciado totalmente. 100 esta muerto de hambre
	 */
	public byte hambre;
	
	/**
	 *nivel de sueño del sim de 0 a 100. 0 es totalmente descansado,
	 *y 100 esta muerto de sueño. 
	 */
	public byte sueño;
	
	/**
	 *nivel de suciedad del sim 0 a 100. 0 es limpísimo y 100 esta totalmente sucio. 
	 */
	public byte suciedad;
	
	/**nivel de aburrimiento del 0 a 100. 0 esta bien divertido y 100 totlamente aburrido.*/
	public byte aburrimiento;
	/**
	 * padre del sim
	 */
	public Sim padre;
	/**
	 * madre del sim
	 */
	public Sim madre;
	/**
	 * Perros a su responsabilidad
	 */
	public Perro[] perros;
	
	//Métodos: Lo que las personas saben hacer
	/**
	 * funcion que resta 20 de hambrea del sim que llame
	 */
	public void comer() {
		this.hambre-=20;
	}
	/**
	 * funcion que imprime formateados todos los datos de un sim
	 * @return los datos del sim en varias líneas de texto.
	 */
	public String toString() {
		String ret="";
		ret+=this.nombre+" "+this.apellido+" ("+
		(genero=='h'?"Hombre":genero=='m'?"Mujer":"Género Neutro")+
		")\n\tHambre:"+this.hambre+
		"\n\tSueño:"+this.sueño+
		"\n\tSuciedad:"+this.suciedad+
		"\n\tAburrimiento:"+this.aburrimiento;
		
		return ret;
	}
}
