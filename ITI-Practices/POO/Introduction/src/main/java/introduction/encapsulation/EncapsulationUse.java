package introduction.encapsulation;

public class EncapsulationUse {
    public static void main(String[] args) {
        Encapsulation enc1 = new Encapsulation("Erick");
        Encapsulation enc2 = new Encapsulation("Carlos");
        
        System.out.println(enc1.getName());
        System.out.println(enc2.getName());
    }
}
