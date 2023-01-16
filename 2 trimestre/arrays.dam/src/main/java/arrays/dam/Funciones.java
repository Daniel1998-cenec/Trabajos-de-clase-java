package arrays.dam;

import java.util.Random;


public class Funciones {
	/* Función que dado un array, una posición y un valor, mete (si puede) el valor
	 * en la posición del array indicada.
	 * 
	 * @daniel array array donde se va a cambiar el valor de una de las posiciones.
	 * @daniel posicion la posicion del array cuyo valor se va a cambiar.
	 * @daniel valor valor que se va a introducir en una posicion del array.
	 * @return true si ha podido insertar, false si no.
	 *
	 */
	public static boolean valorPosicion(String[] array, byte posicion, String valor) {
		if (posicion < 0 || posicion >= array.length) {
			return false;
		}
		array[posicion] = valor;
		return true;
	}

	/**
	 * Funcion que da un array y dos posiciones, 
	 * que intercambian entre si una letra de la palabra que puede ofrecer el array
	 * en otro lugar de la misma palabra
	 * @param array usamos la longitud del array para comprobar la posicion dentro del array
	 * @param p1 un posicion de la array
	 * @param p2 otro posicion de la array
	 * @return devuelve true si el cambio de la posicion esta dentro del array, si es falso, no, lo hace.
	 */
	public static boolean intercambio(char[] array, byte p1, byte p2) {
		if (p1 < 0 || p1 >= array.length || p2 < 0 || p2 >= array.length) {
			return false;
		} else {

			char auxiliar = array[p1];
			array[p1] = array[p2];
			array[p2] = auxiliar;
			return true;
		}

	}

	/**
	 * La funcion convierte un string en un array.
	 * @param orig es un string.
	 * @return devuelve el string convertido en array de char. 
	 */
	private static char[] stringAArray(String orig) {
		char[] ret = new char[orig.length()];
		for (byte i = 0; i < orig.length(); i++) {
			ret[i] = orig.charAt(i);
		}
		return ret;

	}

	/**
	 * La funcion hace publico la funcion stringAArray.
	 * @return Devuelve la funcion stringAArray con el nombre arrayAlAzar.
	 */
	public static char[] arrayAlAzar() {
		return stringAArray(palabraAlAzar());
	}

	/**
	 * La funcion saca de manera random los string que hay dentro del array.
	 * @return devuelve una plabra aleatoria del array de string.
	 */
	private static String palabraAlAzar() {
		String[] palabrasPosibles = { "algoritmo", "igual", "parecidas", "cancamusa", "teclado", "bolsa",
				"ornitorrinco", "motosierra", "cermuzo", "kamekameha", "australopitecido", "redencion", "patracio" };
		Random r = new Random();
		return palabrasPosibles[r.nextInt(palabrasPosibles.length)];
	}

	/**
	 * La funcion tabula cada letra del array.
	 * @param array Recorre la longitud del array para tabulear cada espacio que lo compone
	 * @return devuelve tabulado con espacio al array
	 */
	public static String imprimeArray(char[] array) {
		String ret = "";
		// for(char actual:array){
		// ret+=actual+"\t";
		for (byte i = 0; i < array.length; i++) {
			ret += array[i] + "\t";
		}
		return ret;
	}

	/**
	 * La funcion guarda una copia de otra array
	 * @param orig es el original
	 * @return devuelvo la copia del orig 
	 */
	public static char[] copiaArray(char[] orig) {
		char[] ret = new char[orig.length];
		for (byte i = 0; i < orig.length; i++) {
			ret[i] = orig[i];
		}
		return ret;
	}

	/**
	 * Esta funcion lo que hace si ambas array son iguales.
	 * @param arr1 un array 
	 * @param arr2 otro array
	 * @return devuelve true si ambas arrays son iguales y false, sino, lo es.
	 */
	public static boolean sonIguales(char[] arr1, char[] arr2) {
		if (arr1.length == arr2.length) {
			for (byte i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

}
