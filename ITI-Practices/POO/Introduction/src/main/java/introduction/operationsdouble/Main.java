package introduction.operationsdouble;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OperationDouble operation1 = new OperationDouble(8.4, 5.2);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        String name = sc.next();
        System.out.println("Te presento las operaciones "+name);
        operation1.showData();
    }
}
