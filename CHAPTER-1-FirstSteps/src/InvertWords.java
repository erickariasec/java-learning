import java.util.Scanner;

public class InvertWords {
    public static void main(String[] args) {
        String word="";
        String invertedWord="";

        System.out.println("*****INVERT WORDS*****\n");

        Scanner dataEntry=new Scanner(System.in);
        System.out.println("Enter a word or phrase: ");
        word= dataEntry.nextLine();

        for(int i=word.length()-1; i>=0; i--){
            // Print to visualize what is happening
            System.out.println(invertedWord+=word.charAt(i));
        }

        System.out.println("\nThis is the inverted:\n" + invertedWord);
    }
}
