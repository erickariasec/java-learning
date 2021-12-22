package poo.latecnologiaavanza;

import java.util.Scanner;

public class NumVerifierUse {
    public static void main(String[] args) {

        Scanner dataEntry = new Scanner(System.in);

        NumVerifier numVerifier = new NumVerifier();
        int num1;
        int num2;
        int num3;

        System.out.println("Enter the first number: ");
        num1 = dataEntry.nextInt();

        System.out.println("Enter the second number: ");
        num2 = dataEntry.nextInt();

        System.out.println("Enter the third number: ");
        num3 = dataEntry.nextInt();

        int greatest = numVerifier.calculateGreatestNumber(num1, num2, num3);
        int smallest = numVerifier.calculateSmallestNumber(num1, num2, num3);

        System.out.println("\nThe greatest number is: " + greatest);
        System.out.println("The smallest number is: " + smallest);
    }
}
