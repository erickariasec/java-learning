package JavaBasics.S23_FinalLaboratory.MundoPC.ec.com.erickarias.mundopc;

public class Order {
    private final int orderID;
    private final Computer[] computers;
    private static int orderCounter;
    private static final int MAX_COMPUTERS = 10;
    private int counterComputers;   // To know how many Computer Objects has been added to the Array

    public Order(){     // Empty Constructor
        this.orderID = ++Order.orderCounter;    // Increment with each order object
        computers = new Computer[Order.MAX_COMPUTERS];  // Initialize Computers Array
    }

    public void addComputer(Computer computer){     // Method to Add Computer
        if(this.counterComputers < Order.MAX_COMPUTERS){    // To Validate
            this.computers[this.counterComputers++] = computer; // Add new element, at first moment it assigns the
                                                                // value, and after that, this will increment
        } else{
            System.out.println("You have exceeded the limit: " + Order.MAX_COMPUTERS);
        }
    }

    public void showOrder(){        // Method to Show Order
        System.out.println("Order #" + this.orderID);
        System.out.println("Computers of the Order #" + this.orderID);
        for(int i=0; i<this.counterComputers; i++){
            System.out.println(computers[i]); // It will Print Object Computer with toString Method
        }
    }

}
