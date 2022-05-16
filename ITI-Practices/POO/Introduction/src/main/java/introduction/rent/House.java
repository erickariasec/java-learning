/* @author: Erick Roberto Arias Sánchez */

package introduction.rent;

public class House extends Residence {

    private final double DEPOSITO_SEGURO = 200.00;
    
    public House(String direccion, String ciudad, String provincia, String codigoPostal, double rentaMensual) {
        super(direccion, ciudad, provincia, codigoPostal, rentaMensual);
    }
    
    public double primerPago(){
        return getRentaMensual() + IMPUESTO + DEPOSITO_SEGURO;
    }
}
