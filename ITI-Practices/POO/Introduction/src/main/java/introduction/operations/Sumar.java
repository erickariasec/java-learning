package introduction.operations;

/**
 *
 * @author erick
 */
public class Sumar {
    private int num1;   /* Atributo encapsulado para el primer número a sumar */
    private int num2;   /* Atributo encapsulado para el segundo número a sumar */
    
    public int sumarDosNumeros(){ /* Método para Sumar 2 Números */
        int resultado = num1 + num2;
        return resultado;
    }

    public void setNum1(int num1) { /* Setter para el número 1 */
        this.num1 = num1;
    }

    public void setNum2(int num2) { /* Setter para el número 2 */
        this.num2 = num2;
    }
}
