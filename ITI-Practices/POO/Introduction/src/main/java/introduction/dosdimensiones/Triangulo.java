package introduction.dosdimensiones;

class Triangulo extends DosDimensiones {
    private String estilo;
    //Constructor por defecto
    Triangulo(){
        super();
        estilo="ninguno";
    }
    Triangulo(String s, double b, double h){
        super(b,h,"Triangulo");  //Llama al constuctor de la superclase
        estilo=s;
    }
    //Constructor con un argumento
    Triangulo(double x){
        super(x,"Triangulo"); //Llama al constuctor de la superclase
        estilo="Estilo 1";
    }
    //Construir un objeto desde un objeto
    Triangulo(Triangulo t){
        super(t); //Pasa el objeto al constructor de DosDimensiones
        estilo=t.estilo;
    }
    double area(){
        return getAltura()*getBase()/2;
    }
    void mostrarEstilo(){
        System.out.println("El triángulo tiene: "+estilo);
    }
}
//Una subclase de DosDimensiones para Rectángulo
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
