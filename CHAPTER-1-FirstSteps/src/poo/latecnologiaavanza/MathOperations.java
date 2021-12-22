package poo.latecnologiaavanza;

import java.util.Scanner;

public class MathOperations {

    int num1;
    int num2;
    int sum;
    int substract;
    int multiplication;

    public void askNumbers(){
        Scanner dataEntry = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        num1 = dataEntry.nextInt();

        System.out.println("Enter the second number: ");
        num2 = dataEntry.nextInt();
    }

    public void showMenu(){
        Scanner dataEntry = new Scanner(System.in);
        int option = 0;

        System.out.println("1. Sum Numbers");
        System.out.println("2. Substract Numbers");
        System.out.println("3. Multiplicate Numbers");

        System.out.println("Enter your option number: ");
        option = dataEntry.nextInt();

        switch (option){
            case 1:
                askNumbers();
                sumNumbers();
                break;

            case 2:
                askNumbers();
                substractNumbers();

            case 3:
                askNumbers();
                multiplicateNumbers();

            default:
                System.out.println("\nOpción no disponible");
        }
    }

    public void sumNumbers(){
        sum = num1 + num2;
        System.out.println("\nThe sum of both numbers is: " + sum);
    }

    public void substractNumbers(){
        substract = num1 - num2;
        System.out.println("\nThe substraction of both numbers is: " + substract);
    }

    public void multiplicateNumbers(){
        multiplication = num1 * num2;
        System.out.println("\nThe multiplication of both numbers is: " + multiplication);
    }


}
