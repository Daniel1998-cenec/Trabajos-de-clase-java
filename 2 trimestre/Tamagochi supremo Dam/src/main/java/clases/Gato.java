package clases;

import enumeration.Especies;

public class Gato extends Tamagotchi {

	private Byte causarCaos;

	public Gato(String nombre, Especies especie) {
		super(nombre, especie);
		this.causarCaos = 50;
	}

	public Byte getCausarCaos() {
		return causarCaos;
	}

	public void setCausarCaos(Byte causarCaos) {
		if (causarCaos < 0) {
			this.causarCaos = 0;
		} else if (causarCaos > 100) {
			this.causarCaos = 100;
		} else {
			this.causarCaos = causarCaos;
		}
	}

	// método

	public void causarCaos() {
		this.setCausarCaos((byte) (this.getCausarCaos() - 10));
	}

	
	public boolean estaVivo() {
		if (this.getHambre() >= 100 || this.getSueño() >= 100 || this.getDiversion() >= 0 || this.getEstres() >= 100
				|| this.getEdad() >= 30 || this.getCausarCaos() >= 0) {
			return false;
		} else {
			return true;
		}
	}

	public String toString() {
		return super.toString() + "\n\t CausarCaos: " + causarCaos;
	}

}
