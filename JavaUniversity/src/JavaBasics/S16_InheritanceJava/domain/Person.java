package JavaBasics.S16_InheritanceJava.domain;

public class Person {
    protected String name;  // protected is used so that the child classes can access and modify directly these attributes
    protected char genre;
    protected int age;
    protected String address;

    public Person(){    // Empty Constructor Method

    }

    public Person(String name){     // Constructor Method with name parameter
        this.name = name;
    }

    public Person(String name, char genre, int age, String address){    // Constructor Method with all Parameters
        this.name = name;
        this.genre = genre;
        this.age = age;
        this.address = address;
    }

    public String getName() {   // GETTER
        return name;
    }

    public void setName(String name) {  // SETTER
        this.name = name;
    }

    public char getGenre() {    // GETTER
        return genre;
    }

    public void setGenre(char genre) {  // SETTER
        this.genre = genre;
    }

    public int getAge() {   // GETTER
        return age;
    }

    public void setAge(int age) {   // SETTER
        this.age = age;
    }

    public String getAddress() {    // GETTER
        return address;
    }

    public void setAddress(String address) {    // SETTER
        this.address = address;
    }

    @Override
    public String toString() {  // Method toString 
        return "Person{" +
                "name='" + name + '\'' +
                ", genre=" + genre +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
