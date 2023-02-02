package Trabajo.extra.subir.nota.dam;

import java.util.Scanner;

public class FuncionesMatrices3D {
	
	public static String[][][] generaTablero(byte size) {
		String[][][] tablero = new String[size][size][size];
		for (byte x = 0; x < size; x++) {
			for (byte  y= 0 ; y < size ; y++) {
				for(byte z = 0 ; z < size ; z++) {
					tablero[x][y][z] = "♒";
				} // for
			} // for
		} // for
		return tablero;
	} // funcion
	
	public static void jugar (String nombreJugador, char generoJugador) {
		byte tamaño;
		Scanner sc=new Scanner (System.in);
		System.out.println("Bienvenid"+funciones.terminacionGenero(generoJugador, false)+
				" al Ataque de los Goblin en 3D");
		do {
			System.out.println("Dime el tamaño del tablero (1-127)");
			tamaño=Byte.parseByte(sc.nextLine());
			}while(!(tamaño <= 127 || tamaño > 0));
	}
}
