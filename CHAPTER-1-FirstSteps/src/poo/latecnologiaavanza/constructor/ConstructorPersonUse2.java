package poo.latecnologiaavanza.constructor;

public class ConstructorPersonUse2 {
    public static void main(String[] args) {

        String name = "Nathaly";
        int age = 22;
        double height = 1.60;

        // Another way to execute Constructor Method and Passing Arguments
        ConstructorPerson buildPerson2 = new ConstructorPerson(name, age, height);
    }
}
