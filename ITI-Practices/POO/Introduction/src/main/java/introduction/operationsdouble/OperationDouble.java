package introduction.operationsdouble;

public class OperationDouble {
    double num1;
    double num2;
    
    public OperationDouble(double _num1, double _num2){
        num1 = _num1;
        num2 = _num2;
    }
    
    public void showData(){
        System.out.println("El numero 1 es: " +num1);
        System.out.println("El numero 2 es: " +num2);
        System.out.println("La suma de los numeros es: " +(num1 +  num2));
        System.out.println("La resta de los numeros es: "+(num1 - num2));
        System.out.println("La multiplicacion de los numeros es: "+(num1 * num2));
    }
}


