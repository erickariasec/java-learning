package JavaBasics.S15_StaticContextJava.test;

import JavaBasics.S15_StaticContextJava.domain.Person;

public class PersonUse {

    private int counter; // Attribute generated for understanding example

    public static void main(String[] args) {
        Person person1 = new Person("Danny"); // Calls toString Method and print that structure
        System.out.println("person1 = " + person1); // toString converts Attributes of an object into String

        Person person2 = new Person("Sofia"); // Calls toString Method and print that structure
        System.out.println("person2 = " + person2); // toString converts Attributes of an object into String

        System.out.println("\n\n");
        printMethod(person1);   // Calling static printMethod
        printMethod(person2);   // Calling static printMethod

        // this.counter = 10; It is NOT POSSIBLE to use this because Attribute is not static, it is dynamic context
        // I could not call getCounter Method because that method is NOT static
    }

    public static void printMethod(Person person){ // Creating static Method
        System.out.println("person = " + person);
    }

    public int getCounter(){  // Creation of a GETTER of an Attribute from this Class // DYNAMIC CONTEXT
        printMethod(new Person("Erika"));   // Calling static printMethod
        return this.counter;
    }
}
