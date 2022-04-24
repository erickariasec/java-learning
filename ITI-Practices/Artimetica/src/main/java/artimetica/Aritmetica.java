package artimetica;

/**
 *
 * @author Erick Roberto Arias Sánchez
 */
public class Aritmetica {
    private int num1;
    private int num2;
    
    public int sumar(){
        int result = num1+num2;
        return result;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}