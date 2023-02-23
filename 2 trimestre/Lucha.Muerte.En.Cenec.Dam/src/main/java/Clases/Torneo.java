package Clases;

import java.util.Arrays;

import Clases.Torneo;

public class Torneo extends ElementoConNombre {

	private Ronda[] ronda[];

	public Torneo(String nombre, Ronda[][] ronda) {
		super(nombre);
		this.ronda = ronda;
	}

	public Ronda[][] getRonda() {
		return ronda;
	}

	public void setRonda(Ronda[][] ronda) {
		this.ronda = ronda;
	}
	
	//Metodo
	
	public void jugar() {
	}

	public String toString() {
		return super.toString()+"ronda=" + Arrays.toString(ronda);
	}
	
	
}
