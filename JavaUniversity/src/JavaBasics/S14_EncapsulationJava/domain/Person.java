package JavaBasics.S14_EncapsulationJava.domain;

public class Person {
    private String name;    // ENCAPSULATING ATTRIBUTES by using private
    private double salary;
    private boolean removed;

    public Person(String name, double salary, boolean removed){
        this.name = name;
        this.salary = salary;
        this.removed = removed;
    }

    public String getName(){  // GETTER
        return this.name;
    }

    public void setName(String name){   // SETTER
        this.name = name;
    }

    public double getSalary(){  // GETTER
        return this.salary;
    }

    public void setSalary(double salary){   // SETTER
        this.salary = salary;
    }

    public boolean isRemoved(){     // GETTER for boolean
        return this.removed;
    }

    public void setRemoved(boolean removed){    // SETTER
        this.removed = removed;
    }

    public String toString(){
        return "Persona [ name: " + this.name +
                ", salary: " + this.salary +
                ", removed: " + this.removed + " ]";
    }
}
