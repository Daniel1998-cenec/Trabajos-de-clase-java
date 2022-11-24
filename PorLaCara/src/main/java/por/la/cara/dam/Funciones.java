package por.la.cara.dam;

import java.util.Random;

public class Funciones {
	public static String pintaTrozoCara(String trozo, byte nVeces) {
		String ret = "";
		for (byte i = 0; i < nVeces; i++) {
			if (trozo.equals("pelo")) {
				ret += Funciones.peloAleatorio();
			} else {
				ret += trozo;
			}
		}
		return ret;
	}

	public static String cambiaCaracter(String trozos, char original, char reemplazo) {
		return trozos.replace(original, reemplazo);
	}

	public static String peloAleatorio() {

		Random r = new Random();
		switch (r.nextInt(4)) {
		case 0:
			return " /'''\\ ";

		case 1:
			return " /\\_/\\ ";

		case 2:
			return " /@@@\\ ";

		case 3:
			return " /www\\ ";
		}
		return null;
	}
	
	public static String nombreAleatorio() {
		
	Random r=new Random();
	switch(r.nextInt(10)) {
	case 0:
		return "Ambrosio";
	case 1:
		return "Cermuzo";
	case 2:
		return "Papadopoulous";
	case 3:
		return "Eustaquio";
	case 4:
		return "Juan";
	case 5:
		return "Gaspar";
	case 6:
		return "Ali";
	case 7:
		return "esternocleidomastoideo";
	case 8:
		return "Gustavo";
	case 9:
		return "NiIdea";
	
	}
	return null;
	}
}
//Haz una funcion q devuelva un string y reciba por argumentos un string llamado trozos
//y un char llamado reemplazo. DEntro de la funcion usa la funcion replace para cambiar todos los 'o'. que 
//haya en el string trozos por el char reemplazo
//EJ.Si llamo a funciones. reemplazar ("(|o o|)", 'x')
//Que me devuelva el string "(|x x|)"