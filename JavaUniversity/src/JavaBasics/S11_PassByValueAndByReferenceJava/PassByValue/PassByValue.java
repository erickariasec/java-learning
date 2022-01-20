package JavaBasics.S11_PassByValueAndByReferenceJava.PassByValue;

public class PassByValue {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("x = " + x);

        changeValue(x);

        System.out.println("x new value = " + x);
    }

    public static void changeValue(int xNew){
        System.out.println("xNew = " + xNew);
        xNew = 15; // This method could not modify value of original variable, so it will print '10'
    }
}
