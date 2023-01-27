package Trabajo.extra.subir.nota.dam;

public class FuncionesMatrices3D {
	
	public static String[][][] generaTablero(byte size) {
		String[][][] tablero = new String[size][size][size];
		for (byte x = 0; x < size; x++) {
			for (byte  y= 0 ; y < size ; y++) {
				for(byte z = 0 ; z < size ; z++) {
					tablero[x][y][z] = "🏻";
				} // for
			} // for
		} // for
		return tablero;
	} // funcion
}
