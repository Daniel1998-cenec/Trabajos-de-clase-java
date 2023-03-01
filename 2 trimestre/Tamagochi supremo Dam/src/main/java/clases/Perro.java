package clases;

import enumeration.Especies;

public class Perro extends Tamagotchi {

	private Byte paseo;

	public Perro(String nombre, Especies especie) {
		super(nombre, especie);
		this.paseo = 50;
	}

	public Byte getPaseo() {
		return paseo;
	}

	public void setPaseo(Byte paseo) {
		if(paseo<0) {
			this.paseo=0;
		}else if(paseo>100) {
			this.paseo=100;
		}else {
			this.paseo=paseo;
		}
	}

	public void pasear() {
		
	}
	
	public boolean estaVivo() {
		if (this.getHambre() >= 100 || this.getSueño() >= 100 || this.getDiversion() >= 0 || 
			this.getEstres() >= 100 || this.getEdad() >= 30 || this.getPaseo() >= 0) {
			return false;
		} else {
			return true;
		}
	}

	public String toString() {
		return super.toString()+"\n\t Paseo: " + paseo;
	}
	
	
}
