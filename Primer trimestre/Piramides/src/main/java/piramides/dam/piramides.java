package piramides.dam;

import java.util.Scanner;

public class piramides {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime cuantos pisos quieres que tenga las piramides");
		byte pisos = Byte.parseByte(sc.nextLine());
		byte i;
		for (i = 0; i < pisos; i++) {
			for (byte j = 0; j < i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}

		for (byte p = (byte) (pisos); p > 0; p--) {
			for (byte j = 0; j < (p); j++) {
				System.out.print("@");
			}
			
			System.out.println();
		}
	}
}

/*
 * System.out.println("Dime un número. y te digo si es primo"); long numero =
 * Long.parseLong(sc.nextLine()); boolean esPrimo = true; long i; for (i=2; i <
 * numero; i++) { if (numero % i == 0) { System.out.println("Lo divide "+i);
 * esPrimo = false; break; //Se usa break cuando para ahorrate tiempo } for(int
 * j=0;j<10;j++) {
 * 
 * } }
 * 
 * if (esPrimo) { System.out.println("Es primo"); } else {
 * //System.out.println("No es primo, lo divide "+i); }
 */

