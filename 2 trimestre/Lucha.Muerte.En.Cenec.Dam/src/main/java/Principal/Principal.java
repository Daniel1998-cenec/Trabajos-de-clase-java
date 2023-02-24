package Principal;

import Clases.Guerrero;
import Clases.Arma;
import Clases.Berserker;
import Clases.Escudo;
import Clases.Luchador;
public class Principal {

	public static void main(String[] args) {
		Escudo escudo=new Escudo("Escudo", (byte)10);
		Arma espada=new Arma("Espada", (byte)10);
		Guerrero daniel=new Guerrero("Daniel",espada, escudo);
		daniel.recibirDaño(daniel.atacar());
		
		Arma lanza= new Arma("Lanza maligna pero poco",(byte)15);
		Arma patitoAmarillo=new Arma("Patito amarillo de goma",(byte)3);
		Berserker bersie = new Berserker ("Bersie",lanza,patitoAmarillo);
		
		Luchador ganador=daniel.pelear(bersie);
		System.out.println("Ganador: "+ganador);
	}

}
