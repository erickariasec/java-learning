package introduction.caja;

public class Box {
    // Attributes
    int width;
    int height;
    int depth;

    // Empty Constructor
    public Box(){
        System.out.println("Empty Constructor");
    }

    // Constructor with Parameters
    public Box(int width, int height, int depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to Calculate Volume of the Box
    public int calculateVolume(){
        return width * height * depth;
    }
}
