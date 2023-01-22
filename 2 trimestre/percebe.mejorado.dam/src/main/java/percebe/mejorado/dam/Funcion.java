package percebe.mejorado.dam;
/**
 * 
 * @author 1DAM&&1DAW
 *
 */
public class Funcion {
	/**
	 * Esta funcion realiza la operacion de dibujar tanto el tejado como bloque y la casa.
	 * @param dibujo seria lo que usario quiere que dibuje por ejemplo: "|-----|", "|     |"
	 * @param veces seria las veces que se repetiria el dibujo
	 * @return lo que mandaria al main para que traze el dibujo
	 */
	public static String pintarAltura (String dibujo, byte veces) {
		
		String construido="";
		for (byte i=0; i<veces;i++) {
			construido+=dibujo;
			}
		return construido ;
			}
		
	}