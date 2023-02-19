package clases;

public class AnimalDomestico extends Animal {
	private String pelaje;
	private String dueño;
	
	public AnimalDomestico(String nombre, char genero, byte hambre, byte sueño, byte aburrimiento, byte suciedad,
			String raza, String pelaje, String dueño) {
		super(nombre, genero, hambre, sueño, aburrimiento, suciedad, raza);
		this.pelaje = pelaje;
		this.dueño = dueño;
	}

	public String getPelaje() {
		return pelaje;
	}

	public void setPelaje(String pelaje) {
		this.pelaje = pelaje;
	}

	public String getDueño() {
		return dueño;
	}

	public void setDueño(String dueño) {
		this.dueño = dueño;
	}

	
	public String toString() {
		return super.toString()+"\n\tpelaje=" + pelaje + "\n\tdueño=" + dueño;
	}
	
	

}
