package prueba.matrices.dam;

import java.util.Scanner;

public class Principal {
//23/01/2023
	/**
	 * En el main es donde se va a crear la sopa de letras. 
	 * Autor: Daniel Cesar Vargas Holguin.
	 * @param args es un array de string que no está en uso.
	 */
	public static void main(String[] args) {
		/*
		 * byte num=5; byte[] array= {4,3,2}; byte[][] matriz={{7,8,9},{10,11,12}};
		 * //byte new[3][2]; matriz [2][0]=7; for(byte i=0;i<matriz.length;i++) {
		 * //System.out.println(matriz[i]); for(byte j=0;j<matriz[i].length;j++) {
		 * System.out.print(matriz[i][j]+"\t"); } System.out.println(); } byte[][][]
		 * matriz2= {{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}},{{13,14,15},{16,17,18}}};
		 * matriz2 [1][1][2]=3;
		 * 
		 * for(byte i=0;i<matriz2.length;i++) {
		 * System.out.println("Profundidad "+i+" ----------------"); for(byte
		 * j=0;j<matriz2[i].length;j++) { for(byte k=0;k<matriz2[i][j].length;k++) {
		 * System.out.print(matriz2[i][j][k]+"\t"); } System.out.println(); } }
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime de cuántas filas quieres la sopa de letras");
		byte nfilas = Byte.parseByte(sc.nextLine());
		System.out.println("Dime cuántas columnas quieres que tenga");
		byte nColumnas = Byte.parseByte(sc.nextLine());
		char[][] matriz = Funcion.creaSopa(nfilas, nColumnas);
		boolean[][] palabraAqui = new boolean[matriz.length][matriz[0].length];
		System.out.println("Dime cuántas palabras quieres insertar");
		byte nPalabras = Byte.parseByte(sc.nextLine());
		
		
		
		for (byte i = 0; i < nPalabras; i++) {
			boolean pudeInsertar;

			do {
				System.out.println("Introduce la palabra a insertar en la matriz");
				String palabra = sc.nextLine();
				System.out.println("Dime la fila donde insertarás la palabra");
				byte fila = Byte.parseByte(sc.nextLine());
				System.out.println("Dime la columna donde insertarás la palabra");
				byte columna = Byte.parseByte(sc.nextLine());
				System.out.println("Dime la direccion:\n"
						+ "\t0 - Si vale cero, la palabra se insertará en horizontal hacia adelante\n"
						+ "\t1 - Si vale uno, la palabra se insertará en horizontal hacia atrás\n"
						+ "\t2 - Si vale dos, la palabra se insertará en vertical hacia arriba\n"
						+ "\t3 - Si vale tres, la palabra se insertará en vertical hacia abajo\n"
						+ "\t4 - Si vale cuatro, la palabra se insertará en diagonal hacia arriba a la derecha\n"
						+ "\t5 - Si vale cinco, la palabra se insertará en diagonal hacia arriba a la izquierda\n"
						+ "\t6 - Si vale seis, la palabra se insertará en diagonal hacia abajo a la derecha\n"
						+ "\t7 - Si vale siete, la palabra se insertará en diagonal hacia abajo a la izquierda\n");
				byte direccion = Byte.parseByte(sc.nextLine());
				pudeInsertar = Funcion.insertarPalabra(matriz, palabra, fila, columna, direccion,palabraAqui);
				if (pudeInsertar) {
					System.out.println("Se insertó con éxito");
				} else {
					System.out.println("no se puede insertar esa palabra ahí: no cabe.");
				}
			} while (!pudeInsertar);
		}
		System.out.println(Funcion.imprimeMatriz(matriz));

		//for que recorre el array de palabraAqui que imprime cada posicion es false es f 
		//si es true es t.
		
		/*for (byte i = 0; i < palabraAqui.length; i++) {
			for (byte j = 0; j < palabraAqui.length; j++) {
				if (palabraAqui[i][j] == false) {
					System.out.print("f ");
				} else {
					System.out.print("t ");
				}	
			}
			System.out.println();
		}*/
		
	}
}
