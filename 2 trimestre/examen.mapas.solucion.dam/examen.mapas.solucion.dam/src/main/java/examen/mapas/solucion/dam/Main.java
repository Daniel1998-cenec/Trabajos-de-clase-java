package examen.mapas.solucion.dam;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		byte filas=-1;
		byte columnas=-1;
		for(byte i=0;i<args.length;i++) {
			if(args[i].equals("-filas")) {
				filas=Byte.parseByte(args[i+1]);
			}
			if(args[i].equals("-columnas")) {
				columnas=Byte.parseByte(args[i+1]);
			}
		}
		if(filas<10||filas>127) {
			filas=(byte)Funciones.pideNumero("Dime número de filas (10-127)",(byte)10,(byte)127);
		}
		if(columnas<10||columnas>127) {
			columnas=(byte)Funciones.pideNumero("Dime número de columnas (10-127)",(byte)10,(byte)127);
		}
		char[][] mapa=Funciones.matrizDeAgua(filas, columnas);
		short nContinentes=
		Funciones.pideNumero("Dime el nº Continentes (1-"+(filas*columnas)+")",
				(byte)1,(short)(filas*columnas));
		Funciones.ponerTerreno(mapa, nContinentes);
		System.out.println(Funciones.imprimeMatriz(mapa));
		byte extensionMaxima=(byte)Funciones.pideNumero(
				"Dime la extensión máxima de los continentes (2-5)",(byte)2,(byte)5);
		for(byte i=0;i<extensionMaxima;i++) {
			Funciones.extenderTerreno(mapa);
		}
		
		System.out.println(Funciones.imprimeMatriz(mapa));
	}
}
