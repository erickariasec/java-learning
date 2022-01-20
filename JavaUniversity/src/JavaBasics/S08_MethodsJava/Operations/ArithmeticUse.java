package JavaBasics.S08_MethodsJava.Operations;

public class ArithmeticUse {
    public static void main(String[] args) {

        // Instantiating Arithmetic Class (Creating Object arithmetic1)
        Arithmetic arithmetic1 = new Arithmetic();

        arithmetic1.a = 5;
        arithmetic1.b = 4;


        arithmetic1.sum(); // Prints what is inside of sum Method

        int result = arithmetic1.sumWithReturn(); // Calling sumWithReturn Method
        System.out.println("Result from ArithmeticUse: " + result);

        // Calling sumPassingParameters Method
        result = arithmetic1.sumEstablishingParameters(7, 4); // Assigning Arguments
        System.out.println("The result of the sum after assigning arguments is: " + result);

    }
}
