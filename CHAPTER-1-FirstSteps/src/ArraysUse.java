public class ArraysUse {
    public static void main(String[] args) {

        /* int myArray2 []=new int [5]; It is possible to declare arrays in this way, but
        * this is not very common */

        /*int [] myArray=new int [5];

        myArray[0]=5;
        myArray[1]=38;
        myArray[2]=-15;             DIFFERENT WAY TO DECLARE AND INITIALIZE ARRAYS
        myArray[3]=92;
        myArray[4]=71;*/

        int [] myArray={5, 38, -15, 92, 46, 12, -99, 65, 77, 22, 27, 64, 89};

        for (int i=0; i<myArray.length; i++){   // Use .length to know the length of an entire array
            System.out.println("Index value " + i + " = " + myArray[i]);
        }

    }
}
