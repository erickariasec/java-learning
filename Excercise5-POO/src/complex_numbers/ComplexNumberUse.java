package complex_numbers;

import java.util.Scanner;

public class ComplexNumberUse {
    public static void main(String[] args) {

        Scanner dataEntry = new Scanner(System.in);

        ComplexNumber num1, num2;
        ComplexNumber sum, multiplication;
        double r1;  // Real Part of 1st Number
        double i1;  // Imaginary Part of 1st Number
        double r2;  // Real Part of 2nd Number
        double i2;  // Imaginary Part of 2nd Number
        int option, intNum;

        do{
            System.out.println("\n\t\tMENU");
            System.out.println("1. Sum of 2 Complex Numbers");
            System.out.println("2. Multiply 2 Complex Numbers");
            System.out.println("3. Check equality of 2 Complex Numbers");
            System.out.println("4. Multiply Integer by Complex Number");
            System.out.println("5. Exit");
            System.out.print("Enter an option: ");
            option = dataEntry.nextInt();

            switch (option){
                // 1. Sum of 2 Complex Numbers
                case 1:
                    System.out.print("\nEnter the real part of the first Complex Number: ");
                    r1 = dataEntry.nextDouble();

                    System.out.print("Enter the imaginary part: ");
                    i1 = dataEntry.nextDouble();

                    System.out.print("\nEnter the real part of the second Complex Number: ");
                    r2 = dataEntry.nextDouble();

                    System.out.print("Enter the imaginary part: ");
                    i2 = dataEntry.nextDouble();

                    num1 = new ComplexNumber(r1, i1);
                    num2 = new ComplexNumber(r2, i2);

                    sum = num1.getSumCalculation(num2);
                    System.out.println("\nThe sum is: " + sum.getRealPart2() + " + " + sum.getImaginaryPart2() + "i\n");
                    break;

                // 2. Multiply 2 Complex Numbers
                case 2:
                    System.out.print("\nEnter the real part of the first Complex Number: ");
                    r1 = dataEntry.nextDouble();

                    System.out.print("Enter the imaginary part: ");
                    i1 = dataEntry.nextDouble();

                    System.out.print("\nEnter the real part of the second Complex Number: ");
                    r2 = dataEntry.nextDouble();

                    System.out.print("Enter the imaginary part: ");
                    i2 = dataEntry.nextDouble();

                    num1 = new ComplexNumber(r1, i1);
                    num2 = new ComplexNumber(r2, i2);

                    multiplication = num1.getProductCalculation(num2);
                    System.out.println("\nThe multiplication is: " + multiplication.getRealPart2() + " + " + multiplication.getImaginaryPart2() + "i\n");
                    break;

                // 3. Check equality of 2 Complex Numbers
                case 3:
                    System.out.print("\nEnter the real part of the first Complex Number: ");
                    r1 = dataEntry.nextDouble();

                    System.out.print("Enter the imaginary part: ");
                    i1 = dataEntry.nextDouble();

                    System.out.print("\nEnter the real part of the second Complex Number: ");
                    r2 = dataEntry.nextDouble();

                    System.out.print("Enter the imaginary part: ");
                    i2 = dataEntry.nextDouble();

                    num1 = new ComplexNumber(r1, i1);
                    num2 = new ComplexNumber(r2, i2);

                    if(num1.getEqualityChecker(num2)){
                        System.out.println("\nComplex Numbers are equal\n");
                    }else{
                        System.out.println("\nComplex Numbers are not equal\n");
                    }
                    break;

                // 4. Multiply Integer by Complex Number
                case 4:
                    System.out.print("\nEnter the real part of the Complex Number: ");
                    r1 = dataEntry.nextDouble();

                    System.out.print("Enter the imaginary part: ");
                    i1 = dataEntry.nextDouble();

                    System.out.println("\nEnter the integer: ");
                    intNum = dataEntry.nextInt();

                    num1 = new ComplexNumber(r1, i1);
                    multiplication = num1.getIntegerMultiplication(intNum);

                    System.out.println("\nThe multiplication is: " + multiplication.getRealPart2() + " + " + multiplication.getImaginaryPart2() + "i\n");
                    break;

                // 5. Exit
                case 5:
                    System.out.println("\nThanks for participating!\n");
                    break;

                default:
                    System.out.println("\nOption not available, try again!\n");
                    break;
            }

        }while(option != 5);

    }
}
