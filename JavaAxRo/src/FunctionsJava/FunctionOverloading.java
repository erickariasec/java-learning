package FunctionsJava;

public class FunctionOverloading {
    public static void main(String[] args) {

        System.out.println(sum(45, 45));    // Calling Method that contains int Parameters

        System.out.println(sum(35.956, 4.75));      // Calling Method that contains double Parameters

    }

    static int sum(int a, int b){
        return a + b;
    }

    static double sum(double a, double b){  // Overloading Sum Method
        return a + b;                       // Parameters must be different to overload
    }
}
