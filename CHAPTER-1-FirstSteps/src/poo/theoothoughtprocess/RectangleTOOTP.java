package poo.theoothoughtprocess;

public abstract class RectangleTOOTP extends ShapeTOOTP{

    double length;
    double width;

    public RectangleTOOTP(double l, double w){
        length = l;
        width = w;
    }

    public double getArea() {
        area = length*width;
        return (area);
    }

}
