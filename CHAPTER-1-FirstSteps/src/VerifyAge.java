import java.util.*;
public class VerifyAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner dataEntry=new Scanner(System.in);
		
		System.out.println("Enter your age, please:");
		
		int userAge=dataEntry.nextInt();
		
		// CONDITIONALS
		if ((userAge>=18) && (userAge<=120)){
			System.out.println("You are of legal age!");
			System.out.println();
			System.out.println("You could drink alcohol here!");
		}
		else if ((userAge>0) && (userAge<18)){
			System.out.println("You are a minor!");
			System.out.println();
			System.out.println("You aren´t allowed to entry here!");
		}
		else{
			System.out.println("That isn´t a valid age!");
			System.out.println();
			System.out.println("Sorry!");
		}
		
	}

}
