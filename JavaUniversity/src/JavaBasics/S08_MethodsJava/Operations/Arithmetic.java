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

    // Method to sum establishing parameters
    public int sumEstablishingParameters(int arg1, int arg2){
        a = arg1;
        b = arg2;           // This is not a good practice
        //return a + b;
        return sumWithReturn();  // Calls the logic of sumWithReturn Method
    }

}
