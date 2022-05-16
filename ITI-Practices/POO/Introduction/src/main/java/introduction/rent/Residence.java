/* @author: Erick Roberto Arias Sánchez */

package introduction.rent;

public abstract class Residence { // Residence, además de ser la clase padre, es una clase Abstracta
    // ENCAPSULACIÓN DE ATRIBUTOS
    private String direccion;
    private String ciudad;
    private String provincia;
    private String codigoPostal;
    private double rentaMensual;
    protected final double IMPUESTO = 50.00;

    // MÉTODO CONSTRUCTOR
    public Residence(String direccion, String ciudad, String provincia,
            String codigoPostal, double rentaMensual) {
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.codigoPostal = codigoPostal;
        this.rentaMensual = rentaMensual;
    }

    // CREACIÓN DE GETTERS Y SETTERS
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public double getRentaMensual() {
        return rentaMensual;
    }

    public void setRentaMensual(double rentaMensual) {
        this.rentaMensual = rentaMensual;
    }
    
    public abstract double primerPago();

    // Las clases heredadas actuarán bajo el concepto de POLIMORFISMO
    @Override
    public String toString() {
        return "Direccion: " + direccion + ",\nCiudad: " + ciudad +
                ",\nProvincia: " + provincia + ",\nCodigo Postal: " + codigoPostal +
                ",\nRenta Mensual: " + rentaMensual + '}';
    }
}
