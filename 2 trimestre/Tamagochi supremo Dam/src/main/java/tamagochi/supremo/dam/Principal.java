package tamagochi.supremo.dam;

import java.util.Scanner;

import clases.Comida;
import clases.Gato;
import clases.Juego;
import clases.Perro;
import clases.Tamagotchi;
import enumeration.Especies;
/**
 * Proyecto principal donde se va a llevar acabo el juego del tamagotchi.
 * @author Daniel Cesar Vargas Holguín.
 *
 */
public class Principal {
/**
 * Funcion donde se va a llevar el juego del tamagotchi.
 * @param args no se usa
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Tamagotchi animalito = new Tamagotchi(null, null);
		Comida estofado = new Comida("estofado", (byte) 20, (byte) 5);
		Juego peluche = new Juego("Peluche", (byte) 20, (byte) 5);
		byte opcion1 = 0;
		byte opcion2 = 0;
		
		System.out.println("//Recuerda que el tamagotchi muere con las siguientes indicaciones:\n"+
		"hambre: 100, sueño: 100, diversion: 0, estres: 100\n"+
		"Si es perro, cuando paseo: 0, y si es gato, cuando causar caos: 0.//\n");
		
		while (opcion1 < 1 || opcion1 > 4) {
			System.out.println("Dime la clase que quiere que tenga tu tamagotchi:");
			System.out.println("\t - 1. Perro" + "\n\t - 2. Gato" + "\n\t - 3. Dragón" + "\n\t - 4. Pollito");

			opcion1 = Byte.parseByte(scan.nextLine());

			switch (opcion1) {
			case 1:
				animalito = new Perro(null, Especies.PERRO);
				break;
			case 2:
				animalito = new Gato(null, Especies.GATO);
				break;
			case 3:
				animalito.setEspecie(Especies.DRAGÓN);
				break;
			case 4:
				animalito.setEspecie(Especies.POLLITO);
				break;
			default:
				System.out.println("Tenías que elegir entre 1 y 4");
				break;
			}
		}
		System.out.println("Dime el nombre de tu tamagotchi");
		animalito.setNombre(scan.nextLine());

		while (animalito.estaVivo()) {
			animalito.crecer();
			System.out.println("Elige unas de las siguientes acciones." + "\n - 1. Comer" + "\n - 2. Dormir"
					+ "\n - 3. Jugar" + "\n - 4. Relajarse");

			if (animalito.getEspecie() == Especies.PERRO) {
				System.out.println(" - 5. Pasear");
			}

			if (animalito.getEspecie() == Especies.GATO) {
				System.out.println(" - 5. TendeciasAlCaos");
			}
			System.out.println(animalito);
			if (animalito.getEspecie() == Especies.DRAGÓN || animalito.getEspecie() == Especies.POLLITO) {
				opcion2 = 0;
				while (opcion2 < 1 || opcion2 > 4) {
					opcion2 = Byte.parseByte(scan.nextLine());
				}
			} else {
				opcion2 = 0;
				while (opcion2 < 1 || opcion2 > 5) {
					opcion2 = Byte.parseByte(scan.nextLine());
				}
			}
			switch (opcion2) {
			case 1:
				animalito.comer(estofado);
				break;
			case 2:
				animalito.dormir();
				break;
			case 3:
				animalito.jugar(peluche);
				break;
			case 4:
				animalito.relajarse();
				break;
			case 5:
				if (animalito.getEspecie() == Especies.PERRO) {
					((Perro) animalito).pasear();
				} else {
					((Gato) animalito).causarCaos();
				}
				break;
			}

			animalito.setHambre((byte) (animalito.getHambre() + 5));
			animalito.setSueño((byte) (animalito.getSueño() + 5));
			animalito.setDiversion((byte) (animalito.getDiversion() - 5));
			animalito.setEstres((byte) (animalito.getEstres() + 5));
			if (animalito.getEspecie() == Especies.PERRO) {
				((Perro) animalito).setPaseo((byte) (((Perro) animalito).getPaseo() - 5));
			}
			if (animalito.getEspecie() == Especies.GATO) {
				((Gato) animalito).setCausarCaos((byte) (((Gato) animalito).getCausarCaos() - 5));
			}
		}
		System.out.println("Mi tamagochi " + animalito.getNombre() + " ha muerto, con la edad de " + animalito.getEdad()
				+ " años");
	}
}
