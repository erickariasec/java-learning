package geometric_figures;

public class Perimeter {

    // Create methods to calculate the perimeters of geometric figures

    // Create method to calculate Square´s Perimeter
    public double getSquarePerimeter(double squareSide){
        return 4*squareSide;
    }

    // Create method to calculate Triangle´s Perimeter
    public double getTrianglePerimeter(double triangleSide1, double triangleSide2, double triangleSide3){
        return triangleSide1 + triangleSide2 + triangleSide3;
    }

    // Create method to calculate Circle´s Perimeter
    public double getCirclePerimeter(double circleDiameter){
        return circleDiameter * Math.PI;
    }

    // Create method to calculate Rectangle´s Perimeter
    public double getRectanglePerimeter(double rectangleBase, double rectangleHeight){
        return (rectangleBase*2) + (rectangleHeight*2);
    }

}
