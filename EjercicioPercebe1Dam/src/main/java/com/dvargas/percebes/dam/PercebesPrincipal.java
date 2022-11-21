package com.dvargas.percebes.dam;

import java.util.Scanner;

public class PercebesPrincipal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime cuantos bloques quieres");
		byte nb=Byte.parseByte(sc.nextLine());
		System.out.println("Dime cuantos pisos quieres");
		byte np=Byte.parseByte(sc.nextLine());
		
		System.out.println("|-----------------------------|\n"
				          +"| 13 Rue del Percebe          |\n"
				          +"|-----------------------------|");
		
		for (byte c=0; c<np; c++) { 
		for (byte d=0; d<nb; d++) {   
			System.out.print("|-----|");
		}
		System.out.println();
		for ( byte a= 0;  a< 2; a++) {
			for (byte b =0; b<nb; b++) {  
			System.out.print("|     |");
			}
			System.out.println();
			
		}	
		}
	}

}
