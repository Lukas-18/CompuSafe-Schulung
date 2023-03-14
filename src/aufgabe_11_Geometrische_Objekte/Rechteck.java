package aufgabe_11_Geometrische_Objekte;

import aufgabe_9_2D_Punkt.Punkt_2D;

public class Rechteck extends GeometrischesObjekt{

    private Punkt_2D a;
    private Punkt_2D b;
    private Punkt_2D c;
    private Punkt_2D d;

    public Rechteck(Punkt_2D a, Punkt_2D b, Punkt_2D c, Punkt_2D d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Rechteck(){
        this(
                new Punkt_2D(0, 0),
                new Punkt_2D(0, 0),
                new Punkt_2D(0, 0),
                new Punkt_2D(0, 0)
        );
    }

    public double berechneSeiteAB(){
        return this.b.getX() - this.a.getX();
    }

    public double berechneSeiteBC(){
        return this.c.getY() -this.b.getY();
    }

    @Override
    public double berechneUmfang(){
        double seiteAB = berechneSeiteAB();
        double seiteBC = berechneSeiteBC();
        double umfang = 2 * seiteAB + 2 * seiteBC;
        System.out.println("\n\tDas Rechteck hat einen Umfang von: \n" + umfang);
        return umfang;
    }

    @Override
    public double berechneFlaeche(){
        double flaeche = berechneSeiteAB() * berechneSeiteBC();
        System.out.println("\n\tDas Rechteck hat eine Fläche von: \n" + flaeche);
        return flaeche;
    }

    @Override
    public void gibWerteAus(){
        System.out.println("\n\tRechteck mit den Werten: " + "\na: " + this.a + "\nb: " + this.b + "\nc: " + this.c + "\nd: " + this.d);
    }
}
