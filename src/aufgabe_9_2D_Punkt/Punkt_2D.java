package aufgabe_9_2D_Punkt;

public class Punkt_2D {

    private int x, y;

    public Punkt_2D(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Punkt_2D(){
        this(0, 0);
    }

    // getter & setter:
    public int getX(){
        return this.x;
    }
    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return this.y;
    }
    public void setY(int y){
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
    public void multiply(int multiplikator){
        this.x *= multiplikator;
        this.y *= multiplikator;
    }

    //skaliere kleiner, scale:
    public void divide(int multiplikator){
        this.x *= multiplikator;
        this.y *= multiplikator;
    }

    public String toString(){
        return "x, y: \n(" + this.x + ", " + this.y + ")";
    }

}
