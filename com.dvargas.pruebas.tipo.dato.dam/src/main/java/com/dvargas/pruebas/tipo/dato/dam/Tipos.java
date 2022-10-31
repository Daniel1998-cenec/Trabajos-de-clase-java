package com.dvargas.pruebas.tipo.dato.dam;

import java.util.Scanner;

public class Tipos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);             
		//esto espera a que yo responda 
		System.out.println("Dime tu nombre");          
		String nombre=sc.nextLine();    
		System.out.println("Te doy la bienvenida");
		System.out.println(nombre);
		
		// la doble barra se usa para comentar y 
		/*se puede usar barra asterisco para comentar un parrafo grande y se cierra con */
		
		
									//TIPOS ENTEROS
		//Los tipos de dato basico empiezan con minuscula excepto String que va con mayuscula.
		
		//byte llega a 127 y -128. Viene bien para la edad de una persona.
		byte numeroPequeño=127;
		
		//short llega a 23767 y -23768. Viene bien para los años.
		short numeroMediano=32767;
		
		//int llega hasta dos mil millones. Cantidades economicas, habitantes de ciudad, pais...
		int numeroGrande=4800000;
		
		//long llega a numeros de locos ya y hay que colocar una l al final del numero.
		//Quizas podriamos usarlo para datos cientificos muy muy grandes.
		long numeraco=99999999999999l;
		
		//LO CORRECTO ES USAR EL TIPO DE DATO CORRECTO YA QUE SI USAMOS EL OTRO NO ES 
		//INCORRECTO PERO OCUPA MUCHO MAS TAMAÑO.
		
												
		
		
									//TIPOS DECIMALES
		
		//float se usa con decimales y se pone el numero con la f. Se puede usar con
		//muchisima cantidad de numeros enteros y de numeros decimales. Float se puede usar 
		//como mas grande que long y ademas acepta los decimales. Redondea numeros gigantes.
		float decimales=11111111111111111.7111111111111111111111f; 
		
		//double se usa para numeracos tocho grandes ya mu locos 
		//o numeros con decimales mas precisos hasta un limite
		double gigante=99999999999999999999999999999999999999999999.999999999999999999999999999;
		
		
									//TIPOS PARA LETRAS
		
		/*va con comillas simples y los símbolos tambien son un character, char. 
		un numero tambien puede ser un char si va con comilla simple. Los byte y los
		char son intercambiables entre si.  Los numeros y las letras son intercambiables por
		su codigo numerico en la tabla UTF8.
		https://www.w3schools.com/charsets/ref_html_utf8.asp */
		char letra='2';
		char letra3='c';
		char letra2='@';
		byte letra4='#';
		byte letrabyte='t';
		short letranumero='ñ'; //usamos short para la ñ porque su numero es mayor de 127.
		short simbolitoguay='☀'; //hay simbolos de emoji tambien en la tabla de UTF8.
		char simbolitoaunmasguay='☹'; //deberia pintar el simbolito
		//los siguientes print daran un numero en vez de una letra o un simbolo
		System.out.println(letrabyte);
		System.out.println(letra4);
		System.out.println(letranumero);
		System.out.println(simbolitoguay);
		System.out.println(simbolitoaunmasguay);
		
		//boolean solo admite true o false. ES EL TIPO DE DATO BASICO MAS USADO EN PROGRAMACION.	
		boolean estaVivo=true; 
		boolean estaVivo2=false;
	}

}
