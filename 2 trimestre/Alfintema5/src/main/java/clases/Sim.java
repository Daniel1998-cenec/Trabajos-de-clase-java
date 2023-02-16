package clases;
/**
 * Clase que modela un sim del juego de texto los sims
 * @author Emperador
 *
 */
public class Sim {
	
	//Variables interno o atributos: Definen lo que las personas son
	/** El nombre del sim */
	private String nombre;
	
	/** El apellido o apellidos del sim*/
	private String apellido;
	
	/**
	 * Género del sim, tiene que valer h (hombre),
	 * m(mujer) o n (neutro)
	 */
	private char genero;
	
	/**
	 * nivel de hambre del sim 0 a 100, 
	 * 0 es saciado totalmente. 100 esta muerto de hambre
	 */
	private byte hambre;
	
	/**
	 *nivel de sueño del sim de 0 a 100. 0 es totalmente descansado,
	 *y 100 esta muerto de sueño. 
	 */
	private byte sueño;
	
	/**
	 *nivel de suciedad del sim 0 a 100. 0 es limpísimo y 100 esta totalmente sucio. 
	 */
	private byte suciedad;
	
	/**nivel de aburrimiento del 0 a 100. 0 esta bien divertido y 100 totlamente aburrido.*/
	private byte aburrimiento;
	/**
	 * padre del sim
	 */
	private Sim padre;
	/**
	 * madre del sim
	 */
	private Sim madre;
	/**
	 * Perros a su responsabilidad
	 */
	private Perro[] perros;
	
	private Gato[] gatos;
	
	//construtor
	public Sim(String nombre, String apellido, char genero, byte hambre,
			byte sueño, byte suciedad, byte aburrimiento, Sim padre, Sim madre,
			Perro[] perros, Gato[] gatos) {
		
		this.nombre=nombre;
		this.apellido=apellido;
		this.genero=genero;
		this.hambre=hambre;
		this.sueño=sueño;
		this.suciedad=suciedad;
		this.aburrimiento=aburrimiento;
		this.padre=padre;
		this.madre=madre;
		this.perros=perros;
		this.gatos=gatos;
	}
	
	public Sim(String nombre, String apellido, char genero) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.genero=genero;
		this.hambre=50;
		this.sueño=50;
		this.suciedad=50;
		this.aburrimiento=50;
		this.padre=null;
		this.madre=null;
		this.perros=null;
		this.gatos=null;
	}
	
	public Sim(String nombre, String apellido, char genero, Sim madre, Sim padre) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.genero=genero;
		this.hambre=50;
		this.sueño=50;
		this.suciedad=50;
		this.aburrimiento=50;
		this.madre=madre;
		this.padre=padre;
		this.perros=null;
		this.gatos=null;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
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

	public Sim getPadre() {
		return padre;
	}

	public void setPadre(Sim padre) {
		this.padre = padre;
	}

	public Sim getMadre() {
		return madre;
	}

	public void setMadre(Sim madre) {
		this.madre = madre;
	}

	public Perro[] getPerros() {
		return perros;
	}

	public void setPerros(Perro[] perros) {
		this.perros = perros;
	}

	public Gato[] getGatos() {
		return gatos;
	}

	public void setGatos(Gato[] gatos) {
		this.gatos = gatos;
	}

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
				"\n\tAburrimiento:"+this.aburrimiento+"\n";
		
		//if(perros !=null || gatos !=null) {
			//ret+="\tDueño de: ";
		//}
		
		if(perros!=null) {
			for(byte i=0;i<perros.length;i++) {
				ret+= this.perros[i]+" ";
				
			}
		}
		ret+="\n";
		
		if(gatos!=null) {
			for (byte i=0;i<gatos.length;i++) {
				ret+= this.gatos[i]+" ";
			}
		}
		
		return ret;
		
	}
}
