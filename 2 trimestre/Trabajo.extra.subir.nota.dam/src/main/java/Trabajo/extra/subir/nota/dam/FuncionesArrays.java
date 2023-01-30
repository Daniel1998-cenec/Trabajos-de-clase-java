package Trabajo.extra.subir.nota.dam;

import java.util.Random;
import java.util.Scanner;

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
		Random r=new Random();
		String ret="";
		String[] simbolos = {"🌀", "🍙", "♨", "🏕"};
		for (byte i=0; i<array.length+2;i++) {
			ret+=simbolos[r.nextInt(simbolos.length)];
		}
		ret+="\n";
		ret+=simbolos[r.nextInt(simbolos.length)];
		for (byte i=0; i<array.length;i++) {
			ret+=array[i];
		}
		ret+=simbolos[r.nextInt(simbolos.length)];
		ret+="\n";
		for (byte i=0; i<array.length+2;i++) {
			ret+=simbolos[r.nextInt(simbolos.length)];
		}
		return ret;
	}
	
	public static void jugar (String nombreJugador, char generoJugador) {
		
		System.out.println("Bienvenid"+funciones.terminacionGenero(generoJugador, false)+
				" al Ataque de los Goblin en 1D");
		Scanner sc=new Scanner(System.in);
		byte tamaño;
		do {
		System.out.println("Dime el tamaño del tablero (1-127)");
		 tamaño=Byte.parseByte(sc.nextLine());
		}while(!(tamaño <= 127 || tamaño > 0));

		String[] tablero=FuncionesArrays.generaTablero(tamaño);
			
		// 👩 👨 웃 
		String iconoJugador=(generoJugador=='m'?"👨":generoJugador=='f'?"👩":"웃");
		//En la primera posicion coloco el jugador
		byte posicionJugador=0;
		tablero[0]=iconoJugador=iconoJugador;
		//El ultimo tercio del tablero, lo relleno de goblins
		for(byte i=(byte)(tablero.length-1);i>(tablero.length-1)*2/3;i--) {
			tablero[i]="👺";// 👺
		}
		System.out.println(FuncionesArrays.imprime(tablero));
	}
	
}
