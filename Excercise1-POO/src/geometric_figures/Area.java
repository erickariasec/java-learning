package geometric_figures;

public class Area {

    // Create methods to calculate the areas of geometric figures

    // Create method to calculate Square´s Area
    public double getSquareArea(double squareSide){
        return Math.pow(squareSide, 2);
    }

    // Create method to calculate Triangle´s Area
    public double getTriangleArea(double triangleBase, double triangleHeight){
        return (triangleBase*triangleHeight)/2;
    }

    // Create method to calculate Circle´s Area
    public double getCircleArea(double circleRadius){
        return Math.PI*(Math.pow(circleRadius, 2));
    }

    // Create method to calculate Rectangle´s Area
    public double getRectangleArea(double rectangleBase, double rectangleHeight){
        return rectangleBase*rectangleHeight;
    }

}
