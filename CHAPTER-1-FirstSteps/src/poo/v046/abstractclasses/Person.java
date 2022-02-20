package poo.v046.abstractclasses;

public abstract class Person{

    private final String name;

    public Person(String name){
        this.name=name;
    }

    public String getName(){ // GETTER
        return name;
    }

    public abstract String getDescription(); // This is how to declare an abstract method, without opening or closing braces
    // We are forced to use this method in each inherited class
}
