package nuevo.ejercicio.recursividad.dam;

public class Principal {

	public static void main(String[] args) {
		// funciones.imprimeDivisores(2, 8904);

		int posibleDivisor = 2;
		int leBuscoDivisores = 8094;

		do {
			
			if (leBuscoDivisores % posibleDivisor == 0) {
				System.out.println(posibleDivisor + " es divisor de " + leBuscoDivisores);
			}
			posibleDivisor++;
		} while (posibleDivisor <= leBuscoDivisores / 2);

	}

}
