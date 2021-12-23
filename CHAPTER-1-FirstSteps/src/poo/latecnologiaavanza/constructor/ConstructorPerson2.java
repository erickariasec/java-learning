package poo.latecnologiaavanza.constructor;

public class ConstructorPerson2 {

    String name;
    int age;
    double height;

    // Constructor Method
    public ConstructorPerson2(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;

        System.out.println("The name is: " + name);
        System.out.println("The age is: " + age);
        System.out.println("The height is: " + height);
    }

}
