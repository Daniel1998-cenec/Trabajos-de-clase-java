package com.dvargas.algunos.juegos.matematicos.dam;

import java.util.Scanner;

public class AlgunosJuegosMatematicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Empiezo el ejercicio 1
		//Yo sinceramente nose porque uso "integer.parseInt"
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame un número");
		int numero=Integer.parseInt(sc.nextLine()); 
		int resultado1=(numero*3+6)/3-numero;
		
		System.out.println(resultado1);
		
		boolean resultado=resultado1>=2 || resultado1<2;
		
		System.out.println(resultado);
		
		//Empiezo el ejercicio 2
		
		System.out.println("Dime tu año de nacimiento");
		short añoNacimiento=Short.parseShort(sc.nextLine());
		byte n=30;
		boolean resultadoAño=añoNacimiento%2==0 || n<añoNacimiento;
		System.out.println(resultadoAño);
		
		//Empiezo el ejercicio 3
		
		System.out.println("Dime tu talla de pie");
		byte tallaPie=Byte.parseByte(sc.nextLine());
		short resultadoTalla=(short) (tallaPie*5);
		short resultadoTalla1=(short) (resultadoTalla+50);
		short resultadoTalla2=(short) (resultadoTalla1*20);
		short resultadoTalla3=(short) (resultadoTalla2+1022);
		short resultadoTalla4=(short) (resultadoTalla3-añoNacimiento);
		System.out.println(resultadoTalla4);
		boolean resultadoGrande=resultadoTalla4/1000>1 
				&& resultadoTalla4/10000<1 && resultadoTalla4/100==tallaPie
				&& resultadoTalla4%100==(2022-añoNacimiento);
		System.out.println(resultadoGrande);
	}

}
