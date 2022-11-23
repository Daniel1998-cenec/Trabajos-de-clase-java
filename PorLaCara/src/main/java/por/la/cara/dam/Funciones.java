package por.la.cara.dam;

public class Funciones {
	public static String pintaTrozoCara (String trozo, byte nVeces){
		String ret="";
		 for (byte i = 0; i < nVeces; i++) {
			ret+=trozo;
		}
		return ret;
	}
	public static String PintaCara (String trozos, char reemplazo) {
		trozos=trozos.replace('o', reemplazo );
		return trozos;
	}
}
//Haz una funcion q devuelva un string y reciba por argumentos un string llamado trozos
//y un char llamado reemplazo. DEntro de la funcion usa la funcion replace para cambiar todos los 'o'. que 
//haya en el string trozos por el char reemplazo
//EJ.Si llamo a funciones. reemplazar ("(|o o|)", 'x')
//Que me devuelva el string "(|x x|)"