package prueba.matrices.dam;

import java.util.Scanner;

public class Principal {
//23/01/2023
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
				pudeInsertar = Funcion.insertarPalabra(matriz, palabra, fila, columna);
				if (pudeInsertar) {
					System.out.println("Se insertó con éxito");
				} else {
					System.out.println("no se puede insertar esa palabra ahí: no cabe.");
				}
			} while (!pudeInsertar);
		}
		System.out.println(Funcion.imprimeMatriz(matriz));
	}

}
