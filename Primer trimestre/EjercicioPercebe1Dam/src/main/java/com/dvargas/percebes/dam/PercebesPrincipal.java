package com.dvargas.percebes.dam;

import java.util.Scanner;
/**
 * En esta clase es donde realizo el percebe
 * @author Daniel Cesar Vargas Holguin
 * @version 1
 */
public class PercebesPrincipal {
/**
 * En esta funcion es donde realizo el percebe
 * @param args no se usa
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime cuantos bloques quieres");
		byte nb = Byte.parseByte(sc.nextLine());
		System.out.println("Dime cuantos pisos quieres");
		byte np = Byte.parseByte(sc.nextLine());

		System.out.println("|-----------------------------|\n" + "| 13 Rue del Percebe          |\n"
				+ "|-----------------------------|");
		for (byte c = 0; c < np; c++) {
			System.out.println(Funcion.pintarAltura("|-----|", nb));
			System.out.println(Funcion.pintarAltura("|     |", nb));
			System.out.println(Funcion.pintarAltura("|     |", nb));
		}
		
	}

}
