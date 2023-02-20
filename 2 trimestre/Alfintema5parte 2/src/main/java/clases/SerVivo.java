package clases;

public abstract class SerVivo extends ElementoConNombre {

	private char genero;
	private byte hambre;
	private byte sueño;
	private byte aburrimiento;
	private byte suciedad;
	
	public SerVivo(String nombre,char genero, byte hambre, byte sueño, byte aburrimiento, byte suciedad) {
		super(nombre);
		this.genero = genero;
		this.setHambre(hambre);
		this.sueño = sueño;
		this.aburrimiento = aburrimiento;
		this.suciedad = suciedad;
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
		if(hambre<0) {
			this.hambre = 0;
		}else if (hambre>100) {
			this.hambre=100;
		}else {
			this.hambre=hambre;
		}
		
	}

	public byte getSueño() {
		return sueño;
	}

	public void setSueño(byte sueño) {
		this.sueño = sueño;
	}

	public byte getAburrimiento() {
		return aburrimiento;
	}

	public void setAburrimiento(byte aburrimiento) {
		this.aburrimiento = aburrimiento;
	}

	public byte getSuciedad() {
		return suciedad;
	}

	public void setSuciedad(byte suciedad) {
		this.suciedad = suciedad;
	}
	
	//Métodos: Lo que las personas saben hacer
	/**
	* funcion que resta 20 de hambrea del sim que llame
	*/
	public void comer(Comida c) {
		this.setHambre((byte)(this.hambre-c.getValorNutritivo()));
	}

	public String toString() {
		return super.toString()+"\n\tgenero " + genero + "\n\thambre=" + hambre + "\n\tsueño=" + sueño + "\n\taburrimiento="
				+ aburrimiento + "\n\tsuciedad=" + suciedad;
	}
	
	
	
	
	
	
}
