package com.recursividad.dam;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Dime una letra minúscula y te digo todas las vocales entre a y esa letra");
		char letraFinal=sc.nextLine().charAt(0);
		//Para el lunes 5, conviertete este bucle en una funcion recursiva, que se pueda llamar así:
		//System.out.println(Funciones.letrasRecursivas('a',letrasFinal));
		for (byte i=(byte)letraFinal;i>='a';i--) {
			if((char)i=='a'||(char)i=='e'||(char)i=='i'||(char)i=='o'||(char)i=='u') {
				System.out.println((char)i);
				
			}
		}

	}

}