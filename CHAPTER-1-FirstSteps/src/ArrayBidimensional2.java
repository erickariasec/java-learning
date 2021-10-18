public class ArrayBidimensional2 {
    public static void main(String[] args) {

        int [][] arrayBi={
                {15, 21, 18, 9, 15},
                {10, 52, 17, 19, 7},
                {19, 23, 19, 17, 7},
                {92, 13, 13, 32, 41}
        };

        for(int[]fila:arrayBi){
            System.out.println();
            for(int z:fila){
                System.out.print(z + " ");
            }

        }
    }
}
