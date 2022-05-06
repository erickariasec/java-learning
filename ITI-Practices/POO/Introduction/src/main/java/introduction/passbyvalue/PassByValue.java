package introduction.passbyvalue;

public class PassByValue {
    public static void main(String[] args) {
        int x = 10;
        printValue(x);
        changeValue(x);
        printValue(x);
    }
    
    public static void changeValue (int i){
        i = 200;
    }
    
    public static void printValue(int arg){
        System.out.println("Received value: " + arg);
    }
}
