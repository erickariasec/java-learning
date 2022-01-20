package JavaBasics.S09_ConstructorsJava.Operations;

public class Arithmetic {

    // Class Attributes
    int a;
    int b;

    // Empty Constructor Method
    public Arithmetic(){
        System.out.println("Executing Constructor"); // It will be printed when instantiate this Class
    }

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
    public int sumEstablishingParameters(int a, int b){
        /* "this" refers to an attribute of a Class */
        this.a = a;     // Parameter 'a' is assigned to Attribute 'a'(this.a)
        this.b = b;     // Parameter 'b' is assigned to Attribute 'b'(this.b)
        //return a + b;
        return sumWithReturn();  // Calls the logic of sumWithReturn Method
    }

}
