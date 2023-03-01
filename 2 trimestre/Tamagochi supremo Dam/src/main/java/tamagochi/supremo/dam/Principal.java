package tamagochi.supremo.dam;

import java.util.Scanner;

import clases.Comida;
import clases.Gato;
import clases.Juego;
import clases.Perro;
import clases.Tamagotchi;
import enumeration.Especies;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Tamagotchi animalito = new Tamagotchi(null, null);
		Comida estofado= new Comida("estofado",(byte)20, (byte)10);
		Juego peluche=new Juego("Peluche",(byte)20,(byte)10);
		byte opcion = 0;
		while (opcion < 1 || opcion > 4) {
			System.out.println("Dime la clase que quiere que tenga tu tamagotchi:");
			System.out.println("\t - 1. Perro" + "\n\t - 2. Gato" + "\n\t - 3. Dragón" + "\n\t - 4. Pollito");
			
			opcion = Byte.parseByte(scan.nextLine());
			
			switch (opcion) {
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
			System.out.println("Elige unas de las siguientes acciones."
			+"\n - 1. Comer"
			+"\n - 2. Dormir"
			+"\n - 3. Jugar"
			+"\n - 4. Relajarse");
			
			if(animalito.getEspecie()==Especies.PERRO) {
				System.out.println(" - 5. Pasear");
			}
			
			if(animalito.getEspecie()==Especies.GATO) {
				System.out.println(" - 5. TendeciasAlCaos");
			}
			System.out.println(animalito);
			opcion = Byte.parseByte(scan.nextLine());
			
			switch (opcion) {
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
			}
			animalito.setHambre((byte) (animalito.getHambre()+5));
			animalito.setSueño((byte) (animalito.getSueño()+5));
			animalito.setDiversion((byte)(animalito.getDiversion()-5));
			animalito.setEstres((byte)(animalito.getEstres()+5));
			if(animalito.getEspecie()==Especies.PERRO) {
				((Perro)animalito).setPaseo((byte) (((Perro)animalito).getPaseo()-5));
			}
			if(animalito.getEspecie()==Especies.GATO) {
				((Gato)animalito).setCausarCaos((byte) (((Gato)animalito).getCausarCaos()-5));
			}
		}
	}
}
