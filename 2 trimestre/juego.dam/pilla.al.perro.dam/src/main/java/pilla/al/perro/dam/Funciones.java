package pilla.al.perro.dam;

import java.util.Random;
import java.util.Scanner;
/**
 * Este es un proyecto en el cual vamos a usar las funciones para el juego de la pelona.
 * @author Daniel Cesar Vargas Holguin
 */
public class Funciones {
	/**
	 * Esta funcion decide cuantos casillas va a tener el tablero(seria un minímo de 5 a 15 casillas)
	 * @param msg. Es un string, en el cual podriamos en el main el enunciado que queremos hacer al usuario
	 * @param min. El mínimo de casillas 
	 * @param max el máximo de casillas
	 * @return el numero de casillas que este compuesto el tablero
	 */
	public static byte pideNumerosEntre(String msg, byte min, byte max) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		byte numero = Byte.parseByte(sc.next());
		if (numero < min || numero > max) {
			return pideNumerosEntre(msg, min, max);
		}
		return numero;
	}
	/**
	 * Esta funcion crea el tablero del juego
	 * @param tamanio. El tañano que tendra el tablero
	 * @return devuelve el '_' que forma el tamaño del tablero.
	 */
	public static char[] creaTablero(byte tamanio) {
		char[] tablero = new char[tamanio];
		for (byte i = 0; i < tablero.length; i++) {
			tablero[i] = '_';
		}
		return tablero;
	}
	/**
	 * Esta función dibuja "el límite que son las barritas (||) al principio y al final del tablero de juego "
	 * @param frente se coloca al incicio esta "|"
	 * @param fondo se coloca al final esta "|"
	 * @return devuelve "|" tabulada porque tiene una"\t".
	 */
	public static String imprimeArrayBonico(char[] frente, char[] fondo) {
		String ret = "| ";
		for (byte i = 0; i < frente.length; i++) {
			if (frente[i] != '_') {
				ret += frente[i] + "\t";
			} else {
				ret += fondo[i] + "\t";
			}
		}
		ret += "|\n  ";
		for (byte i = 0; i < frente.length; i++) {
			ret += i + "\t";
		}
		return ret;
	}

	/**
	 * Funcion que coloca en una posicion aleatoria del array QUE CONTENGA _ el
	 * caracter que se pasa por segundo argumento
	 * 
	 * @param destino  array que se modificará
	 * @param caracter el caracter que se insertará aleatoriamente en una posicion
	 *                 QUE CONTENGA _
	 * @return la posicion en la que se ha insertado el caracter
	 */

	public static byte colocaAleatoriamente(char[] destino, char caracter) {
		Random r = new Random();
		byte posicion = (byte) r.nextInt(destino.length);
		if (destino[posicion] != '_') {
			return colocaAleatoriamente(destino, caracter);
		}
		destino[posicion] = caracter;
		return posicion;
	}
	/**
	 * Esta funcion hace que la "posPelona" se mueva o bien derecha o izquierda
	 * @param tablero. Logra hacer los movimientos dentro del tablero
	 * @param simbolo. Seria la posPelona
	 * @param direccion. Iria derecha o izquierda
	 * @param posicionElemento. Donde esta situado el simbolo.
	 * @return la posicion del simbolo.
	 */
	public static byte moverElemento(char[] tablero, char simbolo, byte direccion, byte posicionElemento) {

		tablero[posicionElemento] = '_';
		// En segundo lugar, cambio la posicion de la pelona
		if (direccion == -1) {
			if (posicionElemento != 0) {
				posicionElemento--;
			} else {// Tratamiento especial para el caso extremo
				posicionElemento = (byte) (tablero.length - 1);
			}
		}
		if (direccion == 1) {
			if (posicionElemento != tablero.length - 1) {
				posicionElemento++;
			} else {// Tratamiento especial para el caso extremo
				posicionElemento = 0;
			}

		}
		// Por último, pinto a la pelona en su nueva posición
		tablero[posicionElemento] = simbolo;

		return posicionElemento;
	}
}
