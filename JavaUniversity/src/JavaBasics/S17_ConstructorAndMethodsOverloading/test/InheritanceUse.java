package JavaBasics.S17_ConstructorAndMethodsOverloading.test;

import JavaBasics.S17_ConstructorAndMethodsOverloading.domain.Client;
import JavaBasics.S17_ConstructorAndMethodsOverloading.domain.Employee;

import java.util.Date;

public class InheritanceUse {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Nicole", 5000.00); // Creating Object employee1 with these arguments
        System.out.println("employee1 = " + employee1);

//        System.out.println("\n\n");
//        // Instantiate Client Class                                                          // Prints actual date
//        Client client1 = new Client("Carla", 'F', 25, "LongStreet Avenue", new Date(), true);
//        System.out.println("client1 = " + client1);
//        // Prints actual date
//        Client client2 = new Client("Santiago", 'M', 23, "Maldonado Avenue", new Date(), false);
//        System.out.println("client2 = " + client2);
    }
}
