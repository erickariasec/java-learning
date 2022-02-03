package FunctionsJava;

public class RecursiveFunctions {
    public static void main(String[] args) {

        System.out.println(factorial(5));   // Passing Attribute to get the factorial

        System.out.println("\n");

        countdown(10);  // Passing Attribute from where you want to start the countdown
    }

    static int factorial(int num){  // Recursive Function to get Factorial
        if(num > 1){
            num *= factorial(num -1);   // The function will execute itself
        }                                    // It is like a bucle
        return num;
    }

    static void countdown(int num){     // Recursive Function to Countdown
        num --;
        if(num > 0){
            System.out.println(num);
            countdown(num);     // The Function countdown will execute itself
        }else {
            System.out.println("The countdown reached 0");
        }
    }

}

