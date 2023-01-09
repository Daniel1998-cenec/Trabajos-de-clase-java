package arrays.dam;
/**
 * Función que dado un array, una posición y un valor, mete (si puede)
 * el valor en la posición del array indicada.
 * @daniel array array donde se va a cambiar el valor de una de las posiciones.
 * @daniel posicion la posicion del array cuyo valor se va a cambiar´
 * @daniel valor valor que se va a introducir en una posicion del array.
 * @return true si ha podido insertar, false si no.
 *
 */
public class Funciones {
	
	public static boolean valorPosicion(String[] array,byte posicion,String valor) {
		if (posicion<0||posicion>=array.length) {
			return false;
		}
		array[posicion]=valor;
		return true;
	}
	
}
