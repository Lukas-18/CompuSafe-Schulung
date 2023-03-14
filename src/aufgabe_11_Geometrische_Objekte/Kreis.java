package aufgabe_11_Geometrische_Objekte;

import aufgabe_9_2D_Punkt.Punkt_2D;

public class Kreis implements GeometrischesObjekt{

    private Punkt_2D m = new Punkt_2D();
    private double r;

    public Kreis(Punkt_2D m, double r){
        this.m = m;
        this.r = r;
    }

    public Kreis(){
        this.m = new Punkt_2D(1, 1);
        this.r = 1.0;
    }

    @Override
    public double berechneUmfang() {
        double umfang = this.r * 2 * Math.PI;
        System.out.println("\n\tDer Kreis hat einen Umfang von: \n" + umfang);
        return umfang;
    }

    @Override
    public double berechneFlaeche() {
        double flaeche = this.r * this.r * Math.PI;
        System.out.println("\n\tDer Kreis hat eine Fläche von: \n" + flaeche);
        return flaeche;
    }

    @Override
    public void gibWerteAus() {
        System.out.println("\n\tRechteck mit den Werten: " + "\nMittelpunkt: " + this.m + "\nRadius: " + this.r);
    }
}
