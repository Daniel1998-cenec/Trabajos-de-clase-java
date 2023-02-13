package al.fin.tema5;

import java.util.Random;
import java.util.Scanner;

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
		sputnik.hambre=50;
		sputnik.sueño=50;
		sputnik.aburrimiento=50;
		sputnik.suciedad=50;
		
		elvira.perros=new Perro[] { sputnik };
		
		sputnik.dueño=elvira;
		
		System.out.println(eufrasio.padre.madre.perros[0]);
	}

}
