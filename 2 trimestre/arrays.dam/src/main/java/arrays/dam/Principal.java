package arrays.dam;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		String[] nombres = new String[7];
		String[] apellidos = { "Gutierrez", "Gómez", "Peña", "Centollo", "Buendía", "Furgo" };

		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una posición para ponerle un nombre (0-" + (nombres.length - 1) + "):");
		byte posicion = Byte.parseByte(sc.nextLine());
		System.out.println("Dime un nombre para la posicion " + posicion + ": ");
		if (Funciones.valorPosicion(nombres, posicion, sc.nextLine())) {
			System.out.println("Cambiado correctamente");
		} else {
			System.out.println("no se pudo cambiar el valor");
		}

		for (byte i = 0; i < nombres.length; i++) {
			System.out.println(i + ": " + (nombres[i] != null ? nombres[i].toUpperCase() : "-"));
		}

		// Ejercicio diario 12/01/23
		// Crea una función llamada intercambio que devuelva un boolean,
		// y reciba tres argumentos-. un array de char, y dos byte llamados
		// p1 y p2.
		// En su interior, los primero que hace es ver si tanto p1 como p2 son
		// posiciones válidas del array.
		// Si alguna no lo es, la funcion devuelve false y no hace nada más
		// Si las dos posiciones válidas, intercambiaría los valores de las posiciones
		// p1 y p2 dentro del array.
		// Te propongo que lo intentes con el siguiente array declarando en el main:
		// char[] letras={'p','e','l','o','t','a'}

		char[] letras = { 'p', 'e', 'l', 'o', 't', 'a' };
		if (Funciones.intercambio(letras, posicion, posicion)) {

		}
	}
}
