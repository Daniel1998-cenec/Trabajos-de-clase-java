package nuevo.ejercicio.recursividad.dam;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// funciones.imprimeDivisores(2, 8904);

		/*int posibleDivisor = 2;
		int leBuscoDivisores = 8094;

		do {
			
			if (leBuscoDivisores % posibleDivisor == 0) {
				System.out.println(posibleDivisor + " es divisor de " + leBuscoDivisores);
			}
			posibleDivisor++;
		} while (posibleDivisor <= leBuscoDivisores / 2);
	*/
	
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduce un texto");
		String texto=sc.nextLine();
		System.out.println("Y ahora una letra para buscarla en el texto");
		char letra=sc.nextLine().charAt(0);
		
		byte contador=0;
		for(short i=0;i<texto.length();i++) {
			if(texto.charAt(i)==letra) {
				contador++;
			}
		}
		System.out.println(letra+" aparece "+ contador+" veces.");
	}
	

}
