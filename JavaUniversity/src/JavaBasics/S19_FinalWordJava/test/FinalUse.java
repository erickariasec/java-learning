package JavaBasics.S19_FinalWordJava.test;

import JavaBasics.S19_FinalWordJava.domain.Person;
import jdk.nashorn.internal.runtime.JSErrorType;

public class FinalUse {
    public static void main(String[] args) {
        final int myVariable = 10;  // Once created, we can´t modify this final Attribute
        System.out.println("myVariable = " + myVariable);
        // myVariable = 5;  // Here we can not modify because myVariable is final

        System.out.println("MY_CONSTANT = " + Person.MY_CONSTANT); // Calling directly because MY_CONSTANT is static
                                                // static is part of the Class not the Object
                                                // We can't modify this because is final also

        final Person person1 = new Person();    // Instantiating final Person Class (final Object)
        // person1 = new Person();  // This is not possible because is final
        person1.setName("Lisbeth");
        System.out.println("person1 name: " + person1.getName());
        person1.setName("Tatiana");
        System.out.println("person1 name modified: " + person1.getName());

        final Person person2 = new Person();    // final Object person2
        person2.setName("Eddy");
        System.out.println("person2 name: " + person2.getName());
    }
}
