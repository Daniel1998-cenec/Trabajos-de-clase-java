package pruebas.arrays;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*ejemplo 1
		 * int[] numero=new int[5]; 
		 * numero[1]=4; 
		 * System.out.println(numero[0]);
		 * System.out.println(numero[1]); 
		 * System.out.println(numero[2]);
		 * System.out.println(numero[3]);
		 * 
		 * for (byte i=0;i<numero.length;i++) { 
		 * numero[i]=i;
		 * System.out.print(numero[i]+" "); }
		 */

		/*
		 * ejemplo 2 
		 * Scanner sc=new Scanner (System.in);
		 * System.out.println("Dime cuantos numeros quieres guardar"); 
		 * byte tamaño=Byte.parseByte(sc.nextLine());
		 * 
		 * byte [] numeros=new byte [tamaño];
		 * 
		 * for (byte i=0;i<numeros.length;i++) {
		 * System.out.println("Dime el nº en la posición "+i);
		 * numeros[i]=Byte.parseByte(sc.nextLine()); }
		 * 
		 * for (byte i=0;i<numeros.length;i++) { System.out.println(numeros[i]+" "); }
		 * 
		 * //Sacar la media 
		 * 
		 * short acumulado=0; for(byte i=0;i<numeros.length;i++) {
		 * acumulado+=numeros[i]; }
		 * 
		 * System.out.println("media: "+acumulado/numeros.length);
		 */

		
		/*
		 * System.out.println("Dime el nº de nombres que quieres darme"); 
		 * byte tamaño=Byte.parseByte(sc.nextLine()); String[] nombres=new String[tamaño];
		 * 
		 * for (byte i=0;i<nombres.length;i++) { System.out.println(nombres[i]+" "); }
		 */

		
		/*String[] numeros= {"-4", "33", "982", "12", "74"};
		boolean[] booleanos= {true, false, 55<44};
		
		for (byte i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i] + " ");
		}*/
		
		/*Scanner sc = new Scanner(System.in);
		String[] nombres= {"Paco", "Ana", "Pepe", "Gaspar"};
		String[] apellidos= {"Gonzalo", "Calvo", "Pérez", "Camacho","Diaz", "Berlanga","Urbano", "Boni", "ElPepe"};
		System.out.println("Dime cuántas personas aleatorias quieres");
		byte nPersonas=Byte.parseByte(sc.nextLine());
		
		Random r=new Random();
		for (byte i=0;i<nPersonas;i++) {
			byte aleatorio=(byte)r.nextInt(nombres.length);
			byte a1Aleatorio=(byte)r.nextInt(apellidos.length);
			byte a2Aleatorio=(byte)r.nextInt(apellidos.length);
			System.out.println(nombres[aleatorio]+" "+apellidos[a1Aleatorio]+" "+apellidos[a2Aleatorio]);
			
		}*/
		
		Scanner sc = new Scanner(System.in);
		
		 char[] charizard=new char[10];
		 for (byte i=0;i<charizard.length;i++) {
			 System.out.println("Dime el nº en la posición "+i);
			 charizard[i]=sc.nextLine().charAt(0); 
			 }
		//char[] a1Charizard= {'c','z', 't', '6', '9', 'a', 'i', 'p', 'x', 'd'};
		
	}
	

}
