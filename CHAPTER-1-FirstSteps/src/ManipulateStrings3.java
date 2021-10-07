
public class ManipulateStrings3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String student1A, student2A, student1B, student2B;
		
		// 
		student1A="Erick";
		student2A="Erick";
		
		System.out.println(student1A.equals(student2A)); // Both words must be written the same way
		
		student1B="Nathaly";
		student2B="nathaly";
		
		System.out.println(student1B.equalsIgnoreCase(student2B)); // It doesn´t matter if it is lowercase or uppercase
	}

}
