package practicasTemaCuatro;

import java.util.Random;
import java.util.Scanner;

public class PracticasTemaCuatro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Examen daw
		byte direccion = 1;
		byte numeroIntercambios = 0;
		byte movimiento = 0;
		for (byte i = 0; i < args.length; i++) {
			if (args[i].equals("-i")) {
				numeroIntercambios = (byte) args[i + 1].charAt(0);
			} // if
			if (args[i].equals("-m")) {
				movimiento = Byte.parseByte(args[i + 1]);
			} // if
		} // for

		System.out.println("Situación inicial: ");
		String[][] iconosAula = { { "--", "--", "|  ", " |", "--", "--" }, { "--", "👨", "|  ", " |", "--", "👨" },
				{ "👨", "👨", "|  ", " |", "◓ ", "◓ " }, { "👨", "👨", "|  ", " |", "👨", "👨" },
				{ "👨", "👨", "|  ", " |", "👨", "👨" }, { "👨", "--", "|  ", " |", "👩", "👩" },
				{ "--", "--", "|🐴", " |", "--", "👨" }, { "🖥", "🗔", "|  ", " |", " ", " " },
				{ "🪑", "⊡ ", "|  ", " |", " ", " " } };
		String[][] nombresAula = { { "-", "-", "|  ", " |", "-", "-" }, { "-", "Cosmin", "|  ", " |", "-", "Alberto" },
				{ "Darío", "José H", "|  ", " |", "Irene", "Naomi" },
				{ "Borja", "Javi", "|  ", " |", "José G", "Nico" },
				{ "Sergio", "CarlosC", "|  ", " |", "Mario", "Ricardo" },
				{ "CarlosR", "-", "|  ", " |", "Mónica", "Mar" }, { "-", "-", "|🐴", " |", "-", "Alex. T" },
				{ "🖥", "🗔", "|  ", " |", " ", " " }, { "🪑", "⊡ ", "|  ", " |", " ", " " } };
		
		System.out.println(Funciones.imprimeAula(iconosAula, nombresAula));

		if (numeroIntercambios == 0) {
			System.out.println("Dime el numero de intercambios que quieres que el Sñor Caballo haga ");
			numeroIntercambios = Byte.parseByte(sc.nextLine());

		}
		

		Funciones.intercambiarAlumnos(iconosAula, nombresAula, numeroIntercambios);
	

		// Arriba movimiento vale 0, si sigue valiendo el valor absurdo, es que no se ha
		// cambiado, por eso
		// lo pido por teclado.
		if (movimiento == 0) {
			System.out.println("Dime un numero byte, serán los movimientos");
			movimiento = Byte.parseByte(sc.nextLine());

		}

		for (byte i = 0; i < movimiento; i++) {

			

			if (Funciones.moverCaballo(iconosAula, nombresAula, direccion) == true) {

				if (direccion == 1) {
					direccion = -1;
				} else if (direccion == -1) {
					direccion = 1;

				}

			}
			System.out.println(Funciones.imprimeAula(iconosAula, nombresAula));
		}

		

	}

}
