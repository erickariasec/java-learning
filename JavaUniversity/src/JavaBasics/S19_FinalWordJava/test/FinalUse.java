package JavaBasics.S19_FinalWordJava.test;

import JavaBasics.S19_FinalWordJava.domain.Person;

public class FinalUse {
    public static void main(String[] args) {
        final int myVariable = 10;  // Once created, we can´t modify this final Attribute
        System.out.println("myVariable = " + myVariable);
        // myVariable = 5;  // Here we can not modify because myVariable is final

        System.out.println("MY_CONSTANT = " + Person.MY_CONSTANT); // Calling directly because MY_CONSTANT is static
                                                // static is part of the Class not the Object
                                                // We can't modify this because is final also
    }
}
