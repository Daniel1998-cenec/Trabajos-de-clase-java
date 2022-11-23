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

		System.out.println("Elije los ojos que quieres");
		char x = sc.nextLine().charAt(0);
		System.out.println(Funciones.pintaTrozoCara(" /'''\\ ", nCaras));
		System.out.println(Funciones.pintaTrozoCara(Funciones.PintaCara("(|o o|)", x), nCaras));
		System.out.println(Funciones.pintaTrozoCara(" \\ - / ", nCaras));
		System.out.println(Funciones.pintaTrozoCara(" /---\\ ", nCaras));
	}
}
