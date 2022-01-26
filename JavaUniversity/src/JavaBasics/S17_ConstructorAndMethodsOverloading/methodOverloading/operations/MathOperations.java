package JavaBasics.S17_ConstructorAndMethodsOverloading.methodOverloading.operations;

public class MathOperations {

    // Overloading Methods
    // Parameters must be different

    public static int sum(int a, int b){    // Method to sum with int Parameters
        System.out.println("sum(int a, int b)");
        return a + b;
    }

    public static double sum(double a, double b){   // Method to sum with double Parameters
        System.out.println("sum(double a, double b)");
        return a + b;
    }
}
