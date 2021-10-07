
public class PracticingASUNStringsManipulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// SET UP VARIABLES
		String name="Elon";
		String lastName="Musk";
		String inspirationalPhrase="Software Developers are changing the world!";
		
		
		// NAME EVENT
		System.out.println("SILICON VALLEY BEST BRAINS");
		
		
		System.out.println();
		
		
		
		// FIRST PART: charAt(n), length()
		
		
		// EVENT DEVELOPMENT
		System.out.println(inspirationalPhrase);
		System.out.println();
		System.out.println("And one of the best is " + name + ' ' + lastName + "...");
		
		
		
		System.out.println(name.charAt(0) + " is the letter that "
				+ "starts everything in the world!");
		System.out.println("One word that only contanins " + name.length() + 
				" letters.");
		
		
		System.out.println();
		
		
		System.out.println(name.length() + " letters that mean:");
		
		
		System.out.println();
		
		
		System.out.println(name.charAt(0) + "motion");
		System.out.println(name.charAt(1) + "oyality");
		System.out.println(name.charAt(2) + "portunity");
		System.out.println(name.charAt(name.length() - 1) + "ew world");
		
		
		
		// SECOND PART: substring (x, y)
		
		// SET UP NEW VARIABLE THAT CONTAINS SUBSTRING
		String resumeInspirationalPhrase=inspirationalPhrase.substring(0, 23);
		
		System.out.println();
		System.out.println();
		
		System.out.println("REMEMBER THESE THINGS FOREVER...");
		
		System.out.println();
		System.out.println();
		
		
		System.out.println(resumeInspirationalPhrase + " innovative");
		System.out.println(resumeInspirationalPhrase + " inspiration for new generations");
		System.out.println(resumeInspirationalPhrase + " the best brains that have ever existed");
		
		System.out.println();
		System.out.println();
		
		// THIRD PART: equals, equalsIgnoreCase
		
		// SET UP NEW VARIABLES
		String advice1="SUCCESS";
		String advice2="MONEY";
		String advice3="success";
		String advice4="SUM OF FAILURES";
		
		System.out.println(advice1 + " = " + advice2 + 
				"? " + "- That is " + advice1.equals(advice2));
		
		System.out.println(advice1 + " = " + advice4 + 
				"? " + "- That is " + advice1.equalsIgnoreCase(advice3));
		
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("THANKS FOR BEING PART OF THIS EVENT!");
	}

}
