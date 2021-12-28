package board;

public class CartesianPlane {

    private int x;
    private int y;

    // CONSTRUCTOR METHOD
    public CartesianPlane(int x, int y){
        this.x = x;
        this.y = y;
    }

    // y+
    public void setUpMovement(int increaseValueY){
        y += increaseValueY;
    }

    // y-
    public void setDownMovement(int decrementValueY){
        y -= decrementValueY;
    }

    // x+
    public void setRightMovement(int increaseValueX){
        x += increaseValueX;
    }

    // x-
    public void setLeftMovement(int decrementValueX){
        x -= decrementValueX;
    }

    // GETTER X
    public int getX() {
        return x;
    }

    // GETTER Y
    public int getY() {
        return y;
    }
}
