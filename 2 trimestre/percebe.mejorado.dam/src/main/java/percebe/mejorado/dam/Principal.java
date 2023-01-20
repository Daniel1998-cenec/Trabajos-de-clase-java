package percebe.mejorado.dam;

import java.util.Scanner;

import percebe.mejorado.dam.*;

/**
 * En esta clase es donde realizo el percebe
 * 
 * @author Daniel Cesar Vargas Holguin
 * @version 1
 */
public class Principal {
	/**
	 * Progrmama Principal que dibuja un 13 rue del percebe en ascii con el número
	 * de plantas y pisos que le digamos.
	 * 
	 * @param args El primer argumento indicará el número de plantas. Si está
	 *             presente, se pedirá por teclado.
	 *             El segundo argumento indicará el número de pisos. 
	 *             Si está presente, se pedirá por teclado.
	 *             El Tercer argumento puede ser una v o una f. Si el argumento no está
	 *             o vale v, el cartel de "13 Rue del percebe" se dibuja. Solo en
	 *             caso de valer f, el cartel no se dibujará
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte nb;
		byte np;
		if (args.length < 1) {
			// No viene por argumentos, lo tengo que pedir por teclado.
			System.out.println("Cuántas plantas tiene tu edificio?");
			np = sc.nextByte();
		} else {
			// Viene por argumentos, lo cojo de ahi.
			np = Byte.parseByte(args[0]);
		} // if / else

		if (args.length < 2) {
			// Si no tiene segundo argumento, lo tengo que pedir por teclado.
			System.out.println("Cuántos casas por pisos tiene tu edificio?");
			nb = sc.nextByte();
		} else {
			// Viene por argumentos, lo cojo de ahi.
			nb = Byte.parseByte(args[1]);
		} // if / else

		/*
		 * System.out.println("Dime cuantos bloques quieres"); byte nb =
		 * Byte.parseByte(sc.nextLine());
		 * System.out.println("Dime cuantos pisos quieres"); byte np =
		 * Byte.parseByte(sc.nextLine());
		 */

		String titulo = "";
		if ((args.length >= 4)) {

			titulo = args[3];
		} else {
			titulo = "13 Rue del Percebe";
		}

		if (!(args.length >= 3 && args[2].charAt(0) == 'f')) {
			System.out.println(
					"|-----------------------------|\n" + "|" + titulo + "|\n" + "|-----------------------------|");
		}

		/*
		 * Objetivo: Que si hay 4 argumento, en el cartel, en lugar de poner 13 rue del
		 * percebe, ponga lo que yo escriba de argumento. EJ: Casa Cenec
		 */

		for (byte c = 0; c < np; c++) {
			System.out.println(Funcion.pintarAltura("|-----|", nb));
			System.out.println(Funcion.pintarAltura("|     |", nb));
			System.out.println(Funcion.pintarAltura("|     |", nb));
		}

	}

}
