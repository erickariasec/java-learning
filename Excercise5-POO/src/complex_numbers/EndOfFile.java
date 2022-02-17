package complex_numbers;

import java.util.*;

public class EndOfFile {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner dataEntry = new Scanner(System.in);

//        for(int i=1; dataEntry.hasNextLine(); i++){
//            System.out.println(i + " " + dataEntry.nextLine());
//        }

        int i = 1;
        while(dataEntry.hasNextLine()){
            System.out.println(i++ + " " + dataEntry.nextLine());
        }

    }
}
