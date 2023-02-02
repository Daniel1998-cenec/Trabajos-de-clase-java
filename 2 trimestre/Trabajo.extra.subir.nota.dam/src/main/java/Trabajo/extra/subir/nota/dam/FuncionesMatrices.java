package Trabajo.extra.subir.nota.dam;

import java.util.Random;
import java.util.Scanner;

public class FuncionesMatrices {

	public static String[][] generaTablero(byte size) {
		String[][] tablero = new String[size][size];
		for (byte x = 0; x < size; x++) {
			for (byte y = 0; y < size; y++) {
				tablero[x][y] = "♒";
			} // for
		} // for
		return tablero;
	} // funcion

	public static void jugar(String nombreJugador, char generoJugador) {
		Scanner sc = new Scanner(System.in);
		byte tamaño;
		System.out.println(
				"Bienvenid" + funciones.terminacionGenero(generoJugador, false) + " al Ataque de los Goblin en 2D");
		do {
			System.out.println("Dime el tamaño del tablero (4-127)");
			tamaño = Byte.parseByte(sc.nextLine());
		} while (!(tamaño <= 127 || tamaño > 4));

		String[][] tablero = FuncionesMatrices.generaTablero(tamaño);
		String iconoJugador = (generoJugador == 'm' ? "👨" : generoJugador == 'f' ? "👩" : "웃");
		String posString=FuncionesMatrices.colocaElemento(tablero, iconoJugador);//12,5
		byte filaJugador=Byte.parseByte(posString.split(",")[0]);
		byte columnaJugador=Byte.parseByte(posString.split(",")[1]);	
		
		for(short i=0;i<tablero.length*tablero[0].length/3;i++) {
			FuncionesMatrices.colocaElemento(tablero, "👺");
		}
		System.out.println(FuncionesMatrices.imprime(tablero));
	}

	// Lo mismo que el array, pero con matrices, se imprime rodeada de un marco
	// de símbolos aleatorios
	
	public static String imprime(String[][] matriz) {
		Random r = new Random();
		String ret = "";
		String[] simbolos = { "🌀", "🍙", "♨", "🏕" };
		for (byte i = 0; i < matriz.length + 2; i++) {
			ret += simbolos[r.nextInt(simbolos.length)];
		}
		ret += "\n";
		for (byte i = 0; i < matriz.length; i++) {
			ret += simbolos[r.nextInt(simbolos.length)];
			for(byte j=0;j<matriz[i].length;j++) {
				ret += matriz[i][j];
			}
			ret += simbolos[r.nextInt(simbolos.length)];
			ret += "\n";
		}
		for (byte i = 0; i < matriz.length + 2; i++) {
			ret += simbolos[r.nextInt(simbolos.length)];
		}
		return ret;
	}

	/**
	 * coloca el elemento en una posicion aleatoria de la matriz, y devuelve 
	 * concatenado en un string la fila y la columna en que se ha colocado el elemento
	 * separados por una coma. Por ejemplo, si se elige aleatoriamente la fila 4
	 * y la columna o, se devuelve "4,9"
	 * @param matriz la matriz donde se insertará el elemento
	 * @param elemento elemento a insertar
	 * @return Devuelve concatenadas y separadas por coma, la fila 
	 * y la columna donde se insertó el elemento
	 */
	
	public static String colocaElemento (String [] [] matriz, String elemento) {
		//Haz que esta fila y columna escogida aleatoriamente tenga que contener por fuerza
		//🏻. Si contiene otra cosa, volver a sortear tanto fila como columna.
		Random r=new Random();
		byte fila;
		byte columna;
		do {
			fila=(byte)(r.nextInt(matriz.length));
			columna=(byte)(r.nextInt(matriz[fila].length));
		}while(!matriz[fila][columna].equals("♒"));
		matriz[fila][columna]=elemento;
		return fila+","+columna;
	}
}
