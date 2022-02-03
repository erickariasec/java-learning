package FunctionsJava;

public class StringClass {
    // +----+----+---+---+---+---+---+
    // | O  | r  | e | g | o | o | m |
    // +----+----+---+---+---+---+---+
    // | 0  | 1  | 2 | 3 | 4 | 5 | 6 |
    // +----+----+---+---+---+---+---+
    public static void main(String[] args) {

        String name = "Oregoom";

        System.out.println(name.charAt(3));     // It will print 'g'

        System.out.println(name.length());  // Returns the quantity of characters

        System.out.println("\n");

        for (int i = 0; i < name.length(); i++){
            System.out.println(name.charAt(i));   // It will print the complete word, char by char
        }

        System.out.println(name.substring(0, 4)); // It will print from position 0 to position 3 (Oreg)

        System.out.println(name.toLowerCase()); // Converts All text to Lower Case
        System.out.println(name.toUpperCase()); // Converts All text to Upper Case

        System.out.println("\n");

        name = "O r e g o m"; // Word with spaces
        System.out.println(name);   // Print name with spaces
        System.out.println(name.replace(" ", "-")); // Replace spaces with hyphens (-)
        System.out.println(name.replace(" ", ""));  // Replace spaces with no spaces

        String nameGirlfriend = "Jenny";
        System.out.println("Roberto loves " + nameGirlfriend);
        System.out.println("Roberto loves " + nameGirlfriend.replace("Jenny", "his girlfriend"));

        System.out.println("Hello".equals("Hello"));    // Return true or false
    }
}
