package tema5.parte2.dam;
import clases.Comida;
import clases.ElementoConNombre;
import clases.Mundo;
import clases.Perro;
import clases.Sim;
import clases.Animal;
public class Principal {

	public static void main(String[] args) {
		Comida sopaPollo=new Comida("Sopa de pollo",(byte)40);
		Sim daniel=new Sim("Daniel", "Vargas", 'm', (byte)50,(byte)50,(byte)50,(byte)50);
		Perro rubi=new Perro ("Rubi",'h',(byte)50,(byte)50,(byte)50,(byte)50,"canina",
				"liso",daniel);
		daniel.comer(sopaPollo);
		rubi.comer(sopaPollo);
		System.out.println(rubi);
		
		Mundo m=new Mundo(new Sim[3],new Animal[5]);
		ElementoConNombre[] cosas=new ElementoConNombre[4];
		m.getAnimales()[0]=rubi;
	}

}
