package Clases;

public class Berserker extends Luchador{
	
	private Arma segundoArma;

	public Berserker(String nombre, Arma arma, byte vida, Arma segundoArma) {
		super(nombre, arma, vida);
		this.segundoArma = segundoArma;
	}

	public Arma getSegundoArma() {
		return segundoArma;
	}

	public void setSegundoArma(Arma segundoArma) {
		this.segundoArma = segundoArma;
	}
	
	//metodo
	
	public void defender() {
	}
	
	public void atacar() {
	}
	
	public String toString() {
		return super.toString()+"segundoArma=" + segundoArma;
	}
	
	
}
