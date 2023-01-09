package pruebas.casting;

public class pruebacasting {

	public static void main(String[] args) {
		//Casting es prometerle al programa que va a salir bien. (promesa)
		
		//Casting lo puedes usar para convertir una variable int en short.
		int añoNacimiento = 2005;
		short aNBueno =(short) añoNacimiento;
		
		//Casting lo puedes usar tambien para convertir un numero int en char.
		int numero = 9684289;
		System.out.println((char) numero);
		
		//Casting tambn lo puede usar para float y convertilo en int.
		float altura = 1.7f;
		int mitadAltura = (int) (altura / 2 * 100); //usas 100 para quitar los decimales y aproximarlo más al resultado.
		System.out.println(mitadAltura);
		// convierte los decimales en numero entero
		
		//Casting tambn puede dar numero a char (byte) y meterlo dentro de una operacion, te puede dar un numero 
		char letraInicial = 'c';
		byte letraMandada = (byte) (letraInicial / 2 * 1.5f + 7);
		//o una letra dependiendo como lo realizas.
		System.out.println (letraMandada);
		System.out.println((char) (letraMandada * 2 / 1.5 - 7));
	
		//le estas prometiendo que el resultado va a caber dentro de un byte
		byte numero1=10;
		numero1=(byte)(numero1+4); //Esto es un casting
		System.out.println(numero1);
		
		//le estas prometiendo que el resultado va a caber en un short.
		short n2=300+1000;
		n2=(short)(numero1+3000);
		
		int n3 = 2100000000;
		n3 = n3 + 50000000;
		System.out.println(n3);
		
		//le estas prometido que la variable l1 va a caber en un byte.
		char l1='?';
		byte letra = (byte)l1;
		System.out.println(letra);

		

		
		
	}

}
