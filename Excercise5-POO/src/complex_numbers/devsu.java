package complex_numbers;

import java.util.*;
import java.io.*;
import java.math.*;

public class devsu {

    public static int computeClosestToZero(int[] ts) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");

        /*int closestToZero = 10001;

        if(ts.length == 0){
            return 0;
        }else if(ts.length >= 0 && ts.length <= 10000){
            for(int i=0; i<ts.length; i++){
                if(Math.abs(ts[i]) < closestToZero){
                    closestToZero = Math.abs(ts[i]);
                }
            }
        }

        return closestToZero;*/


        // OFFICIAL SOLVING METHOD SEARCHED ON INTERNET
        int closestToZero = 10001;

        if(ts.length == 0){
            return 0;
        }

        for(int i=0; i<ts.length; i++){
            if(closestToZero == 0){
                closestToZero = ts[i];
            } else if(ts[i] > 0 && ts[i] <= Math.abs(closestToZero)){
                closestToZero = ts[i];
            } else if(ts[i] < 0 && -ts[i] < Math.abs(closestToZero)){
                closestToZero = ts[i];
            }
        }

        return closestToZero;
    }

//    /* Ignore and do not change the code below */
//    // #region main
//    public static void main(String args[]) {
////        Scanner in = new Scanner(System.in);
////        int n = in.nextInt();
////        int[] ts = new int[n];
////        for (int i = 0; i < n; i++) {
////            ts[i] = in.nextInt();
////        }
////        PrintStream outStream = System.out;
////        System.setOut(System.err);  5
////                                      1 -2 -8 4 5
//        int[] ts = {1, -2, -8, 4, 5};
////        int[] tsVacio = new int[0];
//        int solution = computeClosestToZero(ts);
////        System.setOut(outStream);
//        System.out.println(solution);
//    }
//    // #endregion


    /* Ignore and do not change the code below */
    // #region main
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ts = new int[n];
        for (int i = 0; i < n; i++) {
            ts[i] = in.nextInt();
        }
        PrintStream outStream = System.out;
        System.setOut(System.err);
        int solution = computeClosestToZero(ts);
        System.setOut(outStream);
        System.out.println(solution);
    }
    // #endregion

}
