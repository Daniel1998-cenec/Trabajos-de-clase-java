package pilla.al.perro.dam;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\\\\||~~ataque de la pelona~~||//");
		/*
		 * Primero pedimos cuantas personas quiero matar, el juego acaba cuando se
		 * alcance el objetivo
		 */
		System.out.println("¿Cuantas almas quieres hacer que abandonen este mundo hoy?");
		byte objetivoMuerte = Byte.parseByte(sc.nextLine());
		byte muerteConseguida = 0;
		/*
		 * Mido el nº turnos para medir cómo de bien lo hace el jugador. Cuanto menos
		 * tarde en matar a todo el mundo, mejor.
		 */
		int nTurno = 0;
		/*
		 * Declaro cuales van a ser las teclas de movimiento que más tarde seran
		 * personalizables
		 */
		char teclaIzda = 'a';
		char teclaDcha = 'd';
		/*
		 * Pido el tamaño del array, maximo de posiciones para moverse
		 */
		byte tamanio = Funciones.pideNumerosEntre("Elige un tamaño del tablero: (5-15)", (byte) 5, (byte) 15);
		/*
		 * Creo el tablero, y coloco aleatoriamente a la muerte (nuestro personaje) y el
		 * primer candidato a fiambre ☯.
		 */
		char[] tablero = Funciones.creaTablero(tamanio);
		byte posPelona = Funciones.colocaAleatoriamente(tablero, '☠');
		byte posPersona = Funciones.colocaAleatoriamente(tablero, '☯');
		System.out.println(Funciones.imprimeArrayBonico(tablero));
		/*
		 * Bucle de juego, que acaba cuando mate a todos los yinyang que me haya puesto
		 * como objetivo
		 */
		for (nTurno = 0; muerteConseguida < objetivoMuerte; nTurno++) {
			/*
			 * Primera parte del bucle de juego: Pedir entradas
			 */
			System.out.println("¿Donde te quieres mover?(Izquierda - " + teclaIzda + "/ Derecha - " + teclaDcha + " )");
			char teclaPulsada = sc.nextLine().charAt(0);
			// Segunda parte del bucle de juego: Mover y calcular consecuencias
			// Primero, antes de hacer el cambio borro al personaje de su sitio
			
			/*
			 * objetivo ejercicio 19 de enero:
			 * Todo lo que está en este ámbito, trasladarlo
			 * a una funcion, llamada moverElemento, devolverá la nueva posición del
			 * elemento tras moverlo. Por argumentos va a recibir el tablero, el char con el
			 * símbolo que va a mover, -1 izquierda y 1 derecha y la posicion actual del símbolo a mover Por ejemplo, si
			 * queremos que la pelona se mueva a la derecha, la llamada a la funcion desde
			 * el main debería ser: posPelona=Funciones.moverElemento(tablero,'☠',1 posPelona);
			 */
			{
				tablero[posPelona] = '_';
				// En segundo lugar, cambio la posicion de la pelona
				if (teclaPulsada == teclaIzda) {
					if (posPelona != 0) {
						posPelona--;
					} else {// Tratamiento especial para el caso extremo
						posPelona = (byte) (tablero.length - 1);
					}
				}
				if (teclaPulsada == teclaDcha) {
					if (posPelona != tablero.length - 1) {
						posPelona++;
					} else {// Tratamiento especial para el caso extremo
						posPelona = 0;
					}

				}
				// Por último, pinto a la pelona en su nueva posición
				tablero[posPelona] = '☠';
			}
			/*
			 * Si la posicion de la pelona es la misma que la del yinyang, cuento una muerte
			 */
			if (posPelona == posPersona) {
				muerteConseguida++;
				if (muerteConseguida == objetivoMuerte) {
					break;
				}
				posPersona = Funciones.colocaAleatoriamente(tablero, '☯');
			}
			// Tercera parte del bucle del juego: Dibujar sieguiente frame
			System.out.println("Muertes conseguidas: " + muerteConseguida);
			System.out.println(Funciones.imprimeArrayBonico(tablero));
		}
		// Final de partida, imprimir resumen
		System.out.println("☗☗☗☗☗☗☗☗ wuahahaahahahaha ☗☗☗☗☗☗☗☗☗");
		System.out.println("Has cosechado " + muerteConseguida + "  almas.. ");
		System.out.println("Has tardado " + nTurno + " turnos, en un tablero de tamaño " + tablero.length);
	}

}
