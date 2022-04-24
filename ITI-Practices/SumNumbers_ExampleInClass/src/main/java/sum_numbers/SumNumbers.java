package sum_numbers;

/**
 *
 * @author Erick Arias
 */
public class SumNumbers {
    private int num1, num2, sumResult;

    public void setNumbersToSum(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }

    private int sumTwoNumbers(){
        sumResult=num1+num2;
        return sumResult;
    }

    public int getSum(){
        return sumTwoNumbers();
    }
}
