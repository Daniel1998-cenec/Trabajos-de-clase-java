package clases;

import enumeration.Especies;

public class Gato extends Tamagotchi {
	
	private Byte causarCaos;

	public Gato(String nombre, Float edad, Especies especie) {
		super(nombre, edad, especie);
		this.causarCaos = 50;
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
