package Ejercicio.de.los.tipos.de.bucle.Dam;

import java.util.Scanner;

public class TipoDeBucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String repuesta = " ";
		// Le acabo de meter el bucle White
		while (!repuesta.equals("h") && !repuesta.equals("m") && !repuesta.equals("n") && !repuesta.equals("hombre")
				&& !repuesta.equals("mujer")) {
			System.out.println("Escribe h si eres hombre, m si eres mujer y n si eres neutro");
			repuesta = scan.nextLine();
		}

		System.out.println(repuesta);
	}

}
