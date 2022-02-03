package FunctionsJava;

public class VarargsJava {
    public static void main(String[] args) {

        System.out.println(sum("Erick",5,10,15,20,25,30));  // I could add a lot of Attribute Numbers
                                                             // and it will sum everything

        System.out.println(sum(2.5, 3.6, 18.3, 20.02)); // I could continue adding more double Attributes
                                                                 // and it will sum everything
    }


              // Undefined Parameters
    static int sum(String name, int... numbers){    // Add 3 ellipses to add a quantity of numbers that I don't know
        System.out.println("The sum of " + name + " is:");   // When we want to add different parameters, they must go first
        int sum = 0;
        for(int num : numbers){     // For each num of numbers Array
            sum += num;
        }
//        for(int i=0; i < numbers.length; i++){    // It is the same with normal bucle form
//            sum += numbers[i];
//        }
        return sum;
    }

    static double sum(double... numbers){   // This is called Varargs
        double sum = 0;
        for(double num : numbers){
            sum += num;
        }
        return sum;
    }

}
