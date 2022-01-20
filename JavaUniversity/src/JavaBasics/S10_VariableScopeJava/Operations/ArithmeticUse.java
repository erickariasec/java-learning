package JavaBasics.S10_VariableScopeJava.Operations;

public class ArithmeticUse {
    public static void main(String[] args) {

        // Local Variables
        int a = 10;
        int b = 2;
        myMethod(); // Calling Method that is outside of main

        // Instantiating Arithmetic Class (Creating Object arithmetic1)
        Arithmetic arithmetic1 = new Arithmetic();
        System.out.println("arithmetic1 a: " + arithmetic1.a);  // Print 0 by default
        System.out.println("arithmetic1 b: " + arithmetic1.b);  // Print 0 by default

        // Instantiating Arithmetic Class using Constructor Method with Parameters
        Arithmetic arithmetic2 = new Arithmetic(5, 8);  // Assigning Arguments
        System.out.println("arithmetic2 a: " + arithmetic2.a);
        System.out.println("arithmetic2 b: " + arithmetic2.b);
    }

    public static void myMethod(){  // It is important to be "static" for being used at main
        // a = 10;
        // Variable 'a' is OUT OF SCOPE where it was defined (main), so we could not use.
        System.out.println("This is another method, which is outside of main");
    }
}
