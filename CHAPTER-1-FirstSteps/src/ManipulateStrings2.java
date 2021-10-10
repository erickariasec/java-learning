
public class ManipulateStrings2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// MAIN PHRASE
		String phrase="Today is a good day to learn how to program in Java";
		
		
		// PHRASE SELECTION N°1
		String phrase_resume=phrase.substring(1, 4); // It must show "oda" (Today)
		/*
		 * The first subscript corresponds to the character from
		 * which you want to start extracting (From position 0)
		 *
		 *
		 *	The other subscript indicates up to the position of
		 *the character that we do not want to extract.
		 */
		System.out.println(phrase_resume); // "oda"
		
		
		// PHRASE SELECTION N°2
		phrase_resume=phrase.substring(23, 51); // It must show "learn how to program in Java"
		
		System.out.println(phrase_resume); // "learn how to program in Java"
		
		
		// PHRASE SELECTION N°3 - CONCANTENATION (STRING)
		phrase_resume=phrase.substring(0, 22) + " forget evertything..." + " and " + phrase.substring(23, 51) + '.';
		
		System.out.println(phrase_resume); // "// Today is a good day to forget evertything... and learn how to program in Java."
		
	}
	
}
