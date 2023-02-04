package prueba.matrices.dam;

import java.util.Random;

public class Funcion {
	/**
	 * Esta función crea una matriz de caracteres de tamaño especificado por los
	 * argumentos fil y col.
	 * 
	 * @param fil se utilizan para especificar el número de filas para crear la
	 *            matriz
	 * @param col se utilizan para especificar el número de columnas para crear la
	 *            matriz
	 * @return La función creaSopa devuelve una matriz de caracteres aleatorios.
	 */
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

	/**
	 * La función recorre la matriz fila por fila y columna por columna,
	 * concatenando cada carácter en una cadena ret. Después de agregar cada
	 * carácter, se agrega una tabulación (\t) para separar los caracteres en
	 * columnas. Después de recorrer todas las columnas en una fila, se agrega un
	 * salto de línea (\n) para separar las filas.
	 * 
	 * @param matriz El argumento char[][] matriz se pone con el objetivo de
	 *               especificar la matriz que se desea imprimir.
	 * @return la función devuelve la cadena ret que contiene la representación de
	 *         la matriz en forma de cadena.
	 */
	public static String imprimeMatriz(char[][] matriz) {
		String ret = "";
		for (byte i = 0; i < matriz.length; i++) {
			for (byte j = 0; j < matriz[i].length; j++) {
				ret += matriz[i][j] + " ";
			}
			ret += "\n";
		}
		return ret;
	}

