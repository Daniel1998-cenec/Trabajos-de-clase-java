package por.la.cara;

import java.util.Scanner;

import por.la.cara.dam.Funciones;

public class PorLaCara {

	public static void main(String[] args) {
		/*
		 * /"""\ (|o o|) \ - / /-----\
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantas caras quieres?");
		byte nCaras = Byte.parseByte(sc.nextLine());

	System.out.println(Funciones.pintaTrozoCara(" /'''\\ ", nCaras));	
	System.out.println(Funciones.pintaTrozoCara("(|o o|)", nCaras));
	System.out.println(Funciones.pintaTrozoCara(" \\ - / ", nCaras));	
	System.out.println(Funciones.pintaTrozoCara(" /---\\ ", nCaras));	
	}
}
