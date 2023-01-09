package por.la.cara;

import java.util.Scanner;

import por.la.cara.dam.Funciones;

public class PorLaCara {

	public static void main(String[] args) {
		/*
		 * /"""\ (|o o|) \ - / /-----\
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuantas caras quieres?");
		
		byte nCaras = Byte.parseByte(sc.nextLine());
		System.out.println("Elije los ojos que quieres");
		char ojos = sc.nextLine().charAt(0);
		System.out.println("Elije la boca que quieres");
		char  boca= sc.nextLine().charAt(0);
		/*String plantillaojos="(|o o|)";
		
		System.out.println(Funciones.pintaTrozoCara("pelo", nCaras));
		System.out.println(Funciones.pintaTrozoCara(Funciones.cambiaCaracter (plantillaojos,'o' ,ojos),nCaras));
		System.out.println(Funciones.pintaTrozoCara(Funciones.cambiaCaracter (" \\ - / ",'-' ,boca),nCaras));
		System.out.println(Funciones.pintaTrozoCara(" /---\\ ", nCaras));*/
		
		for (byte i = 0; i < nCaras; i++) {
			System.out.print(Funciones.cambiaCaracter("(|o o|)", 'o', ojos));
		}
		System.out.println();
		
		for(byte i=0;i<nCaras;i++) {
			String nombreElegido=" "+Funciones.nombreAleatorio()+" ";//El mas largo tiene  24 caracteres
			
			if(nombreElegido.length() <24) {
				byte espaciosQueFaltan=(byte)(24-nombreElegido.length());
				//Necesito bucles!!
				nombreElegido=espaciosQueFaltan/2+nombreElegido+espaciosQueFaltan/2;
			}
			System.out.println(nombreElegido);
		}
	}
}
