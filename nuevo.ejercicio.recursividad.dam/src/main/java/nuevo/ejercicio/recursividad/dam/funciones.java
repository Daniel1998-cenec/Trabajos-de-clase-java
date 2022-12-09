package nuevo.ejercicio.recursividad.dam;

public class Funciones {
	public static void imprimeDivisores(int posibleDivisor, int leBuscoDivisores) {
		if (posibleDivisor <= leBuscoDivisores / 2) {// caso recursivo (iterativo)
			if (leBuscoDivisores % posibleDivisor == 0) {
				System.out.println(posibleDivisor + " es divisor de " + leBuscoDivisores);
			}

			imprimeDivisores(posibleDivisor + 1, leBuscoDivisores);
		} else {

		}
	}

	public static byte cuentraLetras(short i ) {
		
	}

}
