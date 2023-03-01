package clases;

import enumeration.Especies;

public class Tamagotchi extends CosaConNombre {

	private Float edad;
	private Especies especie;
	private Byte hambre;
	private Byte sueño;
	private Byte diversion;
	private Byte estres;

	public Tamagotchi(String nombre, Especies especie) {
		super(nombre);
		this.edad = (float) 0;
		this.especie = especie;
		this.hambre = 50;
		this.sueño = 50;
		this.diversion = 50;
		this.estres = 50;
	}

	public Float getEdad() {
		return edad;
	}

	public void setEdad(Float edad) {
		this.edad = edad;
	}

	public Especies getEspecie() {
		return especie;
	}

	public void setEspecie(Especies especie) {
		this.especie = especie;
	}

	public Byte getHambre() {
		return hambre;
	}

	public void setHambre(Byte hambre) {
		if(hambre<0) {
			this.hambre=0;
		}else if(hambre>100) {
			this.hambre=100;
		}else {
			this.hambre=hambre;
		}
	}

	public Byte getSueño() {
		return sueño;
	}

	public void setSueño(Byte sueño) {
		if(sueño<0) {
			this.sueño=0;
		}else if(sueño>100) {
			this.sueño=100;
		}else {
			this.sueño=sueño;
		}	}

	public Byte getDiversion() {
		return diversion;
	}

	public void setDiversion(Byte diversion) {
		if(diversion<0) {
			this.diversion=0;
		}else if(diversion>100) {
			this.diversion=100;
		}else {
			this.diversion=diversion;
		}
	}

	public Byte getEstres() {
		return estres;
	}

	public void setEstres(Byte estres) {
		if(estres<0) {
			this.estres=0;
		}else if(estres>100) {
			this.estres=100;
		}else {
			this.estres=estres;
		}
	}

	// metodo

	public void comer(Comida c) {
		this.setHambre((byte) (this.getHambre() - c.getValorEnergetico()));
		this.setSueño((byte) (this.getSueño() - c.getMorriña()));
	}

	public void dormir() {
		this.setSueño((byte)(this.getSueño()-10));;
	}

	public void jugar(Juego j) {
		this.setDiversion((byte) (this.getDiversion() + j.getDiversion()));
		this.setSueño((byte) (this.getSueño() - j.getEstres()));
	}

	public void relajarse() {
		this.setDiversion((byte)(this.getDiversion()-10));
	}

	public boolean estaVivo() {
		if (hambre >= 100 || sueño >= 100 || diversion >= 0 || estres >= 100 || edad >= 30) {
			return false;
		} else {
			return true;
		}
		
	}

	public void crecer() {
		edad++;
	}

	public String toString() {
		return super.toString() + "\n\tEdad: " + edad + "\n\tEspecie: " + especie + "\n\t Hambre: " + hambre
				+ "\n\t Sueño: " + sueño + "\n\t Diversion: " + diversion + "\n\t Estres: " + estres;
	}

}
