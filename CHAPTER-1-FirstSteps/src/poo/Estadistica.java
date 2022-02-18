package poo;

public class Estadistica {
    public static void main(String[] args) {
        int N=896;
        double z=2.33;
        double e=0.04;
        double p=0.5;
        double q=0.5;

        double respuesta = ((Math.pow(z, 2) * p * q * N)/((N * (Math.pow(e, 2))) + (Math.pow(z, 2) * p * q)));

        System.out.println(respuesta);
    }
}
