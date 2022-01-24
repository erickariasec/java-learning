package JavaBasics.S15_StaticContextJava.domain;

public class Person {
    private int idPerson;
    private String name;
    private static int personCounter;   // Encapsulating static Attribute

    public Person(String name){
        this.name = name;
        // Increment counter for each new object
        Person.personCounter++;
        // Assign the new value to the variable idPerson
        this.idPerson = Person.personCounter;
        // this.idPerson = Person.personCounter++;  // It is possible to do in this way too.
    }

    public int getIdPerson() {  // GETTER
        return idPerson;
    }

    public void setIdPerson(int idPerson) {     // SETTER
        this.idPerson = idPerson;
    }

    public String getName() {   // GETTER
        return name;
    }

    public void setName(String name) {      // SETTER
        this.name = name;
    }

    public static int getPersonCounter() {      // STATIC GETTER
        return personCounter;
    }

    public static void setPersonCounter(int personCounter) {    // STATIC SETTER
        Person.personCounter = personCounter;
    }

    @Override
    public String toString() {
        return "Person{" +
                "idPerson=" + idPerson +
                ", name='" + name + '\'' +
                '}';
    }
}
