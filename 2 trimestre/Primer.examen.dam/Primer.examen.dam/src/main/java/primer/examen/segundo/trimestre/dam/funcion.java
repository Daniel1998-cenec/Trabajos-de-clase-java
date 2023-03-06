package primer.examen.segundo.trimestre.dam;

import java.util.Random;

public class funcion {
	/**
	 * En esta función se limita solo crear la matriz
	 * 
	 * @param matriz se encarga de crear la matriz
	 * @return un String sin espacios concatenando un \n
	 */
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

	/**
	 * En esta función crea en cada posicion de la matriz un espacio
	 * 
	 * @param tamaño seria el numero que iria tanto en fila como columna pero en
	 *               fila tendria una variacion que sería está "nFilas / tamaño" y
	 *               en columna "tamaño".
	 * @return un null.
	 */
	public static char[][] creaMatrizEspacios(byte tamaño) {

		if (tamaño < 12 || tamaño > 16) {
			return null;
		}
		char[][] matriz = new char[tamaño / 2][tamaño];
		for (byte i = 0; i < matriz.length; i++) {
			for (byte j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = ' ';
			}
		}
		return matriz;
	}

	/**
	 * En esta función crea en cada posicion de la matriz una ☁
	 * 
	 * @param matriz en la matriz iria una ☁ solo ena fila 0 - columna j
	 * 
	 */
	public static void ponerNubes(char[][] matriz) {
		for (byte i = 0; i < matriz.length; i++) {
			matriz[0][i] = '☁';
		}
	}

	/**
	 * En esta función se pasara la frase (string) a char en la posicion de la
	 * matriz [1][j]. No hay que tener en cuenta si la columna tiene mas de 16
	 * columnas porque es un requisito para usar la función que la matriz tiene que
	 * tener 16 columnas maximo.
	 * 
	 * @param matriz que da coloca en cada posición un char del string frase.
	 */
	public static void insertarFraseEufrasio(char[][] matriz) {
		String frase = "Eufrasio se cayó";
		for (byte i = 0; i < matriz[0].length; i++) {
			matriz[1][i] = frase.charAt(i);
		}
	}

	/**
	 * Antes de nada, antes de usar esta funcion, tiene que tener como mínimo 3
	 * filas. Basicamente en esta funcion genereamos un random para la posicion
	 * inicioBalate y alturaBalate que dara en ambos casos una posición. Luego
	 * crearemos '|' debajo de atriz[alturaBalate][0].
	 * 
	 * @param matriz se generará la posicion de esto 'ꆜ', '_' y '|'
	 */
	public static void generarEscena(char[][] matriz) {
		Random r = new Random();

		byte inicioBalate = (byte) r.nextInt(1, matriz[0].length - 2);
		byte alturaBalate = (byte) r.nextInt(2, matriz.length - 1);
		matriz[alturaBalate][0] = 'ꆜ';
		for (byte i = 1; i < inicioBalate; i++) {
			matriz[alturaBalate][i] = '_';
		}
		for (byte i = (byte) (matriz.length - 1); i > alturaBalate; i--) {
			matriz[i][0] = '|';
		}
		for (byte i = 0; i < matriz.length; i++) {
			for (byte j = 0; j < matriz[i].length; j++) {
				//if (i < matriz.length - 1 && j < matriz[i].length - 1 && matriz[i + 1][j + 1] != '#') {
					//matriz[i][j]='\\';
				}
			}
		}
	}
}
