package daniel.vargas.segundo.examen.dam;

import java.util.Random;
import java.util.Scanner;

/**
 * Es la funcion donde estoy realizando todos los ejercicios del reloj
 * apocalipsis
 * 
 * @author Daniel Cesar Vargas Holguin
 *
 */
public class Principal {
	/**
	 * Es la funcion main donde estoy realizando todos los ejercicios del reloj
	 * apocalipsis
	 * 
	 * @param args no tiene uso (por ahora)
	 */
	public static void main(String[] args) {
		// Ejercicio 1.

		Scanner sc = new Scanner(System.in);
		short minutosParaMedianoche = 0;
		byte turnos = 0;
		byte opcion = 0;
		String estacion = "";
		byte eleccionSuceso;
		do {
			System.out.println("Dime un numero");
			minutosParaMedianoche = Short.parseShort(sc.nextLine());

		} while (!(minutosParaMedianoche > -719 && minutosParaMedianoche > -1));

		// Ejercicio 2.

		byte probabilidad = 0;

		do {
			System.out.println("Dame otro numero");
			probabilidad = Byte.parseByte(sc.nextLine());

		} while (!(probabilidad <= 0 && probabilidad >= 100));

		// Ejercicio 3.

		while (turnos <= 30 && turnos >= 30) {
			turnos++;
			// Ejercicio 4.
			do {

				switch (opcion) {

				case 0:
					estacion = "Primavera";
					break;
				case 1:
					estacion = "Verano";
					break;
				case 2:
					estacion = "Otoño";
					break;
				case 3:
					estacion = "Invierno";
					break;
				}
				// Ejercicio 8
				do {
					System.out.println("\n\t0 - Eleccion aleatoria" + "\n\t1 - Comienza una pandemia"
							+ "\n\t2 - Termina una pandemia" + "\n\t3- Comienza una guerra nuclear"
							+ "\n\t4 - Se firma la paz en una guerra no nuclear" + "\n\t5 - Comienza una guerra nuclear"
							+ "\n\t6- Se firma la paz en una guerra nuclear"
							+ "\n\t7 - El egoísmo de una gran empresa contribuye a aumentar la contaminación global"
							+ "\n\t8 - Un avance tecnológico reduce la contaminación global"
							+ "\n\t9 - Sale el mercado un nuevo éxito de música reggaeton"
							+ "\n\t10 - Dios decide no matar a un gatito hoy");
					System.out.println("Elige un evento");
					eleccionSuceso = Byte.parseByte(sc.nextLine());

					switch (eleccionSuceso) {
					case 0:
						System.out.println("Eleccion aleatoria");
						Random rand = new Random();
						eleccionSuceso = (byte) rand.nextInt(1, 10);

						break;
					case 1:
						System.out.println("Comienza una pandemia");

						break;
					case 2:
						System.out.println("Termina una pandemia");

						break;
					case 3:
						System.out.println("Comienza una guerra nuclear");

						break;
					case 4:
						System.out.println("Se firma la paz en una guerra no nuclear");

						break;
					case 5:
						System.out.println("Comienza una guerra nuclear");
						break;
					case 6:
						System.out.println("Se firma la paz en una guerra nuclear");

						break;
					case 7:
						System.out.println(
								"El egoísmo de una gran empresa contribuye a aumentar la contaminación global");

						break;
					case 8:
						System.out.println("Un avance tecnológico reduce la contaminación global");

						break;
					case 9:
						System.out.println("Sale el mercado un nuevo éxito de música reggaeton");

						break;
					case 10:
						System.out.println("Dios decide no matar a un gatito hoy");
						break;
					}

				} while (eleccionSuceso < 0 || eleccionSuceso > 10);

			} while (opcion >= 0 && opcion <= 3);

		}
		// -------
	}

}
