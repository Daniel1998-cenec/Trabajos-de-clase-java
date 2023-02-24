package Clases;

import java.util.Random;

public class Guerrero extends Luchador {

	private Escudo escudo;

	public Guerrero(String nombre, Arma arma, Escudo escudo) {
		super(nombre, arma);
		this.escudo = escudo;
	}

	public Escudo getEscudo() {
		return escudo;
	}

	public void setEscudo(Escudo escudo) {
		this.escudo = escudo;
	}

	public String toString() {
		return super.toString()+"\n\tescudo=" + escudo;
	}
	
	public byte defender() {
		Random r=new Random();
		byte dañoBloqueado=(byte) r.nextInt(this.escudo.getProteccion()+1);
		System.out.println(this.getNombre()+" bloquea con su "+this.escudo.getNombre()+
				" "+dañoBloqueado+ "daño recibido.");
		return dañoBloqueado;
	}
}
