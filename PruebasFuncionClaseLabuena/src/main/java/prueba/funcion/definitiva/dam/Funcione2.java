package prueba.funcion.definitiva.dam;

import java.util.Random;

/**
 * Clase con funciones auxiliares para el ejemplo
 * de uso funciones. Tenemos varias funciones matemáticas como dos que generan aleatorios,
 * y que comprueban si un número es primo. Se irán añadiendo más en el futuro.
 * @author Empe
 * @author Max
 * @version 17
 * @since 0.3b
 *
 */
public class Funcione2 {
	/**
	 * funcion inicial de prueba, que solamente hace un sisout que dice hola
	 */
	
	public static void funcionPrueba () {
		System.out.println("Hola desde la función");
	}
	/*public static int numeroAleatorio() {
		Random rand=new Random();
		int aleatorio=rand.nextInt(11);
		return aleatorio;
		}*/
/**
 * funcion que devuelve un número aleatorio entre 0 y el valor límite.
 * El valor de límite tiene que ser 127 como mucho.
 * @param limite número máximo(no incluído) que saldrá aleatoriamente. El mínimo posible es 0.
 * @return numero entero aleatorio entre 0(incluido) y límite (no incluido)
 */
		public static byte numeroAleatorio(byte limite) {
			Random rand=new Random();
			int aleatorio=(byte)rand.nextInt(limite);
			return (byte)aleatorio;
		}
		
		/**
		 * funcion que devuelve un número aleatorio entre el valor inferior y el valor límite.
		 * El valor de límite tiene que ser 127 como mucho.
		 * El valor de inferior siempre tiene que ser menor al de límite.
		 * @param inferior número mínimo (incluído) que podría salir aleatoriamente.
		 * @param límite numero máximo (no incluido) que podría salir aleatoriamente.
		 * @return número aleatorio entre inferior (incluido) y límite (no incluido)
		 */
		
		public static int numeroAleatorio(byte inferior,byte limite) {
			Random rand=new Random();
			int aleatorio=rand.nextInt(inferior,limite);
			return aleatorio;	
	}
		/**
		 * funcion quedado un numero long que dice si es primo o no 
		 * @param numero numero long que se comprobara si es primo, false si  no lo es
		 * @return true si el número es primo, false si no lo es
		 */
		
		public static boolean esPrimo(long numero) {
			for (long i=2;i<=numero/2;i++) {
				if(numero%i==0) {
					//No es número primo
					return false;
				}
			}
			return true;
		}
}
