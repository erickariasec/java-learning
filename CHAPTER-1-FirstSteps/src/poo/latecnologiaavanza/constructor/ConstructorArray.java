package poo.latecnologiaavanza.constructor;

import java.util.Scanner;

public class ConstructorArray {

    int myArray[];

    // Array Constructor Method
    public ConstructorArray(int nElements){

        Scanner dataEntry = new Scanner(System.in);

        myArray = new int[nElements];
        for (int i = 0; i < myArray.length; i++){
            System.out.print("Enter number " + (i+1) + ": ");
            myArray[i] = dataEntry.nextInt();
        }
    }


    // Method for printing what is inside the array
    public void setPrinter(){
        System.out.println("");
        for (int i = 0; i < myArray.length; i++){
            System.out.println("Number " + (i+1) + ": " + myArray[i]);
        }
    }

}
