package JavaBasics.S22_ClassDesignJava.ec.com.erickarias.sales;

public class Order {

    private int idOrder;
    private Product[] products;
    private static int orderCounter;
    private int productCounter;
    private static final int MAX_PRODUCTS = 10;

    public Order(){     // Constructor
        idOrder = ++Order.orderCounter;
        this.products = new Product[Order.MAX_PRODUCTS];    // Initialize Products Array
    }


}
