package al.fin.tema5;

import java.util.Random;
import java.util.Scanner;

import clases.Gato;
import clases.Perro;
import clases.Sim;

public class Principal {

	public static void main(String[] args) {
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
		
		/**
		 * elvira.perros=new Perro[] { sputnik };
		 */
		elvira.perros=new Perro [1];
		elvira.perros[0]=sputnik;
		sputnik.dueño=elvira;
		
		Gato rubi=new Gato("rubi","Gatuno",'m',elvira);
		
		pepe.gatos=new Gato [1];
		pepe.gatos[0]=rubi;
		rubi.dueño=pepe;
		
		System.out.println(eufrasio.padre.gatos[0]+"\n"+ pepe.madre.perros[0]+"\n");
		System.out.println(pepe);
	}

}
