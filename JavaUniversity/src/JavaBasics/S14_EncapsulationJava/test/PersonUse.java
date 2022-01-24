package JavaBasics.S14_EncapsulationJava.test;

import JavaBasics.S14_EncapsulationJava.domain.Person;

public class PersonUse {
    public static void main(String[] args) {

        Person person1 = new Person("Richard", 1200.00, false);
        System.out.println("person1: " + person1.toString()); // Calling Method toString with actual information

        System.out.println("\nperson1 name: " + person1.getName()); // Prints actual name

        person1.setName("Richard Steven"); // Modify name
        System.out.println("person1 name modified: " + person1.getName()); // Prints modified name
        System.out.println("person1 salary: " + person1.getSalary()); // Prints salary defined at Constructor Method
        System.out.println("person1 removed: " + person1.isRemoved()); // Prints removed defined at Constructor Method

        System.out.println("\nperson1 modified: " + person1.toString()); // Calling Method toString with modified information



        Person person2 = new Person("Jenny", 4000, true);

        System.out.println("\n\nperson2: " + person2.toString());  // Calling Method toString with actual information

        // Exercise: All values defined are wrong or incomplete, so change them and print them.
        person2.setName("Jenny Natalia");   // Modify name
        person2.setSalary(6500);    // Modify salary
        person2.setRemoved(false);  // Modify if is removed or not

        System.out.println("\nperson2 name: " + person2.getName());   // Prints name modified
        System.out.println("person2 salary: " + person2.getSalary());   // Prints salary modified
        System.out.println("person2 removed: " + person2.isRemoved());  // Prints correct boolean
    }
}
