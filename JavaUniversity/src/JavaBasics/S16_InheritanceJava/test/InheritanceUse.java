package JavaBasics.S16_InheritanceJava.test;

import JavaBasics.S16_InheritanceJava.domain.Employee;

public class InheritanceUse {
    public static void main(String[] args) {
        Employee employee1 = new Employee();    // It will receive toString structure from Class Person
        System.out.println("employee1 = " + employee1); // It will print toString structure with null information
                                                        // because Employee is empty
    }
}
