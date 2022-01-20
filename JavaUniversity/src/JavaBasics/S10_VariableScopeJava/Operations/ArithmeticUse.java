package JavaBasics.S10_VariableScopeJava.Operations;

public class ArithmeticUse {
    public static void main(String[] args) {

        // Instantiating Arithmetic Class (Creating Object arithmetic1)
        Arithmetic arithmetic1 = new Arithmetic();
        System.out.println("arithmetic1 a: " + arithmetic1.a);  // Print 0 by default
        System.out.println("arithmetic1 b: " + arithmetic1.b);  // Print 0 by default

        // Instantiating Arithmetic Class using Constructor Method with Parameters
        Arithmetic arithmetic2 = new Arithmetic(5, 8);  // Assigning Arguments
        System.out.println("arithmetic2 a: " + arithmetic2.a);
        System.out.println("arithmetic2 b: " + arithmetic2.b);
    }
}
