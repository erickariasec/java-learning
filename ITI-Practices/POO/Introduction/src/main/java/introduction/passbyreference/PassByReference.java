package introduction.passbyreference;

public class PassByReference {
    public static void main(String[] args) {
        Person p = new Person();
        p.changeName("Juan");
        printName(p);
        modifyPerson(p);
        printName(p);
    }
    
    public static void modifyPerson(Person arg){
        arg.changeName("Carlos");
    }
    
    public static void printName(Person p){
        System.out.println("Received value: " + p.getName());
    }
}
