package pruebasForDam;

import java.util.Random;
import java.util.Scanner;

public class pruebasForDam {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime cuantas letras aleatorias quieres");
		byte nLetras=Byte.parseByte(sc.nextLine());
		Random aleatorio=new Random();
		
		for(byte i=0; i<nLetras; i++) {
			System.out.println((char)aleatorio.nextInt(97,123)); //TablaAsci.
		}
		
		/*Random aleatorio=new Random();
		System.out.println(aleatorio.nextInt(10,60));
		byte numero=(byte)aleatorio.nextInt(10,60);*/
		
		/*System.out.println("Dime qué tabla de multiplicador quieres hacer (1-10)");
		byte numero=Byte.parseByte(sc.nextLine());
		
		for(byte i=0; i<=10; i++) {
			System.out.println(numero+" x "+i+" = "+numero*i);
		}
		
		//----------------------------------------------------------------------
		
		for(byte i=0; i<=numero*10; i+=numero) {
			System.out.println(numero+" x "+(i/numero)+" = "+i);
		}
		
		//-------------------------------------------------------------------
		
		//Aqui ha dado la tabla de multiplicar alrevez
		
		for(byte i=10;i>=0;i--) {
			System.out.println(numero+" x "+i+" = "+numero*i);
		
		}*/
		
		//---------------------------------------------------------------------------
		
		
	}

}
