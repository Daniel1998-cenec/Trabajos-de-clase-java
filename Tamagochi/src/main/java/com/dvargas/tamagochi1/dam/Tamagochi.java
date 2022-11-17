package com.dvargas.tamagochi1.dam;

import java.util.Scanner;

public class Tamagochi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("¿Qué raza tiene el tamagochi?");
		char raza = '-';
		System.out.println("¿que nombre tiene?");
		String nombre;

		while (raza != 'm') {
			System.out.println("Elige la raza:" + "\n\t1. Perro" + "\n\t2. Gato" + "\n\t3. Hipopótamo"
					+ "\n\t4. Carpincho" + "\n\t5. Salir");
			raza = sc.nextLine().charAt(0);
		switch (raza) {
		
		}

	}
}
}