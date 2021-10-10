import javax.swing.*;
public class NumbersEntryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x=10000.0;
		
		System.out.println(x/3); // Print all point values
		
		System.out.printf("%1.2f", (x/3)); // Print only values designed
		
		System.out.println();
		System.out.println();
		
		
		
		
		// SCAN USER NUMBER AND CALCULATE SQUARE ROOT
		System.out.println("LET'S CALCULATE SQUARE ROOT");
		
		String userNumber=JOptionPane.showInputDialog("Enter a number, please");
		
		// CONVERSION FROM STRING TO DOUBLE
		double convertedUserNumber=Double.parseDouble(userNumber);
		
		System.out.println(); // Add new line
		System.out.print("The square root of " + convertedUserNumber + " is "); // Doesn't add new line
		System.out.printf("%1.2f", (Math.sqrt(convertedUserNumber))); // Formatted output form

	}

}
