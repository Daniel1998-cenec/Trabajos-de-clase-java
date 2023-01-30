package Trabajo.extra.subir.nota.dam;

import java.util.Scanner;
import java.util.Random;

public class funciones {
	
	public static char darGenero() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Dime el género de tu jugador (m/f/n)");
		char generoJugador=sc.nextLine().charAt(0);
		if(!(generoJugador=='m'||generoJugador=='f'||generoJugador=='n')) {
			generoJugador=darGenero();
		}
		return generoJugador;
	}
	//Hacer una función llamada terminacionGenero. Recibe por argumentos un char genero,
	//que tiene que valer m,f o n. si es una m, devuelve el char 'o'. Si es una f,
	//devuelve el char 'a', y si e una n, devuelve el char'i'.
	
	public static char terminacionGenero (char genero, boolean masculinoOmitido) {
		if (genero=='m') {
			if (!masculinoOmitido) {
				return 'o';
			}
			return 0;
		}
		if (genero=='f') {
			return'a';
		}
		return 'i';
	}		
}
