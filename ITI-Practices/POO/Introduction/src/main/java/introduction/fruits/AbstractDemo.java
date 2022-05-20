package introduction.fruits;

public class AbstractDemo {
    
    public static void main(String[] args) {
        Apple a = new Apple("red");
        a.getFruitName("Apple");
        System.out.println("Fruit name: " + a.fruitName);
        System.out.println("Fruit color: " + a.color);
    }
}