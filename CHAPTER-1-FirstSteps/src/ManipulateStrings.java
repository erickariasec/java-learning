
public class ManipulateStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Erick";
		
		System.out.println("My name is " + name);
		
		System.out.println("My name has " + name.length() + " letters.");
		
		System.out.println("The first letter of my name is " + name.charAt(0));
		
		// Three ways to find last letter of a String
		int lastLetter=name.length();
		System.out.println("The last letter of " + name + " is " + name.charAt(4) + ".");	// Available only for "Erick" or other words of 5 letters. (This is not the best way)
		System.out.println("The last letter of " + name + " is " + name.charAt(lastLetter - 1) + ".");	// Available for all words, it doesn't matter the word long.
		System.out.println("The last letter of " + name + " is " + name.charAt(name.length() - 1) + ".");	// Another method available for all words. (From Youtube comments)
	}

}
