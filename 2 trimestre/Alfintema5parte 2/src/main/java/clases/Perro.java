package clases;

public class Perro extends AnimalDomestico {

	public Perro(String nombre, char genero, byte hambre, byte sueño, byte aburrimiento, byte suciedad, String raza,
			String pelaje, String dueño) {
		super(nombre, genero, hambre, sueño, aburrimiento, suciedad, raza, pelaje, dueño);
		
	}

	public String toString() {
		return super.toString();
	}

}
