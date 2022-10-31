package teoria.operadores;

public class operadores {

	public static void main(String[] args) {
		
		 short gananciasAnuales =12000;
		    short nHijos=10;
		    System.out.println("¿Me pueden dar una subvención?"+(gananciasAnuales<15000||gananciasAnuales<=24000&&nHijos>2));
			
		    
		    byte  nhijos=2;
			byte gradoMinusvalia=20;
			int gananciasanuales=12000;
			System.out.println("¿corresponde ayuda gubernamnetal?"+!(gradoMinusvalia<40&&nhijos<=2&&gananciasanuales>=14000&&
					(nHijos==0||gananciasAnuales>2000)));
			
			nHijos+=5; 
			nHijos-=5;
			nHijos*=5;
			nHijos%=5;
			}
	}
