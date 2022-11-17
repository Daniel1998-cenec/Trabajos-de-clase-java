package prueba.funcion.definitiva.dam;

import java.util.Random;

public class Funcione2 {
	public static void funcionPrueba () {
		System.out.println("Hola desde la función");
	}
	/*public static int numeroAleatorio() {
		Random rand=new Random();
		int aleatorio=rand.nextInt(11);
		return aleatorio;
		}*/
		public static int numeroAleatorio(int limite) {
			Random rand=new Random();
			int aleatorio=rand.nextInt(limite);
			return aleatorio;
		
	}
}
