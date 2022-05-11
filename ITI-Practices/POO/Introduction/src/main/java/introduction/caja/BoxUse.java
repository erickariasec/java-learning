package introduction.caja;

public class BoxUse {
    public static void main(String[] args) {
        // Instantiating Box Class with Constructor with Parameters
        Box box1 = new Box(3, 2, 6);  // Passing Arguments
        System.out.println("The volume of the box object is: " + box1.calculateVolume());
    }
}
