package introduction.dosdimensiones;

public class Ejecutar {
    public static void main(String[] args) {

        DosDimensiones formas[] = {
        new Triangulo("Estilo 1", 8.0, 12.0),
        new Rectangulo(10),
        new Rectangulo(10, 4),
        new Triangulo(7.0)

        };

        for (int i = 0; i < formas.length; i++) {
        System.out.println("El objeto es: " + formas[i].getNombre());
        System.out.println("El área es: " + formas[i].area());

        System.out.println();
        }
    }
}
