package Clases;

public class Escudo extends ElementoConNombre{
	
	private Byte proteccion;

	public Escudo(String nombre, Byte proteccion) {
		super(nombre);
		this.proteccion = proteccion;
	}

	public Byte getProteccion() {
		return proteccion;
	}

	public void setProteccion(Byte proteccion) {
		this.proteccion = proteccion;
	}

	
	public String toString() {
		return super.toString()+"proteccion=" + proteccion;
	}
	
	
}
