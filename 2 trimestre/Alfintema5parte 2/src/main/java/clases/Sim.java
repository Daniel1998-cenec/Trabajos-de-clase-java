package clases;

public class Sim extends SerVivo {
	
private String apellidos;

public Sim(String nombre, String apellidos, char genero, byte hambre, byte sueño, byte aburrimiento, byte suciedad) {
	super(nombre, genero, hambre, sueño, aburrimiento, suciedad);
	this.apellidos = apellidos;
}

public String getApellidos() {
	return apellidos;
}

public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}

public String toString() {
	return super.toString()+"\n\tapellidos=" + apellidos;
}



}
