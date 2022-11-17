package com.dvargas.tamagochi.dam;

import java.io.InputStream;
import java.util.Scanner;

public class TamagochiSupremo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		byte razasTamagochi=0;
		String razas;
		while (razasTamagochi<1||razasTamagochi>4) {
			      
			System.out.println("Dime la raza de tu tamagochi");
			System.out.println("Elige la raza:");
			System.out.println("\n\t1. Perro" + "\n\t2. Gato" + "\n\t3. Hipopótamo" + "\n\t4. Carpincho");
			razasTamagochi=Byte.parseByte(scan.nextLine());

			switch (razasTamagochi) {
			case 1:
				System.out.println("Tu tamagochi es un perro");
				break;
			case 2:
				System.out.println("Tu tamagochi es un gato");
				break;
			case 3:
				System.out.println("Tu tamagochi es un hipopotamo");
				break;
			case 4:
				System.out.println("Tu tamagochi es un Carpincho");
			default:
				System.out.println("Tenías que elegir entre 1 y 4");
				break;
			}
		}
		
		System.out.println("Dime el nombre de tu tamagochi");
		String nombre=scan.nextLine();
		System.out.println("Tu tamagotchi tendrá las siguientes propiedades. Todas empiezan por defecto en 50:");
		System.out.println("\n\ta - Hambre: entre 0 y 100. Con 0 se muere de hambre, con 100, está lleno."
				+ "\n\tb - Sueño: entre 0 y 100. Con 0 se muere de insomnio, con 100, está descansado."
				+ "\n\tc - Higiene: entre 0 y 100. Con 0, se muere bajo el peso de su propia mugre. Con 100 está limpio."
				+ "\n\td - Diversión:entre 0 y 100. Con 0, se muere deprimido. Con 100 está pletórico."
				+ "\n\te - (SOLO EL PERRO) Paseo: entre 0 y 100. Con 0 se muere por no salir a la calle. Con 100 está satisfecho."
				+ "\n\tf - (SOLO EL CARPINCHO) Tomar mate : Entre 0 y 100. Con 0 se muere de sindrome de abstinencia. Con  100, está satisfecho.");
		
		
	}

}
