/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sum_numbers;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class SumNumbersUse {
    public static void main(String[] args) {
        Scanner dataEntry = new Scanner(System.in);
        int num1, num2;
        SumNumbers obj = new SumNumbers();

        System.out.println("Enter number 1: ");
        num1=dataEntry.nextInt();

        System.out.println("Enter number 2: ");
        num2=dataEntry.nextInt();

        obj.setNumbersToSum(num1, num2);

        System.out.println("The result of the sum is: " + obj.getSum());
    }
}
