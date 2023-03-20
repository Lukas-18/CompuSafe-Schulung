package aufgabe_22_Streams;

public class Tier {
    private String name;
    private int alter;
    private double gewicht;
    private int anzahlBeine;

    public Tier(String name, int alter, double gewicht, int anzahlBeine){
        this.name = name;
        this.alter = alter;
        this.gewicht = gewicht;
        this.anzahlBeine = anzahlBeine;
    }

    public Tier(){}

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAlter(){
        return this.alter;
    }
    public void setAlter(int alter){
        this.alter = alter;
    }

    public double getGewicht(){
        return this.gewicht;
    }
    public void setGewicht(double gewicht){
        this.gewicht = gewicht;
    }

    public int getAnzahlBeine(){
        return this.anzahlBeine;
    }
    public void setAnzahlBeine(int anzahlBeine){
        this.anzahlBeine = anzahlBeine;
    }

    @Override
    public String toString() {
        return "Tier{" +
                "name='" + name + '\'' +
                ", alter=" + alter +
                ", gewicht=" + gewicht +
                ", anzahlBeine=" + anzahlBeine +
                "}\n";
    }
}
