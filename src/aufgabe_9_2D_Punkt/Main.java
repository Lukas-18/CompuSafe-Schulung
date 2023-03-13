package aufgabe_9_2D_Punkt;

public class Main {

    public static void main (String[] args){
        /*
        Punkt_2D punkt = new Punkt_2D(2, 2);
        print(punkt);
        punkt.add(new Punkt_2D(2, 2));
        print(punkt);
        */
        Punkt_2D p1 = new Punkt_2D(2, 2);
        Punkt_2D p2 = new Punkt_2D(3, 3);

        Punkt_2D addedPunkt = Punkt_2D_Utils.add(p1, p2);
        print(addedPunkt);
    }

    private static void print(Punkt_2D p){
        System.out.println(p.toString());
    }
}
