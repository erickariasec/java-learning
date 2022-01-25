package JavaBasics.S17_ConstructorAndMethodsOverloading.domain;

public class Employee extends Person{   // Employee Class is child of Person (Person is Parent Class)
    private int idEmployee;
    private double salary;
    private static int counterEmployee; // It must be static

    public Employee(String name, double salary){    // Constructor with 2 Parameters
        super(name);    // Calls constructor from Parent Class (Initialize)
        this.idEmployee = ++Employee.counterEmployee;   // Because of it is static, it will increment in each new object
        this.salary = salary;
    }

    public int getIdEmployee() {    // GETTER
        return idEmployee;
    }

    public double getSalary() {     // GETTER
        return salary;
    }

    public void setSalary(double salary) {      // SETTER
        this.salary = salary;
    }

    @Override       // Here we are overriding toString from Person Parent Class
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{"); // StringBuilder is mutable, so we can change it
        sb.append("idEmployee=").append(idEmployee);
        sb.append(", salary=").append(salary);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
