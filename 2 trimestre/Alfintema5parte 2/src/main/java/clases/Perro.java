package clases;

public final class Perro extends AnimalDomestico {

	public Perro(String nombre, char genero, byte hambre, byte sueño, byte aburrimiento, byte suciedad, String raza,
			String pelaje, Sim dueño) {
		super(nombre, genero, hambre, sueño, aburrimiento, suciedad, raza, pelaje, dueño);
		
	}

	public String toString() {
		return super.toString();
	}

	@Override
	public void comer(Comida c) {
		
		this.setHambre((byte)(this.getHambre()-c.getValorNutritivo()/2));
	}
	
}
