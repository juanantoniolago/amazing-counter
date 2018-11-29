package contador;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cont = 2;
		int max = 0;
		
		System.out.println("Hasta cuanto quieres contar");
		max=Leer.datoInt();
		
		do {
			System.out.println(cont);
			cont=cont+2;
			
		}while(max != 101);
		
		
		
	}

}
