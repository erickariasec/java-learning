package JavaBasics.S07_CreatingClasesJava;

public class PersonUse {

    public static void main(String[] args) {

        // Instantiate the Class (Creating an object person1)
        Person person1 = new Person();

        person1.name = "Juan";
        person1.lastName = "Perez";
        person1.showInformation();

        // Instantiate the Class (Creating an object person2)
        Person person2 = new Person();

        System.out.println("person1 = " + person1); // It will print memory location of person1
        System.out.println("person2 = " + person2); // It will print memory location of person2
        person2.showInformation(); // It will print null because I don´t have information for name and lastName yet

        person2.name = "Karla";
        person2.lastName = "Lara";
        person2.showInformation();

    }

}
