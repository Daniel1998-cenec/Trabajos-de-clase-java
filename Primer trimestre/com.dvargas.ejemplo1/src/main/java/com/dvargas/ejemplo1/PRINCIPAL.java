package com.dvargas.ejemplo1;

import java.util.Scanner;

public class PRINCIPAL {

	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("dime tu nombre");
		String nombre=sc.nextLine();
		nombre = "Vargas" ;  
		System.out.println("te doy la bienvenida,"+nombre+". venga a currar");
		System.out.println("¿cuanto mides?");
		float altura=Float.parseFloat(sc.nextLine());
		System.out.println("¿En qué año naciste?");
		int añoNacimiento=Short.parseShort(sc.nextLine());
		System.out.println(nombre +" - "+altura+" metros."
				+" Naciste en "+añoNacimiento); 
		int tendras69Años=añoNacimiento+75;
		System.out.println("Tendrás 75 años en "+(añoNacimiento*(5+75)/10));
		int miEdad=2022-añoNacimiento;
		System.out.println("Tienes "+miEdad+"años.");
		float miMilenio=añoNacimiento/1000f;
		System.out.println("Naciste en el milenio "+miMilenio);
		System.out.println("En ese milenio pasaron "+añoNacimiento%1000+" años");
		System.out.println("Dime el nombre de de otra persona ");
		String nombre2=sc.nextLine();
		System.out.println("Bienvenid@"+ nombre2);
		
	}

}
