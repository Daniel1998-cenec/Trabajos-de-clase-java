package Clases;

import java.util.Arrays;
import java.util.ArrayList;
public class Ronda extends ElementoConNombre {

	private ArrayList<Combate> combates;
	
	//1Forma
	public Ronda(String nombre, ArrayList<Combate> combates) {
		super(nombre);
		this.combates = combates;
	}
	//2Forma
	public Ronda(String nombre) {
		super(nombre);
		this.combates = new ArrayList<Combate>();
	}
	
	public ArrayList<Combate> getCombates() {
		return combates;
	}

	public void setCombates(ArrayList<Combate> combates) {
		this.combates = combates;
	}

	@Override
	public String toString() {
		return super.toString()+"\tCombates=" + combates;
	}

	
	
	
}
