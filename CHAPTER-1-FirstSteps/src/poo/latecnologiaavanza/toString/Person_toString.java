package poo.latecnologiaavanza.toString;

public class Person_toString {

    public String name = "Roberto";
    public int age = 22;
    public double height = 1.72;

    @Override
    public String toString() {
        return "Person_toString{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {
        Person_toString person = new Person_toString();
        String data = person.toString();
        System.out.println(data);
    }

}

