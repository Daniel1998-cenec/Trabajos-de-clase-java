package argumento.de.programa.dam;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Longitud args: "+args.length);
		for(byte i=0;i<args.length;i++) {
			System.out.println(args[i]+"\t");
		}

	}

}
