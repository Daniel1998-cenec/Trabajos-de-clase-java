package Clases;

public class Arma extends ElementoConNombre {

	private Byte daño;

	public Arma(String nombre, Byte daño) {
		super(nombre);
		this.daño = daño;
	}

	public Byte getDaño() {
		return daño;
	}

	public void setDaño(Byte daño) {
		if (daño < 0) {
			this.daño = 0;
		} else if (daño > 100) {
			this.daño = 100;
		} else {
			this.daño = daño;
		}
	}

	public String toString() {
		return super.toString() + "daño=" + daño;
	}

}
