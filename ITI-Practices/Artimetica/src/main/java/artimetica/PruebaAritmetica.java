package artimetica;

import java.util.Scanner;

/**
 *
 * @author Erick Roberto Arias Sánchez
 */
public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica a = new Aritmetica();
        
        int num1;
        int num2;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa el primer numero: ");
        num1 = sc.nextInt();
        
        System.out.println("Ingresa el segundo numero: ");
        num2 = sc.nextInt();
        
        a.setNum1(num1);
        a.setNum2(num2);
        
        System.out.println("El resultado de la suma es: " + a.sumar());
    }
}
