package pruebas.estructura.seleccion.dam;

import java.util.Scanner;

public class PreubasEstructura {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime tu edad");
		byte edad=Byte.parseByte(sc.nextLine());
		
		if(edad>=18) {
			System.out.println("pues ale,de viernes beber cerveza");
		}else {
			System.out.println("pues ale, de viernes a beber zumitos");
		}
		System.out.println("Vámonos ya");
		
	}
}