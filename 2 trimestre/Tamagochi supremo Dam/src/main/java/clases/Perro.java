package clases;

import enumeration.Especies;

public class Perro extends Tamagotchi {

	private Byte paseo;

	public Perro(String nombre, Float edad, Especies especie) {
		super(nombre, edad, especie);
		this.paseo = 50;
	}

	public Byte getPaseo() {
		return paseo;
	}

	public void setPaseo(Byte paseo) {
		this.paseo = paseo;
	}

	public void pasear() {
		
	}
	
	public String toString() {
		return "\n\tPaseo: " + paseo;
	}
	
	
}
