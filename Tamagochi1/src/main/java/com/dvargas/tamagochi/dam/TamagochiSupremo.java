package com.dvargas.tamagochi.dam;

import java.io.InputStream;
import java.util.Scanner;
/**
 * 
 * @author 1DAM&&1DAW
 *
 */
public class TamagochiSupremo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		byte razasTamagochi = 0;
		byte tamagochiIntroducido = 0;
		String razas = "";
		byte hambre = 50;
		byte sueño = 50;
		byte higiene = 50;
		byte diversion = 50;
		byte paseo = 50;
		byte tomarMate = 50;
		boolean otroTamagochi = true;
		String nombre;

		while (razasTamagochi < 1 || razasTamagochi > 4) {

			System.out.println("Dime la raza de tu tamagochi"+"\n");
			System.out.println("Elige la raza:");
			System.out.println("\n\t1. Perro" + "\n\t2. Gato" + "\n\t3. Hipopótamo" + "\n\t4. Carpincho");
			razasTamagochi = Byte.parseByte(scan.nextLine());

			switch (razasTamagochi) {
			case 1:
				System.out.println("Tu tamagochi es un perro");
				razas = "perro";
				break;
			case 2:
				System.out.println("Tu tamagochi es un gato");
				razas = "gato";
				break;
			case 3:
				System.out.println("Tu tamagochi es un hipopotamo");
				razas = "hipopotamo";
				break;
			case 4:
				System.out.println("Tu tamagochi es un Carpincho");
				razas = "carpincho";
				break;
			default:
				System.out.println("Tenías que elegir entre 1 y 4");
				break;
			}
		}

		do {
			System.out.println("Dime el nombre de tu tamagochi");
			nombre = scan.nextLine();
		} while ((nombre.contains("1") || nombre.contains("2") || nombre.contains("3") || nombre.contains("4")
				|| nombre.contains("5") || nombre.contains("6") || nombre.contains("7") || nombre.contains("8")
				|| nombre.contains("9") || nombre.contains("0")));

		System.out.println(nombre + " " + razas + "\n"
				+ "\n\t1 - Hambre: "+hambre 
				+ "\n\t2 - Sueño: " + sueño
				+ "\n\t3 - Higiene: " + higiene 
				+ "\n\t4 - Diversion: " + diversion);

		if (razas.equalsIgnoreCase("perro")) {
			System.out.print("\t5 - paseo: " + paseo+"\n");
		}
		if (razas.equalsIgnoreCase("carpincho")) {
			System.out.print("\t5 - tomarmate: " + tomarMate+"\n");
		}
		
		System.out.println("\nElige acción:\n"+ 
				"\n\t1 - Comer" + 
				"\n\t2 - Dormir" + 
				"\n\t3 - Ducharse" + 
				"\n\t4 - Jugar");

		if (razas.equals("perro")) {
			System.out.print("\t5 - Paseo "+"\n");
		}
		if (razas.equals("carpincho")) {
			System.out.print("\t5 - Tomarmate "+"\n");
		}

		byte opcion = Byte.parseByte(scan.nextLine());
		switch (opcion) {

		case 1:
			hambre += +30;
			break;
		case 2:
			sueño += +30;
			break;
		case 3:
			higiene += +30;
			break;
		case 4:
			diversion += +30;
			break;
		case 5:
			if (razas.equals("perro")) {
				paseo += +30;
			}
			if (razas.equals("carpincho")) {
				tomarMate += +30;
			}
			break;
		}
		hambre+=(-10); sueño+=(-10); higiene+=(-10); diversion+=(-10); paseo+=(-10); tomarMate+= +30;
		
	}

}
