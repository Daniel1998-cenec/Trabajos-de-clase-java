package clases;

public class Gato extends AnimalDomestico {
private byte tendenciaAlCaos;

public Gato(String nombre, char genero, byte hambre, byte sueño, byte aburrimiento, byte suciedad,byte tendenciaAlCaos, String raza,
		String pelaje, String dueño ) {
	super(nombre, genero, hambre, sueño, aburrimiento, suciedad, raza, pelaje, dueño);
	this.tendenciaAlCaos = tendenciaAlCaos;
}

public byte getTendenciaAlCaos() {
	return tendenciaAlCaos;
}

public void setTendenciaAlCaos(byte tendenciaAlCaos) {
	this.tendenciaAlCaos = tendenciaAlCaos;
}

public String toString() {
	return super.toString()+"\n\ttendenciaAlCaos=" + tendenciaAlCaos;
}

}
