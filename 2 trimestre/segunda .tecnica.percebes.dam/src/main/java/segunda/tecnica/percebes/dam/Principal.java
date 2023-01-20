package segunda.tecnica.percebes.dam;

import java.util.Scanner;

/**
 * En esta clase es donde realizo el percebe
 * 
 * @author Daniel Cesar Vargas Holguin
 * @version 1
 */
public class Principal {
	/**
	 * En esta funcion es donde realizo el percebe
	 * @param args. El primer argumento indicará el número de plantas. Si está
	 *              puesto debe ser un número positivo mayor a cero. Si no está
	 *              presente, se pedirá por teclado. El segundo argumento indicará
	 *              el número de pisos por planta
	 */
	public static void main(String[] args) {
		// paso 1: Traerse la declaración de todas las variables que puedan coger su
		// valor de argumentos al principio del programa,
		// e inicializarlas a valores absurdos/imposibles.
		// Paso 2: Al principio del programa, rcorrer todos los argumentos, y si 
		// encontramos, el argumento que necesitamos para cambiar el valor a una variable, 
		// se lo cambio. Los míos van a ser -nPlantas y -nPisos 
		byte numeroPlantas=-1;
		byte numeroCasasPorPiso=-1;
		for(byte i=0; i<args.length;i++) {
			if(args[i].equals("-nPlantas")) {
				numeroPlantas=Byte.parseByte(args[i+1]);
			}
			if(args[i].equals("nPisos")) {
				numeroCasasPorPiso=Byte.parseByte(args[i+1]);
			}
		}
		Scanner sc = new Scanner(System.in);
		//paso 3: a la hora de pedirlo por teclado o darle un valor por defecto
		//Compruebo si sigue teniendo el valor absurdo que le puse. Si lo sigue
		//teniendo, lo pido por teclado. Si no,  no lo pido porque significa 
		//que me vino por argumentos
		
		if(numeroPlantas==-1) {
			System.out.println("Dime cuantos bloques quieres");
			 numeroPlantas = Byte.parseByte(sc.nextLine());
		}
		if (numeroCasasPorPiso==-1) {
			System.out.println("Dime cuantos pisos quieres");
			numeroCasasPorPiso = Byte.parseByte(sc.nextLine());
		}
		

		System.out.println("|-----------------------------|\n" + "| 13 Rue del Percebe          |\n"
				+ "|-----------------------------|");
		for (byte c = 0; c < numeroPlantas; c++) {
			System.out.println(Funciones.pintarAltura("|-----|", numeroCasasPorPiso));
			System.out.println(Funciones.pintarAltura("|     |", numeroCasasPorPiso));
			System.out.println(Funciones.pintarAltura("|     |", numeroCasasPorPiso));
		}

	}

}