package aufgabe_11_Geometrische_Objekte;

import aufgabe_9_2D_Punkt.Punkt_2D;

public class Dreieck extends GeometrischesObjekt{

    private Punkt_2D a;
    private Punkt_2D b;
    private Punkt_2D c;

    public Dreieck(Punkt_2D a, Punkt_2D b, Punkt_2D c){
        this.a = a;
        this.b = b;
        this.c = c; // höchster Punkt
    }

    public Dreieck(){
        this(
                new Punkt_2D(0, 0),
                new Punkt_2D(0, 0),
                new Punkt_2D(0, 0)
        );
    }

    private double berechneSeiteAB(){
        return this.b.getX() - this.a.getX();
    }

    private double berechneSeiteBC(){
        return this.c.getY() - this.b.getY();
    }

    private double berechneSeiteAC(){
        return this.c.getY() - this.a.getY();
    }

    private double berechneHoehe(){
        return this.c.getY() - this.b.getY();
    }

    @Override
    public double berechneUmfang() {
        double seiteAB = berechneSeiteAB();
        double seiteBC = berechneSeiteBC();
        double seiteAC = berechneSeiteAC();
        double umfang = seiteAB + seiteBC + seiteAC;
        System.out.println("\n\tDas Dreieck hat einen Umfang von: \n" + umfang);
        return umfang;
    }

    @Override
    public double berechneFlaeche() {
        double flaeche = berechneSeiteAB() * 0.5 * berechneHoehe();
        System.out.println("\n\tDas Dreieck hat eine Fläche von: \n" + flaeche);
        return flaeche;
    }

    @Override
    public void gibWerteAus() {
        System.out.println("\n\tDreieck mit den Werten: " + "\na: " + this.a + "\nb: " + this.b + "\nc: " + this.c);
    }
}
