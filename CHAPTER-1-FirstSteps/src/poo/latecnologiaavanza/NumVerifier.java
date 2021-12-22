package poo.latecnologiaavanza;

public class NumVerifier {

    // Create a method to calculate the greatest number between 3 numbers
    public int calculateGreatestNumber (int num1, int num2, int num3){
        int greatest;

        if(num1 > num2 && num1 > num3){
            greatest = num1;
        }
        else if (num2 > num3){
            greatest = num2;
        }
        else{
            greatest = num3;
        }

        return greatest;
    }

    // Create a method to calculate the smallest number between 3 numbers
    public int calculateSmallestNumber (int num1, int num2, int num3){
        int smallest;

        if(num1 < num2 && num1 < num3){
            smallest = num1;
        }

        else if(num2 < num3){
            smallest = num2;
        }

        else{
            smallest = num3;
        }

        return smallest;
    }
}
