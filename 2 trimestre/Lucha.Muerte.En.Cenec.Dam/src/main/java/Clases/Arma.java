package Clases;

public class Arma extends ElementoConNombre{

	private Byte daño;
	
	public Arma(String nombre, Byte daño) {
		super(nombre);
		this.daño = daño;
	}

	public Byte getDaño() {
		return daño;
	}

	public void setDaño(Byte daño) {
		this.daño = daño;
	}

	public String toString() {
		return super.toString()+"daño="+ daño;
	}
	
	
	

}
