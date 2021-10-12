import java.util.*;

public class GuessNumberDoWhile {
    public static void main(String[] args) {

        int generateRandom=(int)(Math.random()*100); // REFUNDING

        Scanner dataEntry=new Scanner(System.in);

        // INITIALIZE VARIABLES
        int userNumber=0;
        int attempts=0;

        // BUCLE DO WHILE
        do{
            attempts++; // Attempts number increment each time you enter the while loop

            System.out.println("Enter a number, please:");
            userNumber= dataEntry.nextInt();

            if (generateRandom<userNumber){
                System.out.println("\nLower!\n");
            }
            else if (generateRandom>userNumber){
                System.out.println("\nHigher!\n");
            }
        } while (generateRandom!=userNumber);

        System.out.println("\n\n****CONGRATULATIONS!**** \n\t\tYOU WIN! \n\nYOU GOT IT " +
                "IN " + attempts + " ATTEMPTS!");

    }
}
