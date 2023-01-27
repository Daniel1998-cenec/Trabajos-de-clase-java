package Trabajo.extra.subir.nota.dam;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//26/01/2023
		Scanner sc=new Scanner(System.in);
		String nombreJugador = null;
		char generoJugador = ' ';
		for (byte i = 0; i < args.length; i++) {
			if (args[i].equals("-g")) {
				generoJugador = args[i + 1].charAt(0);
			} // if
			if (args[i].equals("-n")) {
				nombreJugador = args[i + 1];
			} // if
		} // for
		
		if (generoJugador != 'm' && generoJugador != 'f' && generoJugador != 'n') {
		//Mete estas dos líneas en una funcion recursiva pideGenero
		//Que no reciba argumentos y devuelve un char. En su interior
		//Hará estás dos líneas, y si el usuario no ha puesto m, f o n 
		//La función se vuelve a llamar a si misma cuantas veces sea 
		//Necesario hasta que de uno de esos valores.
		/*System.out.println("Dime el género de tu jugador (m/f/n)");
		char generoJugadores=sc.nextLine().charAt(0);*/
	
		//Hacer que si en argumentos de programa está -g, el género sea el argumento
		//que hay después de-g, siempre que sea m,f o n. Si es alguno de ellos, 
		//asignar el que viene de argumentos y no pedirlo por teclado.
		//Si está el argumento de programa -n, lo que haya en el siguiente argumento
		//se coge como nombre, y ya no se pide por teclado.
		
		generoJugador=funciones.darGenero();
		}
		if (nombreJugador == null) {
		System.out.println("Dime el nombre de tu personaje");
		}
		nombreJugador=sc.nextLine();
		
		// Hacer un menú aquí en el main que te dé 3 opciones 
			//1- jugar en 1D
		    //2- Jugar en 2D
		    //3- Jugar en 3D
		//Que te pida el numero de opcion las veces que sea necesario hasta 
		//se le diga 1, 2 o 3. Guarda el resultado de opción que el jugador
		//en una variable.
		byte opcion;
		do {
			System.out.println("Elige una opcion\n\t1- jugar en 1D\n\t2- Jugar en 2D\n\t3- Jugar en 3D");
			opcion=Byte.parseByte(sc.nextLine());
		}while(opcion!=1&&opcion!=2&&opcion!=3);
		
		switch(opcion) {
		case 1:
			funciones.jugar1D(nombreJugador, generoJugador);
			break;
		case 2:
			funciones.jugar2D(nombreJugador, generoJugador);
			break;
		case 3:
			funciones.jugar3D(nombreJugador, generoJugador);
			break;
		}
		
	}

}
