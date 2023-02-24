package Clases;

import java.util.Random;

public class Berserker extends Luchador{
	
	private Arma segundoArma;

	public Berserker(String nombre, Arma arma, Arma segundoArma) {
		super(nombre, arma);
		this.segundoArma = segundoArma;
	}

	public Arma getSegundoArma() {
		return segundoArma;
	}

	public void setSegundoArma(Arma segundoArma) {
		this.segundoArma = segundoArma;
	}
	
	public String toString() {
		return super.toString()+"\n\tsegundoArma=" + segundoArma;
	}

	@Override
	public byte atacar() {
		byte dañoHechoArma1=super.atacar();
		Random r=new Random();
		byte dañoHechoArma2=(byte)r.nextInt(this.segundoArma.getDaño()+1);
		System.out.println(this.getNombre()+" ataca con su "+this.segundoArma.getNombre()+
				" y hace "+dañoHechoArma2+" puntos de daño.");
		return (byte)(dañoHechoArma1+dañoHechoArma2);
	}
	
	
}
