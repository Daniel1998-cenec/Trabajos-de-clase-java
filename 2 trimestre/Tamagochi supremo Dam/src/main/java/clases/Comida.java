package clases;

public class Comida extends CosaConNombre {

	private Byte valorEnergetico;
	private Byte morriña;
	
	public Comida(String nombre, Byte valorEnergetico, Byte morriña) {
		super(nombre);
		this.valorEnergetico = valorEnergetico;
		this.morriña = morriña;
	}

	public Byte getValorEnergetico() {
		return valorEnergetico;
	}

	public void setValorEnergetico(Byte valorEnergetico) {
		this.valorEnergetico = valorEnergetico;
	}

	public Byte getMorriña() {
		return morriña;
	}

	public void setMorriña(Byte morriña) {
		this.morriña = morriña;
	}

	public String toString() {
		return super.toString()+"\n\tValorEnergetico: " + valorEnergetico + "\n\tmorriña=" + morriña;
	}
	
	
}
