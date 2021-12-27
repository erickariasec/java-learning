package geometric_figures;

import java.util.Scanner;

public class GeometricFiguresUse {
    public static void main(String[] args) {

        Scanner dataEntry = new Scanner(System.in);

        Perimeter perimeter = new Perimeter();
        Area area = new Area();

        int option = 0;

        do{
            System.out.println("\n\tMENU");
            System.out.println("1. Area\n2. Perimeter\n3. Heron´s Law\n4. Exit");
            System.out.println("Enter");
        }while(option != 4);

    }
}