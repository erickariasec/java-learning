import java.util.*;
public class DataEntryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// CREATE SCANNER OBJECT
		Scanner dataEntry=new Scanner(System.in); 
		
		System.out.println("Enter your name, please:");
		
		// SCAN USER NAME
		String userName=dataEntry.nextLine();
		
		System.out.println("Enter your age, please:");
		
		// SCAN USER AGE
		int userAge=dataEntry.nextInt();
		
		System.out.println();
		
		System.out.println("Hi " + userName + ", the next year you will be " + (userAge+1) + '.');

	}

}
