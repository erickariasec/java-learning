package JavaBasics.S21_MatrixHandlingJava.test;

// MATRIX is an Array of Arrays

public class MatrixUse {                        //      COLUMNS  COLUMNS
    public static void main(String[] args) {    //      _________________
                        //    x   y               LINES |_______|_______|
                        // lines columns          LINES |_______|_______|
        int[][] ages = new int[3][2];     //      LINES |_______|_______|

        System.out.println("ages = " + ages + "\n\n"); // It will show ages memory location

        ages[0][0] = 5;
        ages[0][1] = 7;
        ages[1][0] = 8;
        ages[1][1] = 4;
        ages[2][0] = 6;
        ages[2][1] = 9;

        System.out.println("ages at position [0][0] = " + ages[0][0]);
        System.out.println("ages at position [0][1] = " + ages[0][1]);
        System.out.println("ages at position [1][0] = " + ages[1][0]);
        System.out.println("ages at position [1][1] = " + ages[1][1]);
        System.out.println("ages at position [2][0] = " + ages[2][0]);
        System.out.println("ages at position [2][1] = " + ages[2][1]);

    }
}
