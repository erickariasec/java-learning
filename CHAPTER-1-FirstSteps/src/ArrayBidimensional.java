public class ArrayBidimensional /*Two-Dimensional*/{
    public static void main(String[] args) {

        int [][] arrayBi=new int[4][5];

        arrayBi[0][0]=15;
        arrayBi[0][1]=21;
        arrayBi[0][2]=18;
        arrayBi[0][3]=9;
        arrayBi[0][4]=15;

        arrayBi[1][0]=10;
        arrayBi[1][1]=52;
        arrayBi[1][2]=17;
        arrayBi[1][3]=19;
        arrayBi[1][4]=7;

        arrayBi[2][0]=19;
        arrayBi[2][1]=23;
        arrayBi[2][2]=19;
        arrayBi[2][3]=17;
        arrayBi[2][4]=7;

        arrayBi[3][0]=92;
        arrayBi[3][1]=13;
        arrayBi[3][2]=13;
        arrayBi[3][3]=32;
        arrayBi[3][4]=41;

        for (int i=0; i<4; i++){
            System.out.println();
            for (int j=0; j<5; j++){
                System.out.print(arrayBi[i][j] + " ");
            }
        }

    }
}
