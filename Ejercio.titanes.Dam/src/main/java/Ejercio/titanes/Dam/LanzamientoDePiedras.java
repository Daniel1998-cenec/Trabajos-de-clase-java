package Ejercio.titanes.Dam;

import java.util.Scanner;

public class LanzamientoDePiedras {

	private static final Scanner sc2 = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//La máquina espera a que yo responda
		System.out.println("Dime tu nombre");
		String nombre=sc.nextLine();
		Scanner sc1=new Scanner(System.in);
		System.out.println("¿Cuál es tu rango soldado?");
		String rango=sc1.nextLine();
		System.out.println("Te doy la bienvenida "+nombre+". Vamos a la guerra");
		System.out.println("¿Cuánto soldado te acompaña en la batalla?");
		short nSoldado=Short.parseShort(sc.nextLine());
		/*pero lo que yo no se es como limitar solo a 1000 soldado ya que si lo dejo asi puede poner mas de 1000
		 Damos por hecho de que no nos pasaremos de 1000
		 */
		if(!(nSoldado>=1&&nSoldado<=1000));
		System.out.println("¿Cuánto lanzamiento hará el titán bestia?");
		byte nLanzamientoTitanBestia=Byte.parseByte(sc.nextLine());
		/*Igual me pasa aqui no se limitar solo 10 lanzamientos :(
		Igual aqui, damos por hecho que no nos pasaremos mas de 10 lanzamientos*/
		
		/*Ahora tendría que sacar una variable para poder presentar el resultado anterior en el punto 6? nose, lo q viene a continuacion es intuicion miaXD. 
		 Mentira, me han ayudado ahora creo q lo entiendo + o - */
		short sobrevivientes=(short)(nSoldado/(nLanzamientoTitanBestia*1.25f+3));
		short pSobrevivientes=(short)(sobrevivientes*100f/nSoldado);
		System.out.println("Han sobrevivido "+sobrevivientes+" soldados. El porcentaje de supervivencia sería del "+pSobrevivientes);
		System.out.println("Vistas estas posibilidades de supervivencia,¿crees que tú, "+rango+" - "+nombre+" sobrevivirías? ");
		/*No se como hacer que la máquina me responda con un sí o un no :(. Hasta aquí llegaron mis conocimientos
		 En esta parte me ayudaron dar variable a string y luego q me responda la máquina
		 */
		
		String resultado=sc.nextLine();
		System.out.println(resultado);
		if (resultado.equals("si")) {
			System.out.println(nombre + rango +" bien, has sobrevivido.");			
		} else {System.out.println(nombre + rango + " que pena has no has sobrevivido.");
	}

	}
}
