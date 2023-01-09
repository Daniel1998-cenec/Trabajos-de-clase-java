package com.recursividad.ejemplo.dam;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Escribeme un texto");
		String texto=sc.nextLine();
		System.out.println("¿Contiene \"n s\"? "+
		texto.contains("n s"));
		System.out.println("¿acaba con \"nso\"? "+
		texto.endsWith("nso"));
		System.out.println("¿empieza con \"hola buen\"? "+
		texto.startsWith("hola buen"));
		System.out.println("índice de \"ahor\":"+
		texto.indexOf("ahor"));
		System.out.println("último índice de \"ahor\": "+
		texto.lastIndexOf("ahor"));
		
		System.out.println("Desde la posicion 10 a 26: "+
		texto.substring(10,26));
		
		System.out.println("Dime la subcadena a buscar");
		String subcadena=sc.nextLine();
		//Copio en otra variable, porque necesito modificar el texto original.
		String texto2=texto;
		//En el bucle voy a ir eliminando texto, y voy a seguir hasta que la cadena
		//que busco ya no aparezca más veces
		while(texto2.indexOf(subcadena)!=-1) {
			int indice=texto2.indexOf(subcadena);
			texto2=texto2.substring(indice+subcadena.length());
			System.out.println(texto2);
		}
		//Quita espacios en blanco y tabulaciones al principio y fin
		texto=texto.strip();

		System.out.println("isblack: "+texto.isBlank());
		texto=texto.strip();
		System.out.println("isEmpty: "+texto.isEmpty());
		System.out.println("isEmpty: "+texto.equals(""));
		System.out.println((texto+"\n").repeat(425));
		
		Random r=new Random();
		for(short i=0;i<texto.length();i++) {
			char letra=texto.charAt(i);
			if(r.nextBoolean()) {                          //me da true o false de forma aleatoria
				System.out.print((""+letra));
			}else {
				System.out.print((""+letra).toUpperCase());
			}
					
			
			
		}

	}

}
