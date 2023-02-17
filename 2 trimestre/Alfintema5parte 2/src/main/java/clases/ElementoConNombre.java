package clases;

public class ElementoConNombre {
	private String nombre;
	
	//constructor
	public ElementoConNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String toString() {
		return this.nombre;
	}
	
	
}
