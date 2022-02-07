package CreatingApps.Primality;

import java.util.Scanner;

public class PrimalityUse {
    public static void main(String[] args) {

        Scanner dataEntry = new Scanner(System.in);

        System.out.println("\n\n\t\t\tVERIFY PRIME NUMBER");
        System.out.println("\t\t\t*******************");
        System.out.print("\n\t\t\t Enter a number: ");
        int num = dataEntry.nextInt();

        if(isPrime(num)){
            System.out.println("\n\t\t**** " + num + " is prime number ****");
        }else{
            System.out.println("\n\t\t**** " + num + " isn't prime number ****");
        }
    }

    // A number is prime only if it is divisible by 1 and itself
    static boolean isPrime(int num){
        boolean isPrimeTrue = true;     // Local Variable to verify prime

        if (num >= 2) {     // 0 and 1 are not prime numbers
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {     // It never divides neither for 1 nor for itself
                    isPrimeTrue = false;
                    break;
                }
            }
        }else {
            isPrimeTrue = false;
        }

        return isPrimeTrue;
    }
}
