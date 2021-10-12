import java.util.*; // This package contains Scanner Class

public class GuessNumber {
    public static void main(String[] args) {

        int generateRandom=(int)(Math.random()*100); // REFUNDING

        Scanner dataEntry=new Scanner(System.in);

        // INITIALIZE VARIABLES
        int userNumber=0;
        int attempts=0;

        while (generateRandom!=userNumber){
            attempts++; // Attempts number increment each time you enter the while loop

            System.out.println("Enter a number, please:");
            userNumber= dataEntry.nextInt();

            if (generateRandom<userNumber){
                System.out.println("\nLower!\n");
            }
            else if (generateRandom>userNumber){
                System.out.println("\nHigher!\n");
            }
        }

        System.out.println("\n\n****CONGRATULATIONS!**** \n\t\tYOU WIN! \n\nYOU GOT IT " +
                "IN " + attempts + " ATTEMPTS!");

    }
}
