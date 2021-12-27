package geometric_figures;

public class HeronLaw {

    // Create methods to calculate the Heron´s Law

    // Create method to calculate Heron´s Law of the Triangle
    public double getHeronLaw(double triangleSideA, double triangleSideB, double triangleSideC){
        double triangleArea = (triangleSideA + triangleSideB + triangleSideC)/2;
        return Math.sqrt(triangleArea*((triangleArea-triangleSideA)*(triangleArea-triangleSideB)*(triangleArea-triangleSideC)));
    }

}