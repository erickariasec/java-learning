package JavaBasics.S20_ArrayManagementJava.test;

import JavaBasics.S20_ArrayManagementJava.domain.Person;

public class ArrayObjectUse {
    public static void main(String[] args) {

        Person[] persons = new Person[2];   // Object Array

        persons[0] = new Person("Leo"); // Passing Attributes to Person Constructor
        persons[1] = new Person("Katy");

        System.out.println("persons at position 0 = " + persons[0]);    // Use toString to show correct format
        System.out.println("persons at position 1 = " + persons[1]);    // else it will print only memory location
    }
}
