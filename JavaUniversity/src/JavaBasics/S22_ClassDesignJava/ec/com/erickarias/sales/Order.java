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

    public void addProduct(Product product){    // Method to Add Product
        if(productCounter < Order.MAX_PRODUCTS){    // Validate
            products[productCounter++] = product;
        } else {
            System.out.println("The maximum number of products has been exceeded: " + Order.MAX_PRODUCTS);
        }
    }

    public double calculateTotal(){     // Method to Calculate Total
        double total = 0;
        for (int i=0; i<this.productCounter; i++){
//            Product product = this.products[i];
//            total += product.getPrice();
            total += this.products[i].getPrice(); // It does the same as the two last lines.
        }
        return total;
    }

}
