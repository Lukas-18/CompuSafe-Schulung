package aufgabe_9_2D_Punkt;

public class Punkt_2D {

    private double x, y;

    public Punkt_2D(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Punkt_2D(){
        this(0, 0);
    }

    // getter & setter:
    public double getX(){
        return this.x;
    }
    public void setX(double x){
        this.x = x;
    }

    public double getY(){
        return this.y;
    }
    public void setY(double y){
        this.y = y;
    }

    //verschiebe, move:
    public void add(Punkt_2D punkt){
        this.x += punkt.x;
        this.y += punkt.y;
    }

    //verschiebe nach links/unten, move:
    public void subtract(Punkt_2D punkt){
        this.x += punkt.x;
        this.y += punkt.y;
    }

    //skaliere, scale:
    public void multiply(double multiplikator){
        this.x *= multiplikator;
        this.y *= multiplikator;
    }

    //skaliere kleiner, scale:
    public void divide(double multiplikator){
        this.x *= multiplikator;
        this.y *= multiplikator;
    }

    public String toString(){
        return "x, y: \n(" + this.x + ", " + this.y + ")";
    }

}
