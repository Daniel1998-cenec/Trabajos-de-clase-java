package repaso.examen.opcional;

import java.util.Scanner;

public class Principal {
//Ejercicio 7.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texto = "";
		System.out.println("Dame un texto, por favor");
		texto = sc.nextLine();
		System.out.println("Dame dos numeros, por favor");
		byte posicionInicial = Byte.parseByte(sc.nextLine());
		byte posicionFinal = Byte.parseByte(sc.nextLine());

		do {

		} while (posicionInicial < posicionFinal && posicionInicial > texto.length()&&posicionFinal>texto.length());
	}

}
