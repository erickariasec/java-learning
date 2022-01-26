package JavaBasics.S20_ArrayManagementJava.test;

public class ArrayUse {
    public static void main(String[] args) {

        // REVIEWING ARRAYS

        int[] ages = new int[3];    // Creating an int array of 3 elements
        System.out.println("ages = " + ages);   // It will print the location in memory

        ages[0] = 10;   // The first position of an Array is 0
        ages[1] = 15;
        ages[2] = 20;

        System.out.println("ages at position 0 = " + ages[0]);
        System.out.println("ages at position 1 = " + ages[1]);
        System.out.println("ages at position 2 = " + ages[2]);

        System.out.println("\n\n");

        // DOING THE SAME BUT WITH BUCLE FOR
        for(int i = 0; i < ages.length; i++){
            System.out.println("ages at position " + i + " = " + ages[i]);
        }

        System.out.println("\n\n");

        // Array of Fruits
        String[] fruits = {"Apple", "Orange", "Banana", "Lemon", "Pear"};

        for(int i=0; i < fruits.length; i++){
            System.out.println("fruits at position " + i + " = " + fruits[i] +
                    " is Fruit N°" + (i+1));
        }

    }
}
