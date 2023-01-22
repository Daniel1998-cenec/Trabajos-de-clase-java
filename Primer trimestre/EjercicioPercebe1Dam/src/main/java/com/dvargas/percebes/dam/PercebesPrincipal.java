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
 * @param args. El primer argumento indicará el número de plantas. Si está puesto 
 * debe ser un número positivo mayor a cero. Si no está presente, se pedirá por teclado.
 * El segundo argumento indicará el número de pisos por planta
 */
	public static void main(String[] args) {
		//paso 2: Traerse la declaración de todas las variables que puedan coger su valor de argumentos al principio del programa,
		//e inicializarlas a valores absurdos/imposibles.
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
