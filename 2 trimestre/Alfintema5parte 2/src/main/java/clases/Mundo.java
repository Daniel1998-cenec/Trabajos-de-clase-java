package clases;

import java.util.Arrays;

public class Mundo {
	
private Sim[] sims;
private Animal[] animales;
public Mundo(Sim[] sims, Animal[] animales) {
	super();
	this.sims = sims;
	this.animales = animales;
}
public Sim[] getSims() {
	return sims;
}
public void setSims(Sim[] sims) {
	this.sims = sims;
}
public Animal[] getAnimales() {
	return animales;
}
public void setAnimales(Animal[] animales) {
	this.animales = animales;
}

public String toString() {
	return "Mundo [sims=" + Arrays.toString(sims) + ", animales=" + Arrays.toString(animales) + "]";
}


}
