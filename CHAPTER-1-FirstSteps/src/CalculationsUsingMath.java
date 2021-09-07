
public class CalculationsUsingMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// FIRST PART
		/*
		
		double raiz=Math.sqrt(9);	// Math Class for Square Root 
		
		System.out.println(raiz);
		
		*/
		
		// SECOND PART
		
			// PROCEDURE 1
		
			/*
			
			float num1=5.85F;
			
			int resultado=Math.round(num1);
			
			System.out.println(resultado);
			
			*/
		
		
			// PROCEDURE 2
		
			double num1=5.85;
			
			int resultado=(int)Math.round(num1);	// REFUNDICION (REFUNDING) 
			
			System.out.println(resultado);
			
			
			
			// RAISE A NUMBER TO A POWER
			
			double base=5;
			
			double exponente=3;
			
			int resultadoPow=(int)Math.pow(base, exponente);
			
			System.out.println("El resultado de " + base + " elevado a " + exponente + " es " + resultadoPow);
			
			System.out.println("El resultado de " + (int)base + " elevado a " + (int)exponente + " es " + resultadoPow);	// REFUND ALL VARIABLES (DONE BY ME)

	}

}
