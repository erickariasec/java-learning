package equation;

public class Roots {

    private double a;
    private double b;
    private double c;

    // CONSTRUCTOR METHOD
    public Roots(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double getDiscriminant(){
        //                  √b^2 - 4ac
        return Math.sqrt(Math.pow(b, 2) - (4*a*c));
    }

    private void setRoots(){
        double x1 = (-b + getDiscriminant())/(2*a);
        double x2 = (-b - getDiscriminant())/(2*a);

        System.out.println("\nThe solution (x1) is: " + x1);
        System.out.println("The solution (x2) is: " + x2);
    }

    private void setOnlyRoot(){
        double onlySolution = -b/2*a;
        System.out.println("The only solution is: " + onlySolution);
    }

    private boolean areRoots(){
        return getDiscriminant() > 0;
    }

    private boolean isOnlyRoot(){
        return getDiscriminant() == 0;
    }

    public void setSolution(){
        if(areRoots()){
            setRoots();
        }
        else if (isOnlyRoot()){
            setOnlyRoot();
        }
        else{
            System.out.println("There is no solution!");
        }
    }

}
