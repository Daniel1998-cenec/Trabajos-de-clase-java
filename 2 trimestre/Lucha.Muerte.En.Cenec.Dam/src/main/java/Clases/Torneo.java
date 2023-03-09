package Clases;

import java.util.Arrays;
import java.util.ArrayList;
import Clases.Torneo;

public class Torneo extends ElementoConNombre {

	private ArrayList<Ronda> ronda;
	
	public Torneo(String nombre, ArrayList<Ronda> ronda) {
		super(nombre);
		this.ronda = ronda;
	}

	public ArrayList<Ronda> getRonda() {
		return ronda;
	}



	public void setRonda(ArrayList<Ronda> ronda) {
		this.ronda = ronda;
	}


	public void jugar() {
	}

	public String toString() {
		return super.toString()+"\tRonda=" + ronda;
	}
	
}
