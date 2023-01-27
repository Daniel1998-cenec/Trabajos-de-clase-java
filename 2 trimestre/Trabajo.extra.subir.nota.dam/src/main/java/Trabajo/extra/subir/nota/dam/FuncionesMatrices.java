package Trabajo.extra.subir.nota.dam;

public class FuncionesMatrices {
	
	public static String[][] generaTablero(byte size) {
		String[][] tablero = new String[size][size];
		for (byte x = 0; x < size; x++) {
			for (byte y = 0 ; y < size ; y++) {
				tablero[x][y] = "🏻";
			} // for
		} // for
		return tablero;
	} // funcion
}
