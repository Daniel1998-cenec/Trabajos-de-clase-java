package practicasTemaCuatro;

import java.util.Random;

public class Funciones {

	public static String imprimeAula(String[][] iconos, String[][] nombres) {
		String ret = "";
		for (byte i = 0; i < iconos.length; i++) {
			for (byte j = 0; j < iconos[i].length; j++) {
				ret += iconos[i][j];
			}
			ret += "\t---->\t";
			for (byte j = 0; j < nombres[i].length; j++) {
				ret += nombres[i][j] + (nombres[i][j].equals("|  ") || nombres[i][j].equals("|🐴") ? "" : "\t");
			}
			ret += "\n";
		}
		return ret;
	}

	public static void intercambiarPosiciones(String[][] matriz, byte fila1, byte columna1, byte fila2, byte columna2) {

		String aux = matriz[fila1][columna1];
		matriz[fila1][columna1] = matriz[fila2][columna2];
		matriz[fila2][columna2] = aux;

	}

	public static String posicionAleatoriaMatriz(byte tamañoFilas, byte tamañoColumnas) {

		Random r = new Random();
		byte f = (byte) r.nextInt(0, tamañoFilas);
		byte c = (byte) r.nextInt(0, tamañoColumnas);

		return f + "," + c;

	}

	public static void intercambiarAlumnos(String[][] iconos, String[][] nombres, byte veces) {

		byte f1 = 0;
		byte c1 = 0;

		for (byte i = 0; i < veces; i++) {
			do {
				// ~ ~ este string es igual a una nueva conversión que he hecho del array ~ ~
				String[] filCol = posicionAleatoriaMatriz((byte) iconos.length, (byte) iconos[0].length).split(",");
				f1 = Byte.parseByte(filCol[0]);
				c1 = Byte.parseByte(filCol[1]);
			} while (!(iconos[f1][c1].contains("👨") || iconos[f1][c1].contains("👩") || iconos[f1][c1].contains("◓")));

			byte f2 = 0;
			byte c2 = 0;

			do {
				// ~ ~ este string es igual a una nueva conversión que he hecho del array ~ ~
				String[] filCol = posicionAleatoriaMatriz((byte) iconos.length, (byte) iconos[0].length).split(",");
				f2 = Byte.parseByte(filCol[0]);
				c2 = Byte.parseByte(filCol[1]);
			} while (!(iconos[f2][c2].contains("👨") || iconos[f2][c2].contains("👩") || iconos[f2][c2].contains("◓")));

			intercambiarPosiciones(nombres, f1, c1, f2, c2);
			intercambiarPosiciones(iconos, f1, c1, f2, c2);
		}
	}

	/**
	 * Esta wea tiene que estar en la columna 2, el caballito.
	 * 
	 * @param matriz
	 * @return
	 */
	public static byte buscarCaballo(String[][] matriz) {

		for (byte i = 0; i < matriz.length; i++) {
			if (matriz[i][2].contains("🐴")) {

				return i;
			}

		}
		return -1;
	}

	public static boolean moverCaballo(String[][] iconos, String[][] nombres, byte direccion) {

		byte posCaballo = buscarCaballo(nombres);

		if (direccion == 1) {

			Funciones.intercambiarPosiciones(nombres, (byte) posCaballo, (byte) 2, (byte) (posCaballo + 1), (byte) 2);
			Funciones.intercambiarPosiciones(iconos, (byte) posCaballo, (byte) 2, (byte) (posCaballo + 1), (byte) 2);
			if (posCaballo+1 == 0 || posCaballo+1 == iconos.length - 1) {
				return true;
			} else {
				return false;
			}
		}

		if (direccion == -1) {
			Funciones.intercambiarPosiciones(nombres, (byte) posCaballo, (byte) 2, (byte) (posCaballo - 1), (byte) 2);
			Funciones.intercambiarPosiciones(iconos, (byte) posCaballo, (byte) 2, (byte) (posCaballo - 1), (byte) 2);
			if (posCaballo-1== 0 || posCaballo-1 == iconos.length - 1) {
				return true;
			} else {
				return false;
			}
		}

		return false;

	}
}
