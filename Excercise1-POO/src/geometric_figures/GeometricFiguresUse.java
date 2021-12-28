package geometric_figures;

import java.util.Scanner;

public class GeometricFiguresUse {
    public static void main(String[] args) {

        Scanner dataEntry = new Scanner(System.in);

        Perimeter perimeter = new Perimeter();   //  Instantiate Perimeter Class
        Area area = new Area();    // Instantiate Area Class
        HeronLaw heronLaw = new HeronLaw();    // Instantiate HeronLaw Class
        int menuOption;

        do{
            // MAIN MENU OPTIONS
            System.out.println("\n\tMENU");
            System.out.println("1. Area\n2. Perimeter\n3. Heron´s Law\n4. Exit");
            System.out.print("Enter an option: ");
            menuOption = dataEntry.nextInt();

            switch (menuOption){
                // AREA MENU OPTIONS
                case 1:
                    System.out.println("\n\tAREA MENU");
                    System.out.println("1. Square\n2. Triangle\n3. Circle\n4. Rectangle");
                    System.out.print("Enter an option: ");
                    int areaOption = dataEntry.nextInt();

                    switch (areaOption){
                        // SQUARE AREA OPTION
                        case 1:
                            System.out.print("\nEnter the Square Side: ");
                            double squareSide = dataEntry.nextDouble();

                            double squareArea = area.getSquareArea(squareSide);
                            System.out.println("The area of the Square is " + squareArea);
                            break;

                        // TRIANGLE AREA OPTION
                        case 2:
                            System.out.print("\nEnter the Triangle Base: ");
                            double triangleBase = dataEntry.nextDouble();
                            System.out.print("Enter the Triangle Height: ");
                            double triangleHeight = dataEntry.nextDouble();

                            double triangleArea = area.getTriangleArea(triangleBase, triangleHeight);
                            System.out.println("The area of the Triangle is " + triangleArea);
                            break;

                        // CIRCLE AREA OPTION
                        case 3:
                            System.out.print("\nEnter the Circle Radius: ");
                            double circleRadius = dataEntry.nextDouble();

                            double circleArea = area.getCircleArea(circleRadius);
                            System.out.println("The area of the Circle is " + circleArea);
                            break;

                        // RECTANGLE AREA OPTION
                        case 4:
                            System.out.print("\nEnter the Rectangle Base: ");
                            double rectangleBase = dataEntry.nextDouble();
                            System.out.print("Enter the Rectangle Height: ");
                            double rectangleHeight = dataEntry.nextDouble();

                            double rectangleArea = area.getRectangleArea(rectangleBase, rectangleHeight);
                            System.out.println("The area of the Rectangle is " + rectangleArea);
                            break;

                        default:
                            System.out.println("\nOption not available, enter a valid option!");
                            break;
                    }

                    break;  // END AREA MENU

                // PERIMETER MENU OPTIONS
                case 2:
                    System.out.println("\n\tPERIMETER MENU");
                    System.out.println("1. Square\n2. Triangle\n3. Circle\n4. Rectangle");
                    System.out.print("Enter an option: ");
                    int perimeterOption = dataEntry.nextInt();

                    switch (perimeterOption) {
                        // SQUARE PERIMETER OPTION
                        case 1:
                            System.out.print("\nEnter the Square Side: ");
                            double squareSide = dataEntry.nextDouble();

                            double squarePerimeter = perimeter.getSquarePerimeter(squareSide);
                            System.out.println("The perimeter of the Square is " + squarePerimeter);
                            break;

                        // TRIANGLE PERIMETER OPTION
                        case 2:
                            System.out.print("\nEnter Triangle Side 1: ");
                            double triangleSide1 = dataEntry.nextDouble();
                            System.out.print("Enter Triangle Side 2: ");
                            double triangleSide2 = dataEntry.nextDouble();
                            System.out.print("Enter Triangle Side 3: ");
                            double triangleSide3 = dataEntry.nextDouble();

                            double trianglePerimeter = perimeter.getTrianglePerimeter(triangleSide1, triangleSide2, triangleSide3);
                            System.out.println("The perimeter of the Triangle is " + trianglePerimeter);
                            break;

                        // CIRCLE PERIMETER OPTION
                        case 3:
                            System.out.print("\nEnter Circle Diameter: ");
                            double circleDiameter = dataEntry.nextDouble();

                            double circlePerimeter = perimeter.getCirclePerimeter(circleDiameter);
                            System.out.println("The perimeter of the Circle is " + circlePerimeter);
                            break;

                        // RECTANGLE PERIMETER OPTION
                        case 4:
                            System.out.print("\nEnter Rectangle Base: ");
                            double rectangleBase = dataEntry.nextDouble();
                            System.out.print("Enter Rectangle Height: ");
                            double rectangleHeight = dataEntry.nextDouble();

                            double rectanglePerimeter = perimeter.getRectanglePerimeter(rectangleBase, rectangleHeight);
                            System.out.println("The perimeter of the Rectangle is " + rectanglePerimeter);
                            break;

                        default:
                            System.out.println("\nOption not available, enter a valid option!");
                            break;
                    }

                    break;  // END PERIMETER MENU

                // HERON LAW OPTION
                case 3:
                    double triangleSideA, triangleSideB, triangleSideC;
                    System.out.print("\nEnter Triangle Side A: ");
                    triangleSideA = dataEntry.nextDouble();
                    System.out.print("Enter Triangle Side B: ");
                    triangleSideB = dataEntry.nextDouble();
                    System.out.print("Enter Triangle Side C: ");
                    triangleSideC = dataEntry.nextDouble();

                    double triangleHeronLaw = heronLaw.getHeronLaw(triangleSideA, triangleSideB, triangleSideC);
                    System.out.println("The result of the Heron's Law is " + triangleHeronLaw);
                    break;   // END HERON LAW OPTION

                // EXIT OPTION
                case 4:
                    System.out.println("\nThanks for your participation!");
                    break;  // END EXIT MENU

                default:
                    System.out.println("\nOption not available!");
                    break;

            }   // END MAIN MENU OPTION

        }while(menuOption != 4);

    }
}
