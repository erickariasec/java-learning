package poo.theoothoughtprocess;

public class CircleTOOTP extends ShapeTOOTP{

    double radius;
    public CircleTOOTP(double r) {
        radius = r;
    }

    public double getArea() {
        area = 3.14*(radius*radius);
        return (area);
    }

}
