package introduction.dosdimensiones;

class Rectangulo extends DosDimensiones {
    //Constructor por defecto
    Rectangulo(){
        super();
    }
    //Constructor para Rectangulo
    Rectangulo(double b, double h){
        super(b,h,"Rectangulo");
    }
    //Un cuadrado
    Rectangulo(double x){
        super(x,"Rectangulo");
    }
    //Objeto desde un objeto
    Rectangulo(Rectangulo ob){
        super(ob);
    }
    boolean esCuadrado(){
        if (getAltura()==getBase()) return true;
        return false;
    }
    double area(){
        return getBase()*getAltura();
    }
}

