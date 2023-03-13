package aufgabe_10_3D_Vektor;

public class Vektor_3D {

    private double x;
    private double y;
    private double z;

    public Vektor_3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vektor_3D(){
        this(0, 0, 0);
    }

    public double getX(){
        return this.x;
    }
    public void setX(double x){
        this.x = x;
    }
    public double getY(){
        return this.y;
    }
    public void setY(double y){
        this.y = y;
    }
    public double getZ(){
        return this.z;
    }
    public void setZ(double z){
        this.z = z;
    }

    public static Vektor_3D add(Vektor_3D v1, Vektor_3D v2){
        //Vektor_3D v3 = new Vektor_3D(v1.getX() + v2.getX(), v1.getY() + v2.getY(), v1.getZ() + v2.getZ());
        return new Vektor_3D(v1.getX() + v2.getX(), v1.getY() + v2.getY(), v1.getZ() + v2.getZ());
    }

    public static Vektor_3D subtract(Vektor_3D v1, Vektor_3D v2){
        return new Vektor_3D(v1.getX() - v2.getX(), v1.getY() - v2.getY(), v1.getZ() - v2.getZ());
    }

    public static Vektor_3D berechneKreuzprodukt(Vektor_3D v1, Vektor_3D v2){
        Vektor_3D erg = new Vektor_3D();
        erg.setX(v1.getY() * v2.getZ() - v1.getZ() * v2.getY());
        erg.setY(v1.getZ() * v2.getX() - v1.getX() * v2.getZ());
        erg.setZ(v1.getX() * v2.getY() - v1.getY() * v2.getX());
        return erg;
    }

    public static double berechneSkalarprodukt(Vektor_3D v1, Vektor_3D v2){
        double erg = v1.getX() * v2.getX() + v1.getY() * v2.getY() + v1.getZ() * v2.getZ();
        return erg;
    }

    public static double berechneBetrag(Vektor_3D v1){
        double erg = Math.sqrt(v1.getX()*v1.getX() + v1.getY() * v1.getY() + v1.getZ() * v1.getZ());
        return erg;
    }



}
