package examen.mapas.solucion.dam;

import java.util.Random;
import java.util.Scanner;

public class Funciones {

	public static short pideNumero(String msg, byte minimo, short maximo) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		short numero = Short.parseShort(sc.nextLine());
		if (numero < minimo || numero > maximo) {
			return pideNumero(msg, minimo, maximo);
		}
		return numero;
	}

	public static char[][] matrizDeAgua(byte nFilas, byte nColumnas) {
		char[][] matriz = new char[nFilas][nColumnas];
		for (byte i = 0; i < matriz.length; i++) {
			for (byte j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = '~';
			}
		}
		return matriz;
	}

	public static void ponerTerreno(char[][] matriz, short nContinentes) {
		Random r = new Random();
		for (short i = 0; i < nContinentes; i++) {
			byte fila;
			byte columna;
			do {
				fila = (byte) r.nextInt(matriz.length);
				columna = (byte) r.nextInt(matriz[fila].length);
			} while (matriz[fila][columna] != '~');
			matriz[fila][columna] = '#';
		}
	}

	public static String imprimeMatriz(char[][] matriz) {
		String ret = "";
		for (byte i = 0; i < matriz.length; i++) {
			for (byte j = 0; j < matriz[i].length; j++) {
				ret += matriz[i][j];
			}
			ret += "\n";
		}
		return ret;
	}

	public static void extenderTerreno(char[][] matriz) {
		Random r = new Random();
		for (byte i = 0; i < matriz.length; i++) {
			for (byte j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == '#') {
					if (i > 0 && j > 0 && matriz[i - 1][j - 1] != '#') { // arriba a la izda
						boolean pongoPorciento = r.nextInt(100) < 40;
						if (pongoPorciento) {
							matriz[i - 1][j - 1] = '%';
						}
					}
					if (i > 0 && matriz[i - 1][j] != '#') { // Justo arriba
						matriz[i - 1][j] = (r.nextInt(100) < 40 ? '%' : matriz[i - 1][j]);
					}
					if (i > 0 && j < matriz[i].length - 1 && matriz[i - 1][j + 1] != '#') { // arriba a la dcha
						matriz[i - 1][j + 1] = (r.nextInt(100) < 40 ? '%' : matriz[i - 1][j + 1]);
					}
					if (j > 0 && matriz[i][j - 1] != '#') { // Misma fila, a la izda
						matriz[i][j - 1] = (r.nextInt(100) < 40 ? '%' : matriz[i][j - 1]);
					}
					if (j < matriz[i].length - 1 && matriz[i][j + 1] != '#') { // Misma fila, a la dcha
						matriz[i][j + 1] = (r.nextInt(100) < 40 ? '%' : matriz[i][j + 1]);
					}
					if (i < matriz.length - 1 && j > 0 && matriz[i + 1][j - 1] != '#') { // Debajo izquierda
						matriz[i + 1][j - 1] = (r.nextInt(100) < 40 ? '%' : matriz[i + 1][j - 1]);
					}
					if (i < matriz.length - 1 && matriz[i + 1][j] != '#') { // Justo debajo
						matriz[i + 1][j] = (r.nextInt(100) < 40 ? '%' : matriz[i + 1][j]);
					}
					if (i < matriz.length - 1 && j < matriz[i].length - 1 && matriz[i + 1][j + 1] != '#') { // Debajo
																											// derecha
						matriz[i + 1][j + 1] = (r.nextInt(100) < 40 ? '%' : matriz[i + 1][j + 1]);
					}

				}
			}
		}

		for (byte i = 0; i < matriz.length; i++) {
			for (byte j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j]=='%') {
					matriz[i][j]='#';
				}
			}
		}

	}

}
