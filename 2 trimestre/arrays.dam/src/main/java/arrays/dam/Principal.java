package arrays.dam;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		/*String[] nombres = new String[7];
		String[] apellidos = { "Gutierrez", "Gómez", "Peña", "Centollo", "Buendía", "Furgo" };

		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una posición para ponerle un nombre (0-" + (nombres.length - 1) + "):");
		byte posicion = Byte.parseByte(sc.nextLine());
		System.out.println("Dime un nombre para la posicion " + posicion + ": ");
		if (Funciones.valorPosicion(nombres, posicion, sc.nextLine())) {
			System.out.println("Cambiado correctamente");
		} else {
			System.out.println("no se pudo cambiar el valor");
		}

		for (byte i = 0; i < nombres.length; i++) {
			System.out.println(i + ": " + (nombres[i] != null ? nombres[i].toUpperCase() : "-"));
		}
		//--------------------------------------------------------------------------------------------------------------------------------
		// Ejercicio diario 12/01/23
		// Crea una función llamada intercambio que devuelva un boolean,
		// y reciba tres argumentos-. un array de char, y dos byte llamados
		// p1 y p2.
		// En su interior, los primero que hace es ver si tanto p1 como p2 son
		// posiciones válidas del array.
		// Si alguna no lo es, la funcion devuelve false y no hace nada más
		// Si las dos posiciones válidas, intercambiaría los valores de las posiciones
		// p1 y p2 dentro del array.
		// Te propongo que lo intentes con el siguiente array declarando en el main:
		// char[] letras={'p','e','l','o','t','a'}
		//*--------------
		char[] letras = { 'p', 'e', 'l', 'o', 't', 'a' };
		System.out.println(letras);
		System.out.println(Funciones.intercambio(letras, (byte)2, (byte)3));
		System.out.println(letras);*/
		//---------------------------------------------------------------------------------------------------------------------------------
		System.out.println("Bienvenid@ a este jueg. Te voy a dar unas "+ "letras desordenadas, y me tienes que decir la palabra original:");
		
		char[] palabraComoArray=Funciones.arrayAlAzar();
		char[] original=Funciones.copiaArray(palabraComoArray);
		//voy a hacer 100 intercambios aleatorios de letras
		Random r=new Random();
		for (byte i=0;i<100;i++) {
			byte p1=(byte)r.nextInt(palabraComoArray.length);
			byte p2=(byte)r.nextInt(palabraComoArray.length);
			Funciones.intercambio(palabraComoArray, p1, p2);
		}
		System.out.println(Funciones.imprimeArray(palabraComoArray));
		Scanner sc = new Scanner(System.in);
		String eleccion=sc.nextLine();
		String[] letrasEleccion=eleccion.split("");
		//Para el Lunes 16: 
		// -Usa la función split para separar todas las letras de eleccion entre si
		// -Crea una función public static boolean sonIguales(char[] arri, char[]arr2)
		// Esa función primero compara si los tamaños de arr1 y arr2 son iguales.
		// si no, devuelve false. Si tienen el mismo tamaño, va comparando posición
		// a posición, si el contenido de arr1[i] es igual a arr2[i]. Si alguno no es 
		//igual, devuelve false. Al final de la función, después del for, devuelve true.
		// -Usa la función sonIguales para decir al usuario desde el main si lo que 
		// puso en elección es igual al array original.
		
		String frase="me he emparanollao, porque la vida es dura, pero me da igual,"
				+"porque me voy a clase de programación y me deprimo un poco menos."
				+"y por eso no tengo una depresón enorme de verdad";
		String[] resultado=(" "+frase+" ").split("me ");
		System.out.println(resultado.length-1);
	}
}
