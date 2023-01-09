 package pruebas.operadores.dam;

import java.util.Scanner;

public class PruebasOperadores {

	public static void main(String[] args) {
		int a=new Integer(3); //igual int a=3;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime un numero");
		byte n1=Byte.parseByte(sc.nextLine());
		n1++; //n1=n1+1;
		++n1;
		
		System.out.println(++n1);
		System.out.println(n1);
		n1--; //n1=n1-1;
		--n1;
		System.out.println(n1--);
		System.out.println(n1);
		
		boolean estoyCansado=false;
		System.out.println(!estoyCansado);
		System.out.println(estoyCansado);
		
		n1=(byte)(n1>>1);
		System.out.println(n1);
		n1=(byte)(n1<<2);
		n1=(byte)(n1/2); //n1>>1;
		
		byte edad=36;
		boolean esMayorDeEdad=edad>=18;
		boolean esMenorDeEdad=edad<18;
		boolean tiene18=edad==18;
		String texto="Hola";
		boolean diceHola=texto.equals("Hola");
		System.out.println(diceHola);
		System.out.println("¿Tiene una edad que no sea 18?"+(edad!=18));
		System.out.println("¿Su edad es un número par?"+ (edad%2==0));
		
		System.out.println("¿Estoy en edad de trabajar?"+ (edad>=18&&edad<=65));
		                                                   
		
	}

}
