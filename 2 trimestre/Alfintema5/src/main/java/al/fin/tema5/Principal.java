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
		
		Sim pepe=new Sim();
		pepe.nombre="Pepe";
		pepe.apellido="Tardo";
		pepe.genero='h';
		pepe.hambre=50;
		pepe.sueño=50;
		pepe.aburrimiento=50;
		pepe.suciedad=50;
		
		Sim eufrasio=new Sim();
		eufrasio.nombre="Eufrasio";
		eufrasio.genero='h';
		eufrasio.hambre=50;
		eufrasio.sueño=50;
		eufrasio.aburrimiento=50;
		eufrasio.suciedad=50;
		
		pepe.comer();
		eufrasio.padre=pepe;
		
		Sim elvira=new Sim();
		elvira.nombre="elvira";
		elvira.apellido="lápida";
		elvira.genero='m';
		elvira.hambre=50;
		elvira.sueño=50;
		elvira.aburrimiento=50;
		elvira.suciedad=50;
		
		pepe.madre=elvira;
		
		Perro sputnik=new Perro();
		sputnik.nombre="sputnik";
		sputnik.genero='h';
		sputnik.raza="Chucho";
		sputnik.pelaje="Multicolor";
		sputnik.hambre=50;
		sputnik.sueño=50;
		sputnik.aburrimiento=50;
		sputnik.suciedad=50;
		
		/**
		 * elvira.perros=new Perro[] { sputnik };
		 */
		elvira.perros=new Perro [1];
		elvira.perros[0]=sputnik;
		sputnik.dueño=elvira;
		
		Gato rubi=new Gato();
		rubi.nombre="rubi";
		rubi.genero='m';
		rubi.raza="Gatuno";
		rubi.hambre=50;
		rubi.sueño=50;
		rubi.aburrimiento=50;
		rubi.suciedad=50;
		rubi.tendenciaAlCaos=50;
		
		pepe.gatos=new Gato [1];
		pepe.gatos[0]=rubi;
		rubi.dueño=pepe;
		
		System.out.println(eufrasio.padre.gatos[0]+"\n"+ pepe.madre.perros[0]+"\n");
		System.out.println(pepe);
	}

}
