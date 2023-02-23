package Clases;

import java.util.Arrays;

public class Ronda extends ElementoConNombre {

	private Combate[] combates;

	public Ronda(String nombre, Combate[] combates) {
		super(nombre);
		this.combates = combates;
	}

	public Combate[] getCombates() {
		return combates;
	}

	public void setCombates(Combate[] combates) {
		this.combates = combates;
	}
	
	//Método
	
	public void jugar() {
	}

	public String toString() {
		return super.toString()+"combates=" + Arrays.toString(combates);
	}
	
	
}
