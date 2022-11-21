package tamagochi.string.dam;

import java.util.Scanner;

public class StringTamagochi {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String razasTamagochi = "";
		String razas;

		while (!(razasTamagochi.equalsIgnoreCase("perro") || razasTamagochi.equalsIgnoreCase("gato")
				|| razasTamagochi.equalsIgnoreCase("hipopotamo") || razasTamagochi.equalsIgnoreCase("carpincho"))) {

			System.out.println("Dime la raza de tu tamagochi" + "\n");
			System.out.println("Elige la raza:");
			System.out.println("\n\t1. Perro" + "\n\t2. Gato" + "\n\t3. Hipopótamo" + "\n\t4. Carpincho");
			razasTamagochi = sc.nextLine();

			switch (razasTamagochi.toLowerCase()) {
			case "perro":
				System.out.println("Tu tamagochi es un perro");
				razas = "perro";
				break;
			case "gato":
				System.out.println("Tu tamagochi es un gato");
				razas = "gato";
				break;
			case "hipopotamo":
				System.out.println("Tu tamagochi es un hipopotamo");
				razas = "hipopotamo";
				break;
			case "carpincho":
				System.out.println("Tu tamagochi es un Carpincho");
				razas = "carpincho";
				break;
			default:
				System.out.println("Tenías que elegir uno de esos nombre");
				break;
			}
		}
	}

}
