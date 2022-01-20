package JavaBasics.S08_MethodsJava.Operations;

public class Arithmetic {

    // Class Attributes
    int a;
    int b;

    // Method to sum
    public void sum(){
        int result = a + b;
        System.out.println("The result of the sum is: " + result);
    }

    // Method to sum with integer return 
    public int sumWithReturn(){
        return a + b;
    }

}
