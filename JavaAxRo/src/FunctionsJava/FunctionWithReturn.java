package FunctionsJava;

public class FunctionWithReturn {
    public static void main(String[] args) {
        int sum = sum(10, 25);  // LOCAL VARIABLE

        System.out.println("The sum is " + sum);    // Calling Local Variable
        System.out.println("The sum is " + sum(7, 8)); // Assigning values directly to Sum Method

        // LOCAL VARIABLES
        String name = "Karla";
        int age = 26;

        System.out.println(greet(name, age));   // Calling Method with Return Greet
    }

    static int sum(int a, int b){   // Method to Sum with Return
        return a + b;
    }

    static String greet(String name, int age){  // Method to Greet with Return
        return "Your name is " + name + ", and you are " + age + " year old.";
    }

}
