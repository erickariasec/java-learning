package JavaBasics.S15_StaticContextJava.test;

import JavaBasics.S15_StaticContextJava.domain.Person;

public class PersonUse {
    public static void main(String[] args) {
        Person person1 = new Person("Danny"); // Calls toString Method and print that structure
        System.out.println("person1 = " + person1); // toString converts Attributes of an object into String

        Person person2 = new Person("Sofia"); // Calls toString Method and print that structure
        System.out.println("person2 = " + person2); // toString converts Attributes of an object into String
    }
}
