package aufgabe_11_Geometrische_Objekte;

import aufgabe_9_2D_Punkt.Punkt_2D;

public class Main {

    private static Punkt_2D a = new Punkt_2D(1, 1);
    private static Punkt_2D b = new Punkt_2D(7, 1);
    private static Punkt_2D c = new Punkt_2D(7, 5);
    private static Punkt_2D d = new Punkt_2D(1, 5);

    public static void main(String [] args){
        Rechteck r1 = new Rechteck(a, b, c, d);
        r1.gibWerteAus();
        r1.berechneUmfang();
        r1.berechneFlaeche();

        Dreieck d1 = new Dreieck(new Punkt_2D(1, 1), new Punkt_2D(27, 1), new Punkt_2D(4, 32));
        d1.berechneFlaeche();
        /*Dreieck d2 = new Dreieck(new Punkt_2D(1, 1), new Punkt_2D(4, 1), new Punkt_2D(4, 32));
        d2.berechneUmfang();*/

    }
}
