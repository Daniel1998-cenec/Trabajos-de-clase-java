package simulacro.examen.dam1;

import java.util.Scanner;

public class SimulacroExamen1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
				
				float pesoJupiter=pesoKg*2.52f;
				float pesoVenus=pesoKg*0.9f;
				float pesoUrano=pesoKg*0.87f;
				float pesoMarte=pesoKg*0.38f;
				float pesoMercurio=pesoKg*0.38f;
				float pesoSaturno=pesoKg*1.06f;
				float pesoNeptuno=pesoKg*0.14f;
				
				System.out.println("Mi peso en los diferentes planetas serian:\n"
						+ "\t1 - Mi peso en Jupiter es "+pesoJupiter+" kg\n"
						+ "\t2 - Mi peso en Venus es "+pesoVenus+" kg\n"
						+ "\t3 - Mi peso en Urano es "+pesoUrano+" kg\n"
						+ "\t4 - Mi peso en marte es "+pesoMarte+" kg\n"
						+ "\t5 - Mi peso en Mercurio es "+pesoMercurio+" kg\n"
						+ "\t6 - Mi peso en Saturno es "+pesoSaturno+" kg\n"
						+ "\t7 - Mi peso en Nepturno es "+pesoNeptuno+" kg\n"
						+ "\t8 - Mi peso en la Tierra es "+pesoKg+" kg\n");
				
				System.out.println(pesoMercurio+pesoVenus>pesoMarte || pesoJupiter>pesoKg+pesoMarte);
	}

}
