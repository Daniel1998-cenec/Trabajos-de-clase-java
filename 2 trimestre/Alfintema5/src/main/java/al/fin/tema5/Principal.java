package al.fin.tema5;

import java.util.Random;
import java.util.Scanner;

import clases.Gato;
import clases.Perro;
import clases.Sim;

public class Principal {

	public static void main(String[] args) {
		/*
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		
		Sim pepe=new Sim("Pepe","Tardo",'h',(byte)50,(byte)50,(byte)50,(byte)50,
				null,null,null,null);
		
		Sim eufrasio=new Sim("Eufrasio","Buhero",'h');
		
		pepe.comer();
		
		Sim elvira=new Sim("elvira","lápida",'m',null,pepe);
		
		Perro sputnik=new Perro("sputnik","Chucho","Multicolor",'h',pepe);
		
		sputnik.setDueño(elvira);
		sputnik.setNombre("Soyuz");
		
		
		//elvira.perros=new Perro[] { sputnik };
		 
		//set modificar
		elvira.setPerros(new Perro [1]);
		//get para mirar
		elvira.getPerros()[0]=sputnik;
		
		Gato rubi=new Gato("rubi","Gatuno",'m',elvira);
		
		pepe.setGatos(new Gato [1]);
		pepe.getGatos()[0]=rubi;
		rubi.setDueño(pepe);
		
		System.out.println(pepe);
		*/
		Scanner sc=new Scanner (System.in);
		System.out.println("Dime nombre para un sim");
		String nombre=sc.nextLine();
		System.out.println("Dime los apellidos");
		String apellidos=sc.nextLine();
		System.out.println("Dime el genero (h/m)");
		char genero=sc.nextLine().charAt(0);
		
		Sim miSim=new Sim(nombre,apellidos,genero);
		byte opcion;
		do {
			System.out.println("¿Qué quieres hacer con tu sim?"
					+"\n\t 0 - Salir del programa"
					+"\n\t 1 - imprimirlo"
					+"\n\t 2 - Cambiar nombre"
					+"\n\t 3 - Cambiar apellidos"
					+"\n\t 4 - Cambiar género"
					+"\n\t 5 - modificar hambre");
			opcion=Byte.parseByte(sc.nextLine());
			switch(opcion) {
			case 1:
				System.out.println(miSim);
				break;
			case 2:
				System.out.println("dime el nuevo nombre");
				miSim.setNombre(sc.nextLine());
				break;
			case 3:
				System.out.println("Dime los nuevos apellidos");
				miSim.setApellido(sc.nextLine());
				break;
			case 4:
				System.out.println("Introduce el nuevo género");
				miSim.setGenero(sc.nextLine().charAt(0));
				break;	
			case 5:
				System.out.println("Dime nivel de hambre (0-100)");
				miSim.setHambre(Byte.parseByte(sc.nextLine()));
				break;
			}
		}while(opcion!=0);
	}

}
