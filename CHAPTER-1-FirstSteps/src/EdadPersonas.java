/*
    Nombre: Erick Roberto Arias Sánchez
    CI: 1725044000
    Email: erickarias1999@hotmail.com
 */


import java.util.Scanner;

public class EdadPersonas {
    public static void main(String[] args) {

        String[] persona=new String[5];
        int [] edad=new int[5];

        // Inicializar variables
        int menorEdad=100;
        String personaMenor="";

        Scanner dataEntryPersona=new Scanner(System.in);
        Scanner dataEntryEdad=new Scanner(System.in);

        // Leer los nombres y edades de las 5 personas
        for(int i=0; i<5; i++) {
            System.out.println("Ingresa Nombre [" + (i + 1) + "]: ");
            persona[i] = dataEntryPersona.nextLine();
            System.out.println("Ingresa Edad de " + persona[i] + ": ");
            edad[i] = dataEntryEdad.nextInt();

            // Condicional para seleccionar a la persona con menor edad
            if (edad[i] < menorEdad) {
                menorEdad = edad[i];
                personaMenor = persona[i];
            }
        }

        System.out.println("\n" + personaMenor + " es la persona menor con "
                + menorEdad + " años!");
    }
}
