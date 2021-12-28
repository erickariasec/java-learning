package board;

import java.util.Scanner;

public class CartesianPlaneUse {

    public static void main(String[] args) {

        Scanner dataEntry = new Scanner(System.in);

        int x;
        int y;
        int option;
        int increment = 0;

        System.out.println("\n\t**MOVE ON THE CARTESIAN PLANE**\n");

        System.out.print("Enter the initial position of \"x\": ");
        x = dataEntry.nextInt();

        System.out.print("Enter the initial position of \"x\": ");
        y = dataEntry.nextInt();

        // CALLING CONSTRUCTOR METHOD AFTER GETTING VALUES OF X AND Y
        CartesianPlane cartesianPlane = new CartesianPlane(x, y);

        do {
            // MAIN MENU
            System.out.println("\n\tMENU");
            System.out.println("1. Move Up (Y+)");
            System.out.println("2. Move Right (X+)");
            System.out.println("3. Move Down (Y-)");
            System.out.println("4. Move Left (X-)");
            System.out.println("5. Exit");
            System.out.print("Enter an option: ");
            option = dataEntry.nextInt();

            if(option >= 1 && option <=4){
                System.out.print("\nEnter the number of spaces you want to move: ");
                increment = dataEntry.nextInt();
            }

            switch (option){
                case 1:
                    cartesianPlane.setUpMovement(increment);
                    break;

                case 2:
                    cartesianPlane.setRightMovement(increment);
                    break;

                case 3:
                    cartesianPlane.setDownMovement(increment);
                    break;

                case 4:
                    cartesianPlane.setLeftMovement(increment);
                    break;

                case 5:
                    System.out.println("\nThanks for your participation!");
                    break;

                default:
                    System.out.println("\nThe option does not exist! Try again!");
                    break;
            }

            System.out.println("\nActual Position (x):(y) is (" + cartesianPlane.getX() +
                    "):(" + cartesianPlane.getY() + ")");

        }while (option != 5);

    }
}
