package JavaBasics.S17_ConstructorAndMethodsOverloading.methodOverloading.test;

import JavaBasics.S17_ConstructorAndMethodsOverloading.methodOverloading.operations.MathOperations;

public class MathOperationsUse {
    public static void main(String[] args) {
        //int result = MathOperations.sum(5, 3);
        System.out.println("result = " + MathOperations.sum(5, 3)); // Method with Integers
        System.out.println("result = " + MathOperations.sum(2.0, 3));   // Method with Double
        System.out.println("result = " + MathOperations.sum(3, 8L));  // Long could be considered by Double
    }
}
