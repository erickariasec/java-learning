public class ArrayExample2D {
    public static void main(String[] args) {

        double accumulated;
        double interest=0.10;
        //                           rows|columns
        double [][] balance=new double[6][5];

        System.out.print("CAPITAL\t\t1ST YEAR\t2ND YEAR\t3RD YEAR\t4TH YEAR");

        for(int i=0; i<6; i++){     // With this bucle we run the first dimension
            balance[i][0]=10000; // i will change but array [0] will be always 10000
            accumulated=10000; // This variable will be increasing gradually

            for(int j=1; j<5; j++){   // This begins in 1 because j=0 we already fill it
                accumulated=(accumulated+(accumulated*interest));
                balance[i][j]=accumulated;
            }
            interest=interest+0.01; // Each time the main for loop finishes, the interest will increase 1%
        }

        for(int i=0; i<6; i++){
            System.out.println();
            for(int j=0; j<5; j++){
                System.out.printf("%1.2f\t", balance[i][j]);
            }
        }

    }
}

