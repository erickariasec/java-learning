package poo.latecnologiaavanza;

public class OverloadExamples {

    // Constructor Method 1
    public OverloadExamples(int age){
        System.out.println("The age is: " + age);
    }

    // Constructor Method 2
    public OverloadExamples(int km, String name){
        System.out.println("The name is " + name + " and runs around " + km + " km/h");
    }

    // Constructor Method 3
    public OverloadExamples(double height){
        System.out.println("The height is: " + height + " meters");
    }

    // GETTER because return an int
    public int getMathAnswer(int currentDate, int birthDate){
        int age = currentDate - birthDate;
        return age;
    }

    // GETTER because return an int
    public int getMathAnswer(){
        return 10 * 20;
    }

    // SETTER because void don´t return anything
    public void setGreet(){
        System.out.println("Hello, good night!");
    }

    // SETTER because void don´t return anything
    public void setGreet(String name){
        System.out.println("Hi, my name is " + name + ", nice to meet you!");
    }

}
