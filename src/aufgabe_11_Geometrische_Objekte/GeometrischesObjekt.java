package aufgabe_11_Geometrische_Objekte;

public abstract class GeometrischesObjekt {

    abstract double berechneUmfang();
    abstract double berechneFlaeche();

    void gibWerteAus(){};

    protected double flaeche;
    private double umfang;

    public double getFlaeche() {
        return berechneFlaeche();
    }
    public void setFlaeche(double flaeche){
        this.flaeche = flaeche;
    }

    public double getUmfang(){
        return berechneUmfang();
    }

    public void setUmfang(double umfang){
        this.umfang = umfang;
    }
}
