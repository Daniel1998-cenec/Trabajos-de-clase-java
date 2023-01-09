package tercer.examen.programacion.dam;

import java.util.Scanner;
/**
 * En este proyecto se debería haber "realizado" una simulacion de resultados de una competicion de ciclista ...
 * @author Daniel Cesar Vargas Holguin
 *
 */
public class Principal {
/**
 * Este es el main principal donde se "debería" haber realizado el proyecto de la competicion de ciclista...
 * @param args no se usa "por ahora"
 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
			System.out.println("Dime el nombre de la competicion");
			String vuelta=sc.nextLine();
			
			System.out.print(("" + vuelta.charAt(0)).toUpperCase());

			for (byte i = 1; i < vuelta.length(); i++) {
				System.out.print((""+vuelta.charAt(i)).toLowerCase());
			}
			System.out.println();
	}

}
