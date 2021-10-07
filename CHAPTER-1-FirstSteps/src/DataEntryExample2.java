import javax.swing.*;
public class DataEntryExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userName=JOptionPane.showInputDialog("Enter your name, please");
		
		String userAge=JOptionPane.showInputDialog("Enter your age, please");
		
		System.out.println("Hi, " + userName + ", the next year you will be " + (userAge+1) + '.');
		// Hi, Erick Arias, the next year you will be 221. (It returns 221 because it is a String)
		// If you want the next number you must convert that String into Integer
		
		
		// CONVERSION
		int convertedUserAge=Integer.parseInt(userAge); // This is used to convert Strings into Integer
		
		System.out.println("Hi, " + userName + ", the next year you will be " + (convertedUserAge+1) + '.');
		
	}

}
