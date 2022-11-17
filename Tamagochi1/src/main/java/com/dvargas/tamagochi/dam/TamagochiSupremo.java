package com.dvargas.tamagochi.dam;

import java.util.Scanner;

public class TamagochiSupremo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nombre;
		char raza = '-';
		//System.out.println("¿que nombre tiene?");
		

		while (raza>1 && raza<4) {
			System.out.println("¿Qué raza tiene el tamagochi?");
			System.out.println("Elige la raza:");
			System.out.println("\n\t1. Perro" + "\n\t2. Gato" + "\n\t3. Hipopótamo"+ "\n\t4. Carpincho"); 
			raza = scan.nextLine().charAt(0);
			
		switch (raza) {
		case 1:
			System.out.println("Eres un perro");
			break;
		case 2: 
			System.out.println("Eres un gato");
			break;
		case 3:
			System.out.println("Eres un hipopotamo");
			break;
		case 4: 
			System.out.println("Eres un Carpincho");
		default:
			System.out.println("Tenías que elegir entre 1 y 4");
			break;
			
		
		}

	}
}
}