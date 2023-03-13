package aufgabe_9_2D_Punkt;

public class Main {

    public static void main (String[] args){
        Punkt_2D punkt = new Punkt_2D(2, 2);
        print(punkt);
        punkt.add(new Punkt_2D(2, 2));
        print(punkt);
    }

    private static void print(Punkt_2D p){
        System.out.println(p.toString());
    }
}
