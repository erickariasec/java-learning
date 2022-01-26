package JavaBasics.S19_FinalWordJava.domain;

public final class Person {   // Person can't inherit to Child Classes because is final

    public final static int MY_CONSTANT = 1;

    public void prints(){   // If this Method were final, we could not modify its behavior at Child Classes
        System.out.println("Method prints");
    }
}
