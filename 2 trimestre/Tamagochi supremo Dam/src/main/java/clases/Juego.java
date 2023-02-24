package clases;

public class Juego extends CosaConNombre {

	private Byte diversion;
	private Byte estres;
	public Juego(String nombre, Byte diversion, Byte estres) {
		super(nombre);
		this.diversion = diversion;
		this.estres = estres;
	}
	public Byte getDiversion() {
		return diversion;
	}
	public void setDiversion(Byte diversion) {
		this.diversion = diversion;
	}
	public Byte getEstres() {
		return estres;
	}
	public void setEstres(Byte estres) {
		this.estres = estres;
	}
	
	public String toString() {
		return super.toString()+"\n\tDiversion: " + diversion + "\n\tEstres: " + estres;
	}
	
	
}
