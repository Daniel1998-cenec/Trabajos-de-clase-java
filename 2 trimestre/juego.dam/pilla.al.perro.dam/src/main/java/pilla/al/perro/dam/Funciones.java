package pilla.al.perro.dam;

import java.util.Random;
import java.util.Scanner;

public class Funciones {
	public static byte pideNumerosEntre(String msg, byte min, byte max) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		byte numero = Byte.parseByte(sc.next());
		if (numero < min || numero > max) {
			return pideNumerosEntre(msg, min, max);
		}
		return numero;
	}

	public static char[] creaTablero(byte tamanio) {
		char[] tablero = new char[tamanio];
		for (byte i = 0; i < tablero.length; i++) {
			tablero[i] = '_';
		}
		return tablero;
	}

	public static String imprimeArrayBonico(char[] array) {
		String ret = "| ";
		for (byte i = 0; i < array.length; i++) {
			ret += array[i] + "\t";
		}
		ret += "|\n  ";
		for (byte i = 0; i < array.length; i++) {
			ret+=i+"\t";
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
}
