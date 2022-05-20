package introduction.fruits;

abstract class Fruits {
    String fruitName;
    String color;
    
    Fruits(String color) {
        this.color = color;
        System.out.println("Fruits constructor");
    }
    
    // Abstract Method
    abstract void taste();
    
    // Non-Abstract Method
    public void getFruitName(String fruit) {
        this.fruitName = fruit;
    }
}

class Apple extends Fruits {
    Apple(String color) {
        super(color);
        System.out.println("Apple constructor");
    }
    @Override
    void taste() {
        System.out.println("Sweet taste");
    }
}