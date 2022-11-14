package jugandoconstringsdam;

import java.util.Scanner;

public class JugandoConStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char opcion = '-';
		String texto = "";
		String mimificado = "";
		String codificado = "";
		while (opcion != 's') {
			System.out.println("Elige una accion:" + "\n\te - Escribir texto" + "\n\ti - Invertir el texto"
					+ "\n\tc - Codificar texto" + "\n\tf - Mimificar un texto" + "\n\td - Decodificar el texto"
					+ "\n\tM - Cambiar a todo mayúsculas" + "\n\tm - Cambiar a todo minúsculas"
					+ "\n\tn - Poner mayúsculas solo la primera letra" + "\n\ta - Codificar con números aleatorios"
					+ "\n\t0 - Dime si el texto tiene números"

					+ "\n\ts - Salir");
			opcion = sc.nextLine().charAt(0);
			switch (opcion) {
			case '0':
				System.out.println("¿Tiene el texto número?" + (texto.contains("1") || texto.contains("2")
						|| texto.contains("3") || texto.contains("4") || texto.contains("5") || texto.contains("6")
						|| texto.contains("7") || texto.contains("8") || texto.contains("9") || texto.contains("0")));
				break;
			case 'e':
				System.out.println("voy escribir un texto");
				texto = sc.nextLine();

				break;
			case 'i':
				System.out.println("Voy a invertir un texto");
				for (byte i = (byte) (texto.length() - 1); i >= 0; i--) { // (byte i=0 ;i <texto.length(); i++)
																			// Incrementa !!! // (byte
																			// i=(byte)(texto.lenght()-1) ;i>=0 ;i--) Lo
																			// inviertes!!!! (decrece)
					System.out.print(texto.charAt(i));

				}
				System.out.println();
				break;
			case 'c':
				System.out.println("Voy a codificar un texto");
				for (byte i = 0; i < texto.length(); i++) {
					codificado += (char) (texto.charAt(i) + 10);
				}
				System.out.println(codificado);

				break;
			case 'f':
				System.out.println("Voy a Mimificar un texto");
				// hola
				// hmiomilmiami

				for (byte i = 0; i < texto.length(); i++) {
					// 1 - En vez de imprimir, concatenar en la variable mimificado

					mimificado += (texto.charAt(i) + "mi"); // System.out.print(texto.charAt(i)+"mi");
				}
				// 2 - Imprimir la variable mimificado

				System.out.println(mimificado);

				break;
			case 'd':
				System.out.println("Voy decodificar el texto");
				// 3- Hacer otro for que a partir de la variable mimificado,imprima la palabra
				// original
				String desmimificar = " ";
				for (int i = 0; i < mimificado.length(); i = (i + 3)) {
					System.out.print(mimificado.charAt(i));
				}
				System.out.println();

				mimificado = mimificado.replace("mi ", "");
				System.out.println(mimificado);

				break;
			case 'M':
				System.out.println("Voy a cambiar a todo mayúsculas");
				texto = texto.toUpperCase();
				System.out.println(texto);
				break;
			case 'm':
				System.out.println("Voy a cambiar a todo minúsculas");
				texto = texto.toLowerCase();
				System.out.println(texto);
				break;
			case 'n':
				System.out.println("Voy a poner mayúsculas solo la primera letra");
				System.out.print(("" + texto.charAt(0)).toUpperCase());
				for (byte i = 1; i < texto.length(); i++) {
					System.out.print(("" + texto.charAt(i)).toLowerCase());
				}
				System.out.println();
				break;
			case 'a':
				System.out.println("Voy a codificar con números aleatorios");
				//Haz aqui lo mismo q la opcion c
				//pero ademas de codificar entre letra y letra introduce
				//una letra a y z aleatoria.
				//Eje, si escribimos en texto: acaba, la opcion c daria:
				//kmklk
				//Esta opción, además de eso, entre letra y letrainserta
				//otra letra aleatoria. Eje:
				//kvmxkrlqku
				
				break;
			case 's':
				System.out.println("Te me calmas, vete usted tranquilo con Dios");
				break;
			default:
				System.out.println("La opcion ' " + opcion + " ' no es correcta");
			}

			System.out.println("Pulsa intro para continuar, y te me calmas");
			sc.nextLine();
		}

	}
}
