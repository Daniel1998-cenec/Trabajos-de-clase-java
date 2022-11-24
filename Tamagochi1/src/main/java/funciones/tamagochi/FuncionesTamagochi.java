package funciones.tamagochi;

public class FuncionesTamagochi {
/**
 * Esta funcion lo que realiza es realizar las acciones del tamagochi (menu).
 * 
 * @return String Devuelve las acciones del tamagochi
 */
	public static String imprimirMenu() {
		return "\nElige acción: (Mediante un número)\n" + "\n\t1 - Comer" + "\n\t2 - Dormir" + "\n\t3 - Ducharse"
				+ "\n\t4 - Jugar";
	}
/**
 * Esta funcion lo que hace es dibujar una lápida al tamogochi fallecido.
 * @param nombre Dar nombre al tamagochi
 * @param raza Dar el nombre de la raza del tamagochi
 * @param turnos Enumera los turnos que ha vivido el tamagochi
 * @return String que devuelve la lapida con toda la informacion del tamagochi.
 */
	public static String enterrar(String nombre, String raza, byte turnos) {
		String contadorNombre=nombre+" "+raza;
		String espacioBlanco=" ";
		
			if (contadorNombre.length()<24) {
				byte espaciosQueFaltan=(byte)(24-contadorNombre.length());
				for(byte a=0;a<espaciosQueFaltan/2;a++) {
				espacioBlanco+=" ";
				}
				contadorNombre=espacioBlanco+contadorNombre+espacioBlanco;
			}
		
		String contadorTurnos="vivió "+turnos+" turnos";
		
			if (contadorTurnos.length()<24) {
				byte espaciosFaltan=(byte)(2-contadorTurnos.length());
				for(byte a=0;a<espaciosFaltan/2;a++) {
				espacioBlanco+=" ";
				}
				contadorTurnos=espacioBlanco+contadorTurnos+espacioBlanco;
			}
		
		
		return"         __________________________  \n"
				+ "        |\\_________________________\\ \n"
				+ "        | |          D.E.P         |   \n"                 
				+ "        | |"+contadorNombre+"|\n"       
				+ "        | |   Dimitió de existir   |     \n"       
				+ "        | |"+contadorTurnos+"|\n"
				+ "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
	
	}

}
