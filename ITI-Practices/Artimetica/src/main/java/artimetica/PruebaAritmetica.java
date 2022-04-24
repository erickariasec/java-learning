package artimetica;

import java.util.Scanner;

/**
 *
 * @author Erick Roberto Arias Sánchez
 */
public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica a = new Aritmetica();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa el primer numero: ");
        int num1 = sc.nextInt();
        
        System.out.println("Ingresa el segundo numero: ");
        int num2 = sc.nextInt();
        
        a.setNum1(num1);
        a.setNum2(num2);
        
        System.out.println("El resultado de la suma es: " + a.sumar());
    }
}