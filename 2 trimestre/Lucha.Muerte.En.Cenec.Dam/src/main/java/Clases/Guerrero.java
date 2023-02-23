package Clases;

public class Guerrero extends Luchador {

	private Escudo escudo;

	public Guerrero(String nombre, Arma arma, byte vida, Escudo escudo) {
		super(nombre, arma, vida);
		this.escudo = escudo;
	}

	public Escudo getEscudo() {
		return escudo;
	}

	public void setEscudo(Escudo escudo) {
		this.escudo = escudo;
	}

	// metodo
	
	public void defender() {
	}
	
	public void atacar() {
	}

	public String toString() {
		return super.toString()+"escudo=" + escudo;
	}
	
	
}
