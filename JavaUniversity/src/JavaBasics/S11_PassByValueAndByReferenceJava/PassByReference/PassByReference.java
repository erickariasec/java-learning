package JavaBasics.S11_PassByValueAndByReferenceJava.PassByReference;

import JavaBasics.S07_CreatingClasesJava.Person;

public class PassByReference {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Patty";
        System.out.println("The name of person1 is: " + person1.name);
        changeValueByReference(person1);
        System.out.println("The changed name of person1 is: " + person1.name);
    }

    public static void changeValueByReference(Person person){
        person.name = "Cami"; // Here it is possible to change the Name of the person because it is
                              // pointing to the same reference of the Person object
    }
}
