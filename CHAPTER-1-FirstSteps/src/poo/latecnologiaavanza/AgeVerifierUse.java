package poo.latecnologiaavanza;

import java.util.*;

public class AgeVerifierUse {
    public static void main(String[] args) {

        Scanner dataEntry = new Scanner(System.in);

        AgeVerifier ageVerifier = new AgeVerifier();
        int age;
        double height;
        String name;

        System.out.println("Enter your age: ");
        age = dataEntry.nextInt();

        System.out.println("Enter your name: ");
        name = dataEntry.next();

        System.out.println("Enter your height: ");
        height = dataEntry.nextDouble();

        ageVerifier.verifyLegalAge(age, name, height);

    }
}
