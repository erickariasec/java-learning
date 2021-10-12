import javax.swing.*;

public class Factorial {
    public static void main(String[] args) {

        System.out.println("\t***GET THE FACTORIAL OF A NUMBER***\n");

        /* Get Factorial numbers could give us an extremely long number for that reason
        * there is a Class called BigInteger that will let us working with those numbers.
        * In the future we are going to learn how to do that, for now we have to do this
        * with long data type*/

        long result=1L;
        long userNumber= Long.parseLong(JOptionPane.showInputDialog("Enter a number"));

        for (long i=userNumber; i>0; i--){

            result=result*i;
            //  1 = 1 * 4 =   4     i--
            //  4 = 4 * 3 =  12     i--
            // 12 = 12 * 2 = 24     i--
            // 24 = 24 * 1 = 24     i--

        }

        System.out.println("The factorial of " + userNumber + " is " + result);
    }
}
