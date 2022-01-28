package JavaBasics.S22_ClassDesignJava.ec.com.erickarias.sales;

public class Product {
    private int productId;
    private String name;
    private double price;
    private static int productCounter;

    private Product(){
        productId = ++Product.productCounter;
    }

    public Product(String name, double price){
        this(); // Calls Empty Private Constructor
        this.name = name;
        this.price = price;
    }

    public int getProductId() {     // GETTER
        return productId;
    }

    public String getName() {   // GETTER
        return name;
    }

    public void setName(String name) {      // SETTER
        this.name = name;
    }

    public double getPrice() {      // GETTER
        return price;
    }

    public void setPrice(double price) {    // SETTER
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ProductId=" + productId +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
