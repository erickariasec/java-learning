package JavaBasics.S22_ClassDesignJava.ec.com.erickarias.sales.test;

import JavaBasics.S22_ClassDesignJava.ec.com.erickarias.sales.*;

public class SalesUse {
    public static void main(String[] args) {

        // Instantiating Product Class
        Product product1 = new Product("T-Shirt", 50.00);
        Product product2 = new Product("Pants", 100.00);
        Product product3 = new Product("Shoes", 229.99);
        Product product4 = new Product("Hat", 49.99);

        // Instantiating Order Class
        Order order1 = new Order();
        order1.addProduct(product1);
        order1.addProduct(product2);
        order1.showOrder();

        System.out.println("\n\n");

        // Instantiating Order Class
        Order order2 = new Order();
        order2.addProduct(product4);
        order2.addProduct(product4);
        order2.addProduct(product3);
        order2.addProduct(product1);
        order2.showOrder();
    }
}
