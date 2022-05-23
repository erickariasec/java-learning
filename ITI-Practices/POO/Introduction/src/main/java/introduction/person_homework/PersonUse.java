package introduction.person_homework;

public class PersonUse {
    public static void main(String[] args) {
        Person person1 = new Person("Erick", 23, 1.72);
        Person person2 = new Person("Carla", 25, 1.65);
        Person person3 = new Person("Andrea", 27, 1.57);

        System.out.println("Name: " + person1.getName() + " Age: " + person1.getAge() + " Height: " + person1.getHeight());
        System.out.println("Name: " + person2.getName() + " Age: " + person2.getAge() + " Height: " + person2.getHeight());
        System.out.println("Name: " + person3.getName() + " Age: " + person3.getAge() + " Height: " + person3.getHeight());
    }
}
