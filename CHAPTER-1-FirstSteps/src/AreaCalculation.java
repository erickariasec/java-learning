import javax.swing.*;
import java.util.*;

public class AreaCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner dataEntry=new Scanner(System.in);

		System.out.println("\t\t\t\t***AREA CALCULATION***\n");

		// CHOOSE OPTION MENU
		System.out.println("Choose an option: \n1. Square \n2. Rectangle \n3. Triangle " +
				"\n4. Circle \n\nEnter your option: ");

		// KEEP ANSWER
		int geometricFigure=dataEntry.nextInt();

		switch (geometricFigure){

			// SQUARE AREA
			case 1:
				int squareSide=Integer.parseInt(JOptionPane.showInputDialog("Enter the SIDE of the Square"));
				System.out.println("The AREA of the Square is " + Math.pow(squareSide, 2));
				break;

			// RECTANGLE AREA
			case 2:
				int rectangleBase=Integer.parseInt(JOptionPane.showInputDialog("Enter the BASE of the Rectangle"));
				int rectangleHeight=Integer.parseInt(JOptionPane.showInputDialog("Enter the HEIGHT of the Rectangle"));
				System.out.println("The AREA of the Rectangle is " + (rectangleBase*rectangleHeight));
				break;

			// TRIANGLE AREA
			case 3:
				int triangleBase=Integer.parseInt(JOptionPane.showInputDialog("Enter the BASE of the Triangle"));
				int triangleHeight=Integer.parseInt(JOptionPane.showInputDialog("Enter the HEIGHT of the Triangle"));
				System.out.println("The AREA of the Triangle is " + ((triangleBase*triangleHeight)/2));
				break;

			// CIRCLE AREA
			case 4:
				int circleRadius=Integer.parseInt(JOptionPane.showInputDialog("Enter the RADIUS of the Circle"));
				System.out.print("The AREA of the Circle is ");
				System.out.printf("%1.2f", ((Math.PI)*(Math.pow(circleRadius, 2))));
				break;

			default:
				System.out.println("INVALID OPTION, RESTART THE PROGRAM AND TRY AGAIN!");
		}
	}

}
