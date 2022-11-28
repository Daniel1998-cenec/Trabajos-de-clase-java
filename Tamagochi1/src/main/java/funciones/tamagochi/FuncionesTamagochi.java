package funciones.tamagochi;

import java.util.Random;

public class FuncionesTamagochi {
/**
 * Esta funcion lo que realiza es las acciones del tamagochi (menu).
 * 
 * @return String Devuelve las acciones del tamagochi
 */
	public static String imprimirMenu() {
		return "\nElige acción: (Mediante un número)\n" + "\n\t1 - Comer" + "\n\t2 - Dormir" + "\n\t3 - Ducharse"
				+ "\n\t4 - Jugar";
	}

	/**
	 * Esta funcion lo que hace es meter los contains dentro de la funcion para ahorrar codigo, y asi evitar que me ponga numero cuando pido el nombre
	 * @param cadena donde Guardo todo los contais con el objetivo de ahorrar codigo
	 * @return aqui es lo que pones para luego cuando llames esta funcion devuelva lo que tienes puesto en el return
	 * @deprecated
	 */
	public static boolean tieneNumeros (String cadena) {
		return cadena.contains("1") || cadena.contains("2") || cadena.contains("3") || cadena.contains("4")
				|| cadena.contains("5") || cadena.contains("6") || cadena.contains("7") || cadena.contains("8")
				|| cadena.contains("9") || cadena.contains("0");
	}
	
	/**
	 * Esta funcion lo que hace es dibujar una lápida al tamogochi fallecido.
	 * Bug No se centra las paredes de las lápidas. TODO Buscar solucion de como centrarlo.
	 * @param nombre Dar nombre al tamagochi
	 * @param raza Dar el nombre de la raza del tamagochi
	 * @param turnos Enumera los turnos que ha vivido el tamagochi
	 * @return String que devuelve la lapida con toda la informacion del tamagochi.
	 */
	public static String enterrar(String nombre, String raza, byte turnos) {
		String contadorNombre=nombre+" "+raza;
		String espacioBlanco="";
		String espacioBlanco1="";
		String espacioBlanco3="";
		
		byte espaciosQueFaltan=(byte)(31-contadorNombre.length());
		for(byte a=0;a<espaciosQueFaltan/2;a++) {
		espacioBlanco+=" ";
		}
		contadorNombre=espacioBlanco+contadorNombre+espacioBlanco;
			/*if (espacioBlanco.length()%2==0) {
				espacioBlanco=" ";
			}*/
		String contadorTurnos="vivió "+turnos+" turnos";
		
		byte espaciosFaltan=(byte)(31-contadorTurnos.length());
		for(byte a=0;a<espaciosFaltan/2;a++) {
			espacioBlanco1+=" ";
			}
		contadorTurnos=espacioBlanco1+contadorTurnos+espacioBlanco1;
			
		String opcionMuerte="";
		Random r=new Random();
		switch (r.nextInt(4)) {
		case 0:
			opcionMuerte="Se ha morido";
			break;
		case 1:
			opcionMuerte="Dimitió de existir";
			break;
		case 2 :
			opcionMuerte="La ha espichado";
			break;
		case 3 :
			opcionMuerte="Viaja hacia las estrellas";
			break;
			}
		
		String contadorOpcionMuerte=opcionMuerte;
		byte espaciosFaltado=(byte)(30-contadorOpcionMuerte.length()); 
		
		for(byte a=0;a<espaciosFaltado/2;a++) {
			espacioBlanco3+=" ";
			}
		
		contadorOpcionMuerte=espacioBlanco3+contadorOpcionMuerte+espacioBlanco3;	
		
		return"         _________________________________  \n"
				+ "        |\\________________________________\\ \n"
				+ "        | |           D.E.P               |   \n"                 
				+ "        | |"+contadorNombre+"|\n"       
				+ "        | |"+contadorOpcionMuerte+"|\n"       
				+ "        | |"+contadorTurnos+"|\n"
				+ "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
		
	 
	}

}
