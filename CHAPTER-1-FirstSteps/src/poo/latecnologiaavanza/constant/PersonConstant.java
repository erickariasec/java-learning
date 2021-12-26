package poo.latecnologiaavanza.constant;

public class PersonConstant {

    private int age = 12;
    public final String name = "Martin"; // This is a constant

    public void setGreet(){
        age = 13;
        // name = "Lorena";  It is not possible because name is final (constant)
        System.out.println("Hi, my name is " + name + ", I am " + age + " years old!");
    }
}
