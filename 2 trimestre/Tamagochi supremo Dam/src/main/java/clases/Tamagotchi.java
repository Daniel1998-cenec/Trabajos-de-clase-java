package clases;

import enumeration.Especies;
public class Tamagotchi extends CosaConNombre {

	private Float edad;
	private Especies especie;
	private Byte hambre;
	private Byte sueño;
	private Byte diversion;
	private Byte estres;
	
	public Tamagotchi(String nombre, Float edad, Especies especie) {
		super(nombre);
		this.edad = edad;
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
		this.hambre = hambre;
	}

	public Byte getSueño() {
		return sueño;
	}

	public void setSueño(Byte sueño) {
		this.sueño = sueño;
	}

	public Byte getDiversion() {
		return diversion;
	}

	public void setDiversion(Byte diversion) {
		this.diversion = diversion;
	}

	public Byte getEstres() {
		return estres;
	}

	public void setEstres(Byte estres) {
		this.estres = estres;
	}
	
	//metodo
	
	public void comer(Comida c) {
		
	}
	public void dormir() {
		
	}
	public void jugar(Juego j) {
		
	}
	public void relajarse() {
		
	}
	public boolean estaVivo() {
		return true;
		
	}
	public void crecer() {
		
	}
	public String toString() {
		return super.toString()+"\n\tEdad: " + edad + "\n\tEspecie: " + especie + "\n\tHambre: " + hambre + "\n\tSueño: " + sueño
				+ "\n\tDiversion: " + diversion + "\n\tEstres: " + estres;
	}
	
	
}
