
public class PracticingAllSeenUntilNow1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello world!");
		System.out.println("My name is Erick!");
		System.out.println("Here is my first practice using Java");
		
		System.out.println();
		System.out.println();
		
		System.out.println("Create a program that shows you some math operations:");
		System.out.println();
		
		// SUM VARIABLES
		byte sumNum1=5;		// byte: 1 byte - From -128 to 127
		byte sumNum2=15;
		byte resultSum;
		
		resultSum=(byte)(sumNum1+sumNum2);
		
		// SUBSTRACT VARIABLES
		short restNum1=12500;		// short: 2 bytes - From -32,768 to 32,767
		short restNum2=10000;
		short resultRest=(short)(restNum1-restNum2);
		
		// MULTIPLICATION VARIABLES
		int multNum1=147856;		// int: 4 bytes - From -2.147,483,647 to 2,147,483,647
		int multNum2=100;
		int resultMult;
		
		resultMult=multNum1*multNum2;
		
		// DIVISION VARIABLES
		long divNum1=125000000000000000L;		// long: 8 bytes - A lot of numbers
		long divNum2=100000000L;
		long resultDiv=divNum1/divNum2;
		
		// SQUARE ROOT
		float sqrtNum1=104.853623F;		// float: 4 bytes - Approximately 6 to 7 significant decimal places
		float resultSqrt=(float)Math.sqrt(sqrtNum1);	// REFUNDICION
		
		// RAISE A NUMBER TO A POWER
		double base=1286.754616481428193;		// double: 8 bytes - Approximately 15 significant decimal places
		double exponent=3;
		double resultPow=Math.pow(base, exponent);
		
		
		
		// Print in console the results of those operations. 
		
		System.out.println("The sum of " + sumNum1 + " plus " + sumNum2 + " is " + resultSum + ".");
		System.out.println("The subtraction of " + restNum1 + " minus " + restNum2 + " is " + resultRest + ".");
		System.out.println("The multiplication of " + multNum1 + " by " + multNum2 + " is " + resultMult + ".");
		System.out.println("The division of " + divNum1 + " by " + divNum2 + " is " + resultDiv + ".");
		System.out.println("The square root of " + sqrtNum1 + " es " + resultSqrt + ".");
		System.out.println("The result of " + base + " to the power of " + exponent + " is " + resultPow + ".");
		
	}

}
