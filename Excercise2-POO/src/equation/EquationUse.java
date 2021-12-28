package equation;

import java.util.Scanner;

public class EquationUse {

    public static void main(String[] args) {

        Scanner dataEntry = new Scanner(System.in);

        // LOCAL VARIABLES
        double a;
        double b;
        double c;
        boolean check = true;
        String answerToContinue;
        Roots root;
        int counter = 0;

        System.out.println("\tSOLVE SECOND GRADE EQUATIONS");

        // LOOP UNTIL CHECK IS "FALSE"
        for(int i=0; check; i++){
            System.out.print("Enter \"a\" value: ");
            a = dataEntry.nextDouble();
            System.out.print("Enter \"b\" value: ");
            b = dataEntry.nextDouble();
            System.out.print("Enter \"c\" value: ");
            c = dataEntry.nextDouble();

            System.out.print("\n");
            root = new Roots(a, b, c);  // Calling Constructor Method from Roots Class
            root.setSolution();  // Calling Method to Solve Equation

            System.out.print("\nDo yo want to continue? (y/n): ");
            answerToContinue = dataEntry.next();

            System.out.print("\n");

            if(answerToContinue.equalsIgnoreCase("y")){
                counter++;
                check = true;
            }
            else{
                counter++;
                System.out.println("The number of times you calculated the equation was: " + counter);
                check = false;
            }
        }

    }
}
