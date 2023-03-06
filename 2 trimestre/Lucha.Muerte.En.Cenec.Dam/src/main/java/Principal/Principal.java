package Principal;

import Clases.Guerrero;

import java.util.ArrayList;
import java.util.Scanner;

import Clases.Arma;
import Clases.Berserker;
import Clases.Escudo;
import Clases.Luchador;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		byte opcionArma = 0;
		byte opcionEscudo = 0;
		String nombreGuerrero="";
		String nombreBerseck="";
		
		Escudo escudo = new Escudo("Escudo de gárgola", (byte) 10);
		ArrayList<Escudo> escudos = new ArrayList<Escudo>();
		escudos.add(escudo);
		escudos.add(new Escudo("Escudo De hierba", (byte) 7));
		escudos.add(new Escudo("Escudo de águila", (byte) 5));
		escudos.add(new Escudo("Gran escudo de Havel", (byte) 13));

		Arma alabarda = new Arma("alabarda", (byte) 10);
		ArrayList<Arma> armas = new ArrayList<Arma>();
		armas.add(alabarda);
		armas.add(new Arma("Lanza maligna pero poco", (byte) 15));
		armas.add(new Arma("Patito amarillo de goma", (byte) 3));
		armas.add(new Arma("Azote con muescas", (byte) 13));
		
		opcionArma = -1;
		while (opcionArma < 0 || opcionArma > armas.size()) {

			System.out.println("Elije alguna de estas armas: ");

			for (byte i = 0; i < armas.size(); i++) {
				System.out.println("Posicion " + i + ": " + armas.get(i));
			}
			
			opcionArma = Byte.parseByte(scan.nextLine());
		}
		opcionEscudo = -1;
		while (opcionEscudo < 0 || opcionEscudo > escudos.size()) {

			System.out.println("Elije alguna de estos escudos: ");

			for (byte i = 0; i < escudos.size(); i++) {
				System.out.println("Posicion " + i + ": " + escudos.get(i));
			}
			
			opcionEscudo = Byte.parseByte(scan.nextLine());
		}
		System.out.println("Dime el nombre de tu guerrero");
		nombreGuerrero=scan.nextLine();
		
		Guerrero guerrero=new Guerrero(nombreGuerrero,armas.get(opcionArma),escudos.get(opcionEscudo));
		
		opcionArma = -1;
		while (opcionArma < 0 || opcionArma > armas.size()) {

			System.out.println("Elije tu primera arma: ");

			for (byte i = 0; i < armas.size(); i++) {
				System.out.println("Posicion " + i + ": " + armas.get(i));
			}
			
			opcionArma = Byte.parseByte(scan.nextLine());
		}
		
		opcionArma = -1;
		while (opcionArma < 0 || opcionArma > armas.size()) {

			System.out.println("Elije tu segunda arma: ");

			for (byte i = 0; i < armas.size(); i++) {
				System.out.println("Posicion " + i + ": " + armas.get(i));
			}
			
			opcionArma = Byte.parseByte(scan.nextLine());
		}
		
		System.out.println("Dime el nombre de tu berseck");
		nombreBerseck=scan.nextLine();
		
		Berserker bersie = new Berserker(nombreBerseck, armas.get(opcionArma), armas.get(opcionArma));
		
		// Guerrero daniel=new Guerrero("Daniel",armas.get(1), escudos.get(0));
		//guerrero.recibirDaño(guerrero.atacar());  //Prueba quitarme vida.
		
		Luchador ganador = guerrero.pelear(bersie);
		System.out.println("Ganador: " + ganador);
	}

}
