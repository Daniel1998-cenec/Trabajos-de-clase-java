package clases;

import enumeration.Especies;

public class Gato extends Tamagotchi {
	
	private Byte causarCaos;

	public Gato(String nombre, Float edad, Especies especie, Byte hambre, Byte sueño, Byte diversion, Byte estres,
			Byte causarCaos) {
		super(nombre, edad, especie, hambre, sueño, diversion, estres);
		this.causarCaos = causarCaos;
	}

	public Byte getCausarCaos() {
		return causarCaos;
	}

	public void setCausarCaos(Byte causarCaos) {
		this.causarCaos = causarCaos;
	}

	//método
	
	public void causarCaos() {
		
	}
	public String toString() {
		return "\n\tCausarCaos: " + causarCaos;
	}
	
	
}
