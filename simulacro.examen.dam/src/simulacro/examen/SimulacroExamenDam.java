package simulacro.examen;

import java.util.Scanner;

public class SimulacroExamenDam {

	public static void main(String[] args) {
		//-Pida tu nombre, y lo almacene en una variable de tipo adecuado
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime tu nombre");
		String nombre=sc.nextLine();
		
		//-Pida tu año de nacimiento y lo almacene en una variable de tipo adecuado
		
		System.out.println("Dime tu año de nacimiento");
		short añoNacimiento=Short.parseShort(sc.nextLine());
		
		//-Pida tu peso, expresado en Kg, con decimales, y lo almacene en una variable de tipo adecuado
		System.out.println("Dime cuanto pesas");
		float pesoKg=Float.parseFloat(sc.nextLine());
		
		//Pido por consola
		System.out.println("¡Hola "+nombre+" si le he puesto "+nombre+" !");
		byte añoQueHaPasado=(byte) (2020-añoNacimiento);
		System.out.println("Han pasado "+añoQueHaPasado+" años" );
		short añoQueCumplire=(short) (añoNacimiento+85);
		System.out.println("Cumplire 85 años en el "+añoQueCumplire);
		float pesoJupiter=pesoKg*24.79f;
		float pesoVenus=pesoKg*8.87f;
		float pesoUrano=pesoKg*8.69f;
		float pesoMarte=pesoKg*3.71f;
		float pesoMercurio=pesoKg*3.7f;
		float pesoSaturno=pesoKg*10.44f;
		float pesoNepturno=pesoKg*11.15f;
		float pesoLuna=pesoKg*1.62f;
		System.out.println("Mi peso en los diferentes paises serian:\n"
				+ "t1 - Mi peso en Jupiter es "+pesoJupiter+" kg\n"
				+ "t2 - Mi peso en Venus es "+pesoVenus+" kg\n"
				+ "t3 - Mi peso en Urano es "+pesoUrano+" kg\n"
				+ "t4 - Mi peso en marte es "+pesoMarte+" kg\n"
				+ "t5 - Mi peso en Mercurio es "+pesoMercurio+" kg\n"
				+ "t6 - Mi peso en Saturno es "+pesoSaturno+" kg\n"
				+ "t7 - Mi peso en Nepturno es "+pesoNepturno+" kg\n"
				+ "t8 - Mi peso en la Luna es "+pesoLuna+" kg\n");
		boolean diran=(pesoMercurio+pesoVenus>pesoMarte || pesoJupiter>pesoKg+pesoMarte);
		System.out.println("Es"+diran);
	}

}
