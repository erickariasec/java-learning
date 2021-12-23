package poo.latecnologiaavanza;

public class OverloadExamplesUse {
    public static void main(String[] args) {

        // Execute Constructor Method 2
        OverloadExamples overloadMethod2 = new OverloadExamples(80, "Erick");

        int age = overloadMethod2.getMathAnswer(2021, 1999);
        System.out.println("You are " + age + " years old");

        int num = overloadMethod2.getMathAnswer();
        System.out.println("This num is the result of the operation " +
                "inside the GETTER: " + num);

        overloadMethod2.setGreet();
        overloadMethod2.setGreet("Carol");


        // Execute Constructor Method 1
        System.out.println("");
        OverloadExamples overloadMethod1 = new OverloadExamples(22);

        // Execute Constructor Method 3
        System.out.println("");
        OverloadExamples overloadMethod3 = new OverloadExamples(1.72);
    }
}
