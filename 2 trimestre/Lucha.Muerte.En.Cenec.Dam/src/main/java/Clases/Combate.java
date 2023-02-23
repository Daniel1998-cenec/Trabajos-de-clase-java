package Clases;

public class Combate {
	
	private Luchador luchador1;
	private Luchador luchador2;
	private int turno;
	
	public Combate(Luchador luchador1, Luchador luchador2, int turno) {
		super();
		this.luchador1 = luchador1;
		this.luchador2 = luchador2;
		this.turno = turno;
	}

	public Luchador getLuchador1() {
		return luchador1;
	}

	public void setLuchador1(Luchador luchador1) {
		this.luchador1 = luchador1;
	}

	public Luchador getLuchador2() {
		return luchador2;
	}

	public void setLuchador2(Luchador luchador2) {
		this.luchador2 = luchador2;
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}
	
	//Metodo
	
	public void iniciar() {
	}

	public String toString() {
		return "\n\tluchador1=" + luchador1 + "\n\tluchador2=" + luchador2 + "\n\tturno=" + turno;
	}
	
	
}
