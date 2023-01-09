package examen.recu.programacion;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Dime tu nombre");
		String nombre=sc.nextLine();
		System.out.println("Dime tu apellido");
		String primerApellido=sc.nextLine();
		System.out.println("Dime tu segundo apellido");
		String segundoApellido=sc.nextLine();
		System.out.println("Dime tu año nacimiento");
		short añoNacimiento=Short.parseShort(sc.nextLine());
		System.out.println("Dime tu horas totales jugadas a videojuegos durante este año");
		byte horaJugada=Byte.parseByte(sc.nextLine());
		System.out.println("Dime el nº total de videojuegos que ha llegado a completar este año");
		byte numTotalVideoJuegos=Byte.parseByte(sc.nextLine());
		
		System.out.println(primerApellido+" "+segundoApellido+" "+nombre);
		float promedioHoraVideojuego=horaJugada/numTotalVideoJuegos;
		System.out.println("le ha costado "+promedioHoraVideojuego+ " Horas");
		
		boolean resultado=(horaJugada>730||numTotalVideoJuegos<10);
		
		

	}

}
