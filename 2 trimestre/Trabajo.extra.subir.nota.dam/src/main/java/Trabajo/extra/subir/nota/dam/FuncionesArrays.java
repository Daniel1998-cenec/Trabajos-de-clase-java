package Trabajo.extra.subir.nota.dam;

import java.util.Random;

public class FuncionesArrays {
	// Crea una funcion llamada generaTablero, que reciba por argumentos
	// un byte tamaño y devuelva un String[]. Dentro de la función, crea
	// un String[] del tamaño indicado por argumentos, y rellena todas
	// sus posiciones con el String "_". Luego, devuelve el array.
	
	public static String[] generaTablero(byte size) {
		String[] tablero = new String[size];
		for (byte i = 0; i < size; i++) {
			tablero[i] = "🏻";
		} // for
		return tablero;
	} // funcion

	public static String imprime(String[] array) {
		Random r = new Random();
		String ret = "";
		ret += r.nextInt((byte) 4);
		return ret; // 🏻

	} // funcion
}
