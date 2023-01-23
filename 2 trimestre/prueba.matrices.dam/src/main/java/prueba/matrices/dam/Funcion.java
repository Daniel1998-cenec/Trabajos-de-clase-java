package prueba.matrices.dam;

import java.util.Random;

public class Funcion {
	public static char[][] creaSopa(byte fil, byte col) {
		char[][] ret = new char[fil][col];
		Random r = new Random();
		for (byte i = 0; i < ret.length; i++) {
			for (byte j = 0; j < ret[i].length; j++) {
				ret[i][j] = (char) r.nextInt('a', ('z' + 1));
			}
		}
		return ret;
	}

	public static String imprimeMatriz(char[][] matriz) {
		String ret = "";
		for (byte i = 0; i < matriz.length; i++) {
			for (byte j = 0; j < matriz[i].length; j++) {
				ret += matriz[i][j] + "\t";
			}
			ret += "\n";
		}
		return ret;
	}
}
