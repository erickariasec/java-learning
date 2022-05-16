/* @author: Erick Roberto Arias Sánchez */

package introduction.rent;

public class Apartment extends Residence {
    
    private int numeroDepartamento;

    public Apartment(String direccion, int numeroDepartamento, String ciudad, String provincia,
            String codigoPostal, double rentaMensual) {
        super(direccion, ciudad, provincia, codigoPostal, rentaMensual);
        this.numeroDepartamento = numeroDepartamento;
    }

    public int getNumeroDepartamento() {
        return numeroDepartamento;
    }

    public void setNumeroDepartamento(int numeroDepartamento) {
        this.numeroDepartamento = numeroDepartamento;
    }
    
    public double primerPago(){
        return getRentaMensual() + IMPUESTO + (getRentaMensual() / 2);
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nNumero Departamento: " + numeroDepartamento;
    }
}
