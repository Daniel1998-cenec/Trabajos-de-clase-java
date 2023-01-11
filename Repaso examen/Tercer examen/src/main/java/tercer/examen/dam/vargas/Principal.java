package tercer.examen.dam.vargas;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 String nombreCompeticion;
		 do {
			 System.out.println("Dime un nombre para la competición");
			 nombreCompeticion = sc.nextLine(); 
		 }while(!nombreCompeticion.startsWith("Vuelta de "));
	}

}
