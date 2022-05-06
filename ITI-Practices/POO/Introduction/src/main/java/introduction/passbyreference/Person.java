package introduction.passbyreference;

public class Person {
    String name;
    
    public void changeName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
}
