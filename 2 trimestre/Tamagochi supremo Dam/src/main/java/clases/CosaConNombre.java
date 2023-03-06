package clases;
/**
 * Esta clase incluye la funcion nombre
 * @author Daniel Cesar Vargas Holguín.
 *
 */
public class CosaConNombre {
	/**
	 * String que representa el nombre de todas las clases
	 */
	private String nombre;
	/**
	 * Funcion que tiene como argumento el nombre,
	 * @param nombre el nombre de los objetos
	 */
	public CosaConNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 La funcion obtiene el nombre 
     * @return devuelve el nombre. 
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * La funcion establece el nombre.
     * @param nombre, establece el nombre del objeto.
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * la funcion que imprime el nombre de los objetos.
	 */
	public String toString() {
		return "\tNombre: " + nombre;
	}
	
	
	
	
}
