package pilla.al.perro.dam;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\\\\||~~ataque de la pelona~~||//");
		byte tamanio=Funciones.pideNumerosEntre("Elige un tamaño del tablero: (5-15)",(byte)5,(byte)15);
		char[] tablero=Funciones.creaTablero(tamanio);
		byte posPersona=Funciones.colocaAleatoriamente(tablero, '☯');
		byte posPerro=Funciones.colocaAleatoriamente(tablero, '☠');
		System.out.println(Funciones.imprimeArrayBonico(tablero));
		
	}

}
