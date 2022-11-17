package elige.tu.propia.aventura1;

import java.util.Scanner;

public class TuPropiaAventura {

	public static void main(String[] args) {
		// estoy aprendiendo usar switch que es "parecido" a if.

		Scanner scan = new Scanner(System.in);
		boolean repetirRespuesta = true;
		// Aquí estamos haciendo switch de repuesta.

		byte nHombres = 0;
		byte nMujeres = 0;
		byte muertes = 0;

		while (repetirRespuesta == true) {

			System.out.println("Escribe h si eres hombre, m si eres mujer y n si eres neutro");
			String respuesta = scan.nextLine();
			char genero = 'm'; // todas existen dentro de su ambito "{}" es mejor ponerlo fuera de las llaves

			// no dentro.

			switch (respuesta) {

			case "h": // Si se cumple algunos de los h, hombre H, Hombre es H.
			case "hombre":
			case "H":
			case "Hombre":
				genero = 'h';
				nHombres++;
				break;
			case "m":
			case "mujer":
			case "M":
			case "Mujer":
				genero = 'm';
				nMujeres++;
				break;
			case "n":
				genero = 'n';
				break;
			default:
				genero = 'n';
				break;

			}

//------------------------------------------------------------------------------------------------------------------------------------------------		

			System.out.println("Dime el nº de alumnos de tu aula.");
			byte nAlumnos = Byte.parseByte(scan.nextLine());
			System.out.println("Cenec, 24 de Octubre, " + nAlumnos

					+ " estudiantes están en el \"aula 2\"\n" + "aguantando el sopor"

					+ " de la clase de programación. De repente,\n"
					+ "cae un ornitorrinco con metralletas del tragaluz."

					+ "¿Qué haces?\n\t1 - Le tiras tu monitor a la cabeza"

					+ "\n\t2 - Le dices \"Juan Carlos\",¿Dónde te habías metido?" + "\n\t3 - Me escondo");

			// /n:Punto aparte. \t1: Sirve para nombrar.

			byte opcion = Byte.parseByte(scan.nextLine());

			// Aquí estamos haciendo un switch de opciones

			switch (opcion) {

			case 1:
				System.out.println("Le da una patada ninja al monitor y te lo devuelve");
				System.out.println("\n\t1 - Se lo tiras otra vez" + "\n\t2 - Te escondes bajo la silla"
						+ "\n\t3 - Rompo la silla y destruyo al pinche mama huevo"
						+ "\n\t4 - Salgo volando en mi jet lag");

				byte opcion1 = Byte.parseByte(scan.nextLine());

				switch (opcion1) {

				case 1:
					System.out.println("Se lo tiras otra vez");
					break;
				case 2:
					System.out.println("Te escondes bajo la silla");
					break;
				case 3:
					System.out.println("Rompo la silla y destruyo al pinche mama huevo");
					break;
				case 4:
					System.out.println("Salgo volando en mi jet lag");
					break;
				default:
					System.out.println("Tenías que poner un numero" + "entre 1 y 4");
					break;

				}

			case 2:
				System.out.print("Te pega un tiro, y te dice: " + "Me llamo cancamuso, so payas"
						+ (genero == 'h' ? 'o' : genero == 'm' ? 'a' : 'e') + ": Muere. Has Muerto");
				muertes++;
				System.out.println("a");// lo que acabamos
				// de
				// hacer se
				// llama
				// "if ternario"

				break;

			case 3:
				System.out.println("Se lía a metralletazos, a tí" + " no te mata,\n" + "porque te has escondido,"
						+ " pero se carga a " + nAlumnos * 60 / 100 + "\n\t1 - Los " + nAlumnos
						+ " Yo muero y me tranformo en zombi\n"
						+ "\t2 - Me doy cuenta en el fondo de mi ser que tengo un super poder...\n"
						+ "\t3 - Mato al ornitorrinco a puñetazos\n"
						+ "\t4 - El ornitorrinco sale corriendo porque ve una cucaracha");

				byte opcion2 = Byte.parseByte(scan.nextLine());

				if (opcion2 == 1) {
					System.out.println("Los " + nAlumnos
							+ " yo muero y me tranformo en zombi,  mato al ornitorrinco. Empieza el apocalipsis zombi... ");
					muertes++;
				}

				else if (opcion2 == 2) {
					System.out.println(
							"Me doy cuenta en el fondo de mi ser que tengo un super poder, en el cual, realiza un kamemeha por el podre cagarme al mono y salvar "
									+ nAlumnos + " alumnos.");
				} else if (opcion2 == 3) {
					System.out.println("Mato al ornitorrinco a puñetazos");
				} else if (opcion2 == 4) {
					System.out.println("El mono sale corriendo porque ve una cucaracha");
				}
				break;

			default:
				System.out.println("Tenías que poner un numero" + "entre 1 y 3");
				break;
			}

			System.out.println("¿Volvemos a repetir esta aventura?");

			if (scan.nextLine().equalsIgnoreCase("si")) {
				repetirRespuesta = true;
			} else {
				repetirRespuesta = false;

			}
		}

		System.out.println("Han jugado " + nHombres + " hombres y han jugado " + nMujeres + " mujeres.");
		System.out.println("He muerto " + muertes + " :(");
	}
}
