package JavaBasics.S21_MatrixHandlingJava.test;

// MATRIX is an Array of Arrays

import JavaBasics.S21_MatrixHandlingJava.domain.Person;

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

        System.out.println("\n\n");

        /* ----> DEBUG TO SEE WHAT IS HAPPENING INSIDE BUCLE FOR <---- */

        // DOING THE SAME WITH BUCLE FOR
        for(int line = 0; line < ages.length; line++){
            for(int column = 0; column < ages[line].length; column++){
                System.out.println("ages at position [" + line + "][" + column + "] = " + ages[line][column]);
            }
        }

        System.out.println("\n");

        /* ----> DEBUG TO SEE WHAT IS HAPPENING INSIDE BUCLE FOR <---- */

        // ANOTHER WAY USING BUCLE FOR
        for(int line = 0; line < ages.length; line++){
            System.out.println();
            for(int column = 0; column < ages[line].length; column++){
                System.out.print(ages[line][column] + " ");
            }
        }

        System.out.println("\n");

        /* ----> DEBUG TO SEE WHAT IS HAPPENING INSIDE BUCLE FOR <---- */

        // ANOTHER WAY USING BUCLE FOR WITH VARIABLES i AND j
        for(int i = 0; i < 3; i++){     // 3 refers to the number of lines
            System.out.println();
            for(int j = 0; j < 2; j++){     // 2 refers to the number of columns
                System.out.print(ages[i][j] + " ");
            }
        }

        System.out.println("\n");

        /* ----> DEBUG TO SEE WHAT IS HAPPENING INSIDE BUCLE FOR <---- */

        // ANOTHER WAY USING BUCLE FOR SHOWING POSITION
        for(int line = 0; line < ages.length; line++){
            System.out.println();
            for(int column = 0; column < ages[line].length; column++){
                System.out.print("ages at position [" + line + "][" + column + "] = " + ages[line][column] + "\t\t");
            }
        }


        // CREATE A MATRIX OF FRUITS

        System.out.println("\n");

        // It is not required to be a square matrix
        String[][] fruits = {{"Watermelon", "Lemon"}, {"Strawberry", "Orange", "Pear", "Grape"},  {"Pineapple", "Apple"}};

        /* ----> DEBUG TO SEE WHAT IS HAPPENING INSIDE BUCLE FOR <---- */

        System.out.println("-----> PRINTING fruits MATRIX using METHOD prints:");

        prints(fruits); //  It will call Method prints that contains for loop

        System.out.println("\n");

        /* ----> DEBUG TO SEE WHAT IS HAPPENING INSIDE BUCLE FOR <---- */

        for(int line = 0; line < fruits.length; line++){
            System.out.println();
            for(int column = 0; column < fruits[line].length; column++){
                System.out.print("fruits at position [" + line + "][" + column + "] = " + fruits[line][column] + "\t\t\t");
            }
        }

        System.out.println("\n");

        // Create a Matrix of Objects of Person
        Person[][] persons = new Person[2][3];  // To see information is necessary that Person Class
                                                // has Method toString

        persons[0][0] = new Person("Kiki");
        persons[0][1] = new Person("Sara");
        persons[0][2] = new Person("Lis");
        persons[1][0] = new Person("Nicole");
        persons[1][1] = new Person("Angie");
        persons[1][2] = new Person("Cami");

        prints(persons); // //  It will call Method prints that contains for loop
    }


    // CREATING METHOD TO PRINT MATRIX
    public static void prints(Object[][] matrix){   // Works with Object Matrix
        for(int line = 0; line < matrix.length; line++){
            System.out.println();
            for(int column = 0; column < matrix[line].length; column++){
                System.out.print(matrix[line][column] + "\t\t\t");
            }
        }
    }
}
