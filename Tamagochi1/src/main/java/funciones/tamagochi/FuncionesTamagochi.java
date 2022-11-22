package funciones.tamagochi;

public class FuncionesTamagochi {

 public static String funcionesTamagochi (String razasTamagochi) {
	 
	(razasTamagochi < 1 || razasTamagochi > 4)
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
	return razasTamagochi;
	 
 	}
	
}

