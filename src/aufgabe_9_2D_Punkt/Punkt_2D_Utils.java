package aufgabe_9_2D_Punkt;

public class Punkt_2D_Utils {

    public static Punkt_2D add(Punkt_2D p1, Punkt_2D p2){
        Punkt_2D p3 = new Punkt_2D();
        p3.setX(p1.getX() + p2.getX());
        p3.setY(p1.getY() + p2.getY());
        return p3;
    }
}
