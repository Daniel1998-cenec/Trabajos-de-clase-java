package Clases;

public class Luchador extends ElementoConNombre {
	
	private Arma arma;
	private byte vida;
	
	public Luchador(String nombre, Arma arma, byte vida) {
		super(nombre);
		this.arma = arma;
		this.vida = vida;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public byte getVida(byte vida) {
		if(vida<0) {
			this.vida = 0;
		}else if (vida>100) {
			this.vida=100;
		}else {
			this.vida=vida;
		}
		return vida;
		
	}

	public void setVida(byte vida) {
		this.vida = vida;
	}
	
	//método
	
	public void defender(Escudo proteger) {
		this.setVida((byte) (this.getVida(vida)+proteger.getProteccion()));
	}
	
	public void ataque(Arma ataque) {
		this.setVida((byte) (this.getVida(vida)+ataque.getDaño()));
	}
	
	public String toString() {
		return super.toString()+"\n\tarma="+arma+"\n\tvida="+vida;
	}
	
	
}