	/**
	 * Esta función intenta insertar una palabra en una matriz de caracteres en una
	 * determinada fila y columna. La función verifica primero si la palabra cabe en
	 * la matriz, comparando la longitud de la palabra con el número de columnas
	 * disponibles en la fila especificada.
	 * 
	 * @param matriz  La matriz de caracteres en la que se desea insertar la
	 *                palabra.
	 * @param palabra La palabra que se desea insertar en la matriz.
	 * @param fil     La fila en la que se desea insertar la palabra.
	 * @param col     La columna en la que se desea comenzar a insertar la palabra.
	 * @param direccion El usuario elije la direccion que quiere que vaya la palabra
	 * @param comprobacion Es una matriz booleana que guarda la posicion de las palabras.
	 * @return Se devuelve "true". Si la palabra no cabe, la función devuelve
	 *         "false".        
	 */
	public static boolean insertarPalabra(char[][] matriz, String palabra, byte fil, byte col, byte direccion,boolean[][]comprobacion) {
		
		// Si vale cero, la palabra se insertará en horizontal hacia adelante
		if (direccion == 0) {
			if (col + palabra.length() - 1 <= matriz[fil].length-1) {
				// palabra.length() - 1 se utiliza para asegurarse de que la última letra de la
				// palabra cabrá en la matriz.
				for(byte k = 0; k< palabra.length(); k++) {
					//comprobando cada letra de la sopa de letra si t o f
					if(comprobacion[fil][col+k]==true) {
						//Aqui estoy aprovechando la letra de la palabra
						if(palabra.charAt(k)!=matriz[fil][col+k]) {
							return false;
						}
					}
				} 
				for (byte i = 0; i < palabra.length(); i++) {
					//Aqui estoy modificando metiendo la palabra
					matriz[fil][col + i] = palabra.charAt(i);
					//si coincide la palabra pones true en la sopa de letra.
					comprobacion[fil][col+i]=true;
				}
				return true;
			}
			
			
			// Si vale uno, la palabra se insertará en horizontal hacia la izquierda	
		} else if (direccion == 1) {
			if (col - palabra.length()+1 >= 0) {
				for(byte k = 0; k< palabra.length(); k++) {
					if(comprobacion[fil][col-k]==true) {
						if(palabra.charAt(k)!=matriz[fil][col-k]) {
							return false;
						}
					}
				}
				// 0 es lo el inicio de la matriz o sea, la barrera del inicio
				for (byte i = 0; i < palabra.length(); i++) {
					matriz[fil][col - i] = palabra.charAt(i);
					comprobacion[fil][col-i]=true;
				}
				return true;
			}
			
			
			// Si vale dos, la palabra se insertará en vertical hacia arriba
		} else if (direccion == 2) {
			if (fil - palabra.length()+ 1 >= 0) {
				for(byte k = 0; k< palabra.length(); k++) {
					if(comprobacion[fil-k][col]==true) {
						if(palabra.charAt(k)!=matriz[fil-k][col]) {
							return false;
						}
					}
				}
				for (byte i = 0; i < palabra.length(); i++) {
					matriz[fil - i][col] = palabra.charAt(i);
					comprobacion[fil-i][col]=true;
				}
				return true;
			}
			
			
			// Si vale tres, la palabra se insertará en vertical hacia abajo
		} else if (direccion == 3) {
			if (fil + palabra.length() - 1 <= matriz.length-1) {
				for(byte k = 0; k< palabra.length(); k++) {
					if(comprobacion[fil+k][col]==true) {
						if(palabra.charAt(k)!=matriz[fil+k][col]) {
							return false;
						}
					}
				}
				//matriz.length-1 seria la barrera final de la fila, o sea la ultima letra de la palabra
				for (byte i = 0; i < palabra.length(); i++) {
					matriz[fil + i][col] = palabra.charAt(i);
					comprobacion[fil+i][col]=true;
				}
				return true;
			}
			
			
			// Si vale cuatro, la palabra se insertará en diagonal hacia arriba a la derecha
		} else if (direccion == 4) {
			if (fil - palabra.length()+ 1 >=0 && col + palabra.length() - 1 <= matriz[fil].length-1) {
				for(byte k = 0; k< palabra.length(); k++) {
					if(comprobacion[fil-k][col+k]==true) {
						if(palabra.charAt(k)!=matriz[fil-k][col+k]) {
							return false;
						}
					}
				}
				for (byte i = 0; i < palabra.length(); i++) {
					matriz[fil - i][col + i] = palabra.charAt(i);
					comprobacion[fil-i][col+i]=true;
				}
				return true;
			}
			
			
			// Si vale cinco, la palabra se insertará en diagonal hacia arriba a la
			// izquierda
		} else if (direccion == 5) {
			if (fil - palabra.length()+ 1 >=0 && col - palabra.length()+1 >= 0) {
				for(byte k = 0; k< palabra.length(); k++) {
					if(comprobacion[fil-k][col-k]==true) {
						if(palabra.charAt(k)!=matriz[fil-k][col-k]) {
							return false;
						}
					}
				}
				for (byte i = 0; i < palabra.length(); i++) {
					matriz[fil - i][col - i] = palabra.charAt(i);
					comprobacion[fil-i][col-i]=true;
				}
				return true;
			}
			
		
			// Si vale seis, la palabra se insertará en diagonal hacia abajo a la derecha
		} else if (direccion == 6) {
			if (fil + palabra.length() - 1 <= matriz.length-1 && col + palabra.length() - 1 <= matriz[fil].length-1) {
				for(byte k = 0; k< palabra.length(); k++) {
					if(comprobacion[fil+k][col+k]==true) {
						if(palabra.charAt(k)!=matriz[fil+k][col+k]) {
							return false;
						}
					}
				}
				for (byte i = 0; i < palabra.length(); i++) {
					matriz[fil + i][col + i] = palabra.charAt(i);
					comprobacion[fil+i][col+i]=true;
				}
				return true;
			}
			
			
			// Si vale siete, la palabra se insertará en diagonal hacia abajo a la izda
		} else if (direccion == 7) {
			if (fil + palabra.length() - 1 <= matriz.length-1 && col - palabra.length()+1 >= 0) {
				for(byte k = 0; k< palabra.length(); k++) {
					if(comprobacion[fil+k][col-k]==true) {
						if(palabra.charAt(k)!=matriz[fil+k][col-k]) {
							return false;
						}
					}
				}
				for (byte i = 0; i < palabra.length(); i++) {
					matriz[fil + i][col - i] = palabra.charAt(i);
					comprobacion[fil+i][col-i]=true;
				}
				return true;
			}
		}
		return false;
	}
}
