package clases;

import enumeration.Especies;

public class Perro extends Tamagotchi {

	private Byte paseo;

	public Perro(String nombre, Float edad, Especies especie, Byte hambre, Byte sueño, Byte diversion, Byte estres,
			Byte paseo) {
		super(nombre, edad, especie, hambre, sueño, diversion, estres);
		this.paseo = paseo;
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
