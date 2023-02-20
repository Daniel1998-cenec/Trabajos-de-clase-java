package tema5.parte2.dam;
import clases.Comida;
import clases.Perro;
public class Principal {

	public static void main(String[] args) {
		/*Comida sopaPollo=new Comida("Sopa de pollo",(byte)40);
		
		Comida soplaPollo= new Comida("Sopa de pollo",(byte)40);*/
		
		Perro rubi=new Perro ("Rubi",'h',(byte)50,(byte)50,(byte)50,(byte)50,"canina",
				"liso","Dani");
		System.out.println(rubi);
	}

}
