package prueba.funcion.definitiva.dam;

import java.util.Scanner;
/**
 * Clase principal que contiene el main del programa
 * @author empe
 *
 */
public class Funciones {
/**
 * Método principal del programa, pide un número y te dice si es primo o no.
 * @param args sin uso
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime un número, puede ser muy grande, te digo ");
		long num=Long.parseLong(sc.nextLine());
		if (Funcione2.esPrimo(num)) {
			System.out.println("Es un numero primo");
			}else {
				System.out.println("No es un número primo");
			}
	}
	/*{
		System.out.println("Antes de la funcion");
		Funcione2.funcionPrueba();
		System.out.println("Después de la función");
		System.out.println(Funcione2.numeroAleatorio((byte)60,(byte)80));
		System.out.println(Funcione2.numeroAleatorio((byte)10,(byte)0));
		
		
	}*/
	
	
}
