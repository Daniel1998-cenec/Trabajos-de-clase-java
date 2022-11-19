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
		/*Uso razaTamagochi y lo declaro para el bucle while ya que siempre hay que declararlo,
		 * lo uso en byte porque quiero elegir las opciones de switch mediante numeros (1-4)
		 */
		byte razasTamagochi = 0;
		//uso la variable raza para declarar cada razasTamagochi 
		String razas = "";
		/*
		 * Declaro hambre, sueño, higiene, diversion, paseo y tomar mate
		 * para establecer por defecto tomas las características a 50 
		 */
		byte hambre = 50;
		byte sueño = 50;
		byte higiene = 50;
		byte diversion = 50;
		byte paseo = 50;
		byte tomarMate = 50;
		//declaro turnos para guardar cada ronda que sobrevive el tamagochi
		byte turnos = 0;
		/*Uso esta variable para poder usar el bucle while, la declaro, y ahi meto 
		 *las estadisticas por defecto del tamagochi, y luego, meto las acciones 
		 *que va a realizar
		 */
		boolean vivo = true;
		//Para dar el nombre a mi tamagochi
		String nombre;
		/*Uso while
		 * 
		 */
		while (razasTamagochi < 1 || razasTamagochi > 4) {

			System.out.println("Dime la raza de tu tamagochi" + "\n");
			System.out.println("Elige la raza:"+" (Mediante un número)");
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

		while (vivo) {
			turnos++;

			System.out.println(nombre + " " + razas + "\n" + "\n - Hambre: " + hambre + "\n - Sueño: " + sueño
					+ "\n - Higiene: " + higiene + "\n - Diversion: " + diversion);

			if (razas.equalsIgnoreCase("perro")) {
				System.out.print(" - paseo: " + paseo + "\n");
			}
			if (razas.equalsIgnoreCase("carpincho")) {
				System.out.print(" - tomarmate: " + tomarMate + "\n");
			}
			System.out.println(
					"\nElige acción:\n" + "\n\t1 - Comer" + "\n\t2 - Dormir" + "\n\t3 - Ducharse" + "\n\t4 - Jugar");

			if (razas.equals("perro")) {
				System.out.print("\t5 - Paseo " + "\n");
			}
			if (razas.equals("carpincho")) {
				System.out.print("\t5 - Tomarmate " + "\n");
			}

			byte opcion = Byte.parseByte(scan.nextLine());
			switch (opcion) {

			case 1:
				hambre += +20;
				if (hambre>=100) {
					hambre=100;
				}
				sueño += -10;
				higiene += -10;
				diversion += -10;
				break;
			case 2:
				sueño += +20;
				if (sueño>=100) {
					sueño=100;
				}
				hambre += -10;
				higiene += -10;
				diversion += -10;
				break;
			case 3:
				higiene += +20;
				if (higiene>=100) {
					higiene=100;
				}
				hambre += -10;
				sueño += -10;
				diversion += -10;
				break;
			case 4:
				diversion += +20;
				if(diversion>=100) {
					diversion=100;
				}
				hambre += -10;
				sueño += -10;
				higiene += -10;
				break;
			case 5:
				if (razas.equals("perro")) {
					paseo += +20;
					if (paseo>=100) {
						paseo=100;
					}
					hambre += -10;
					sueño += -10;
					higiene += -10;
					diversion += -10;
				}
				if (razas.equals("carpincho")) {
					tomarMate += +20;
					if (tomarMate>=100) {
						tomarMate=100;
					}
					hambre += -10;
					sueño += -10;
					higiene += -10;
					diversion += -10;
				}
				break;
			}
			if (hambre <= 0 || sueño <= 0 || higiene <= 0 || diversion <= 0 || paseo <= 0 || tomarMate <= 0
					|| turnos >= 30) {
				vivo = false;
				System.out.println("Mi tamagochi "+nombre+" ha muerto, en el turno "+turnos);	
			}
		}
	/*
	 * Este trabajo no lo hubiera hecho sin ayuda de Max, javi vela y un alumno de un año diferente "alex Gordo"
	 */
	}

}