package introduction.operations;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class Operaciones {
    public static void main(String[] args) {
        Sumar objetoSumar = new Sumar(); /* Creación del primer objeto que nos permite sumar 2 números */
        Restar objetoRestar = new Restar(); /* Creación del segundo objeto que nos permite restar 2 números */
        Multiplicar objetoMultiplicar = new Multiplicar(); /* Creación del tercer objeto que nos permite multiplicar 2 números */
        
        Scanner sc = new Scanner(System.in);    /* Creación de Scanner para leer datos por consola */
        
        System.out.println("PROGRAMA QUE SUMA, RESTA Y MULTIPLICA 2 NUMEROS");
        
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();    /* Leemos el primer número */
       
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();    /* Leemos el segundo número */
        
        objetoSumar.setNum1(num1);  /* Establecemos el número 1 a sumar */
        objetoSumar.setNum2(num2);  /* Establecemos el número 2 a sumar */
        objetoRestar.setNum1(num1); /* Establecemos el número 1 a restar */
        objetoRestar.setNum2(num2); /* Establecemos el número 2 a restar */
        objetoMultiplicar.setNum1(num1);  /* Establecemos el número 1 a multiplicar */
        objetoMultiplicar.setNum2(num2);  /* Establecemos el número 2 a multiplicar */
        
        System.out.println("El resultado de la suma es: " + objetoSumar.sumarDosNumeros());   /* Invocamos y concatenamos el método sumar */
        System.out.println("El resultado de la resta es: " + objetoRestar.restarDosNumeros());    /* Invocamos y concatenamos el método restar */
        System.out.println("El resultado de la multiplicacion es: " + objetoMultiplicar.multiplicarDosNumeros()); /* Invocamos y concatenamos el método multiplicar */
    }
}
