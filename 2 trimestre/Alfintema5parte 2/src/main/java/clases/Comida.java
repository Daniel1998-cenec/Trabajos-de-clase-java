package clases;

public class Comida extends ElementoConNombre {
	
	private byte valorNutritivo;

	public Comida(String nombre, byte valorNutritivo) {
		super(nombre);
		this.valorNutritivo = valorNutritivo;
		
	}

	public byte getValorNutritivo() {
		return valorNutritivo;
	}

	public void setValorNutritivo(byte valorNutritivo) {
		if(valorNutritivo<1) {
			this.valorNutritivo = valorNutritivo;
		}else if(valorNutritivo>=100) {
			this.valorNutritivo =100;
		}else {
			this.valorNutritivo=valorNutritivo;
		}
		
	}
	
	public String toString() {
		return super.toString()+" | valor nutritivo: "+this.valorNutritivo;
	}
	
	

	
	
	
}
