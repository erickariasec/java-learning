package JavaBasics.S10_VariableScopeJava.Laboratory.Box;

public class BoxUse {
    public static void main(String[] args) {

        // Instantiating Box Class with Empty Constructor
        Box box1 = new Box();
        box1.width = 3;
        box1.height = 2;
        box1.depth = 6;
        int volume = box1.calculateVolume();
        System.out.println("The volume of the first box object is: " + volume);

        // Instantiating Box Class with Constructor with Parameters
        Box box2 = new Box(2, 4, 6);  // Passing Arguments
        System.out.println("The volume of the second box object is: " + box2.calculateVolume());
    }
}
