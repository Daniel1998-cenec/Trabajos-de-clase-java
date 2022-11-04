package pruebasForDam;

import java.util.Scanner;

public class pruebasForDam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime qué tabla de multiplicador quieres hacer (1-10)");
		byte numero=Byte.parseByte(sc.nextLine());
		for(byte i=0;i<=10;i++) {
			System.out.println(numero+" x "+i+" = "+numero*i);
		}
	}

}
