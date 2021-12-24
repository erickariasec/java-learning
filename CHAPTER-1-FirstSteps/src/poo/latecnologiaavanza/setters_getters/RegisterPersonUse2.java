package poo.latecnologiaavanza.setters_getters;

import java.util.Scanner;

public class RegisterPersonUse2 {
    public static void main(String[] args) {

        RegisterPerson registerPerson2 = new RegisterPerson();

        Scanner dataEntry = new Scanner(System.in);

        System.out.print("Enter your name: ");
        registerPerson2.setName(dataEntry.nextLine());

        System.out.print("Enter your age: ");
        registerPerson2.setAge(dataEntry.nextInt());

        System.out.print("Enter your height: ");
        registerPerson2.setHeight(dataEntry.nextDouble());

        System.out.println("\nHello " + registerPerson2.getName() + "!");
        System.out.println("Nice to meet you!");

        System.out.println("Wow you are " + registerPerson2.getAge() +
                " years old.");

        System.out.println("And you are " + registerPerson2.getHeight() +
                " meters tall!");
    }
}
