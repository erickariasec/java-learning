/* @author: Erick Roberto Arias Sánchez */

package introduction.rent;

import java.util.ArrayList; // Importamos el paquete que contiene el ArrayList

public class RentAppUse {
    public static void main(String[] args) {
        
        // INSTANCIAMOS LAS CLASES
        Residence apartment1 = new Apartment("R. Stephenson S87-12 y J. Paez",
        13, "Quito", "Pichincha", "170102", 500.00);
        
        Residence house1 = new House("U. Jacobo S16-97 y T. West", "Cuenca", "Azuay",
        "121987", 800.00);
        
        ArrayList<Residence> unidadesDeAlquiler = new ArrayList<>(); // Creación del ArrayList
        
        // Añadimos objetos a nuestro ArrayList
        unidadesDeAlquiler.add(apartment1);
        unidadesDeAlquiler.add(house1);
        
        // Dependiendo de la instancia se imprimirá uno u otro valor
        for(Residence unidad : unidadesDeAlquiler) {
            if(unidad instanceof Apartment) {
                System.out.println("DEPARTAMENTO:");
            } else if (unidad instanceof House) {
                System.out.println("CASA:");
            }
            
            System.out.println(unidad); // Gracias al Polimorfismo, cada unidad actúa de diferente manera
            System.out.printf("$%,.2f\n\n", unidad.primerPago());
        }
    }
}
