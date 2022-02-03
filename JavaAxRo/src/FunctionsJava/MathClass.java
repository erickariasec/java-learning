package FunctionsJava;

public class MathClass {
    public static void main(String[] args) {

        System.out.println(Math.PI);    // Prints PI value
        System.out.println(Math.E);     // Prints Euler value

        System.out.println(Math.pow(4, 3));     // Raise a number

        System.out.println(Math.random());  // Random number from 0 to 1 (double)

        int randomNumber = (int)(Math.random()*101);    // 101 means that it will random until number 100
        System.out.println(randomNumber);

        System.out.println((int)(Math.random()*101)); // This will do the same (random until number 100)


        System.out.println(Math.sqrt(64));  // Return double
        System.out.println((int)(Math.sqrt(64)));   // Return int

        System.out.println(Math.max(4, 8)); // Return max value
        System.out.println(Math.min(4, 8)); // Return min value

        System.out.println(Math.round(5.8471)); // Round a number

        double coin = (double) Math.round(3.4289 * 100d)/100;   // Round float number each 0 means how many decimals
        System.out.println(coin);                               // If we want 3 decimals it would be * 1000d)/1000

    }
}
