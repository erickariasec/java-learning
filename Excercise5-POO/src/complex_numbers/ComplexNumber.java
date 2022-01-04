package complex_numbers;

public class ComplexNumber {

    // Attributes of a complex number
    private double realPart;
    private double imaginaryPart;

    // Constructor Method
    public ComplexNumber(double realPart, double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    // GETTER for Real Part
    public double getRealPart2(){
        return realPart;
    }

    // GETTER for Imaginary Part
    public double getImaginaryPart2(){
        return imaginaryPart;
    }

    // Method to calculate Sum of Complex Numbers
    public ComplexNumber getSumCalculation(ComplexNumber num){
        ComplexNumber sum = new ComplexNumber(realPart + num.getRealPart2(), imaginaryPart + num.getImaginaryPart2());
        return sum;
    }

    // Method to calculate Product
    public ComplexNumber getProductCalculation(ComplexNumber num){
        ComplexNumber multiplication = new ComplexNumber(((realPart * num.getRealPart2()) - imaginaryPart * getImaginaryPart2()),
                ((realPart * num.getImaginaryPart2()) + (num.getRealPart2() * imaginaryPart)));
        return multiplication;
    }

    // Method to Check Equality
    public boolean getEqualityChecker(ComplexNumber num){
        boolean equality = false;
        if((realPart == num.getRealPart2()) && (imaginaryPart == getImaginaryPart2())){
            equality = true;
        }
        return equality;
    }

    // Method to Calculate Product of Integer by Complex Number
    public ComplexNumber getIntegerMultiplication(int num){
        ComplexNumber multiplication = new ComplexNumber((realPart * num), (imaginaryPart * num));
        return multiplication;
    }
}

    // EXPLANATION COMPLEX NUMBERS

    // SUM
    /*
        ComplexNumber num1, num2
        num1 = 7 + 2i;
        num2 = 6 + 3i;

        7 + 6 = 13
        2 + 3 = 5i        ->   13 + 5i

        num1.getSumCalculation(num2);
    */


    // MULTIPLICATION
    /*
        num1 = 3 + 2i
        num2 = 4 + 3i

        multiplication = ((3*4) - (2*3))  +  ((3*3) + (4*2))i  =  6 + 17i
    */


    // EQUALITY
    /*
        num1 = 2 + 4i               num1 = 2 + 4i
        num2 = 2 + 4i               num2 = 2 + 3i

             true true                   true false
                true                       false
    */


    // MULTIPLICATION INTEGER BY COMPLEX NUMBER
    /*
    ComplexNumber = 2 + 4i
    Integer = 4

    multiplication = 8 + 16i
    */
