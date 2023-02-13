package primer.examen.segundo.trimestre.dam;

import java.util.Scanner;

/**
 * Este proyecto Vamos a conmemorar la festividad mayor del pueblo de
 * “Villacateto del Secaero” con la siguientes funciones.
 * 
 * @author Emperador
 *
 */
public class principal {
	/**
	 * Este proyecto Vamos a conmemorar la festividad mayor del pueblo de
	 * “Villacateto del Secaero” con la siguientes funciones.
	 * 
	 * @param args se usa.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un tamaño para la matriz");
		byte tamaño = Byte.parseByte(sc.nextLine());
		char[][] escena = funcion.creaMatrizEspacios(tamaño);
		boolean comprobacion = true;
		if (comprobacion) {
			escena = funcion.creaMatrizEspacios(tamaño);
		} else {
			funcion.ponerNubes(escena);
		}

	}

}
