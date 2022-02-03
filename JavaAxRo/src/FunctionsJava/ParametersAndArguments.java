package FunctionsJava;

import java.util.Scanner;

public class ParametersAndArguments {
    public static void main(String[] args) {
        sum(10, 45);    // Adding directly arguments to sum Method
        greet("Erick", 23); // Adding directly arguments to greet Method

        System.out.println("\n");

        Scanner dataEntry = new Scanner(System.in);  // Creating Scanner

        System.out.print("Enter your name please: ");
        String name = dataEntry.nextLine(); // Asking for name

        System.out.print("Enter your age: ");
        int age = dataEntry.nextInt(); // Asking for age

        greet(name, age);   // Passing arguments after asking the user his/her information to greet Method
    }


    static void sum(int a, int b){  // Method to Sum
        int suma = a + b;
        System.out.println("La suma es: " + suma);
    }

    static void greet(String name, int age){    // Method to Greet
        System.out.printf("Hi %s, your age is %d\n\n", name, age);
    }
}
