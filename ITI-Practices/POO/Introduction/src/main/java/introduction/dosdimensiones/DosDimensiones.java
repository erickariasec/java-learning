package introduction.dosdimensiones;

//Creando una clase abstracta
//DosDimensiones.java
abstract class DosDimensiones{
     private double base;
     private double altura;
     private String nombre;
     //Constructor por defecto
    DosDimensiones(){
        base=altura=0.0;
        nombre="ninguno";
    }
    //Parametrizando constructor
    DosDimensiones(double b, double h, String n){
        base= b;
        altura= h;
        nombre=n;
    }
    //Construir objeto con misma base y altura
    DosDimensiones(double x, String n){
        base=altura=x;
        nombre=n;
    }
    //Construir un objeto desde un objeto
    DosDimensiones(DosDimensiones dd){
        altura=dd.altura;
        base=dd.base;
        nombre=dd.nombre;
    }
    //Métodos de acceso para base y altura
    double getBase(){return base;}
    double getAltura(){return altura;}
    void setBase(double b){base=b;}
    void setAltura(double h){altura=h;}
    String getNombre(){return nombre;}
    void mostrarDimension(){
        System.out.println("La base y la altura son: "+base+" y "+altura);
    }
    //Ahora, area() es abstracta
    abstract double area();
}