package JavaBasics.S20_ArrayManagementJava.domain;

public class Person {

    private String name; // private Attribute

    public Person(String name){     // Constructor
        this.name = name;
    }

    public String getName(){    // GETTER
        return name;
    }

    public void setName(String name){   // SETTER
        this.name = name;
    }

    @Override
    public String toString() {      // toString is necessary to convert whichever object into String
        return "Person{" +
                "name='" + name + '\'' +
                '}' + ", " + super.toString(); // To show memory location
    }
}
