package aufgabe_10_3D_Vektor;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args){
        Vektor_3D v1 = new Vektor_3D(1, 2, 1);
        Vektor_3D v2 = new Vektor_3D(2, 4, 1);

        Vektor_3D addErg = new Vektor_3D().add(v1, v2);
        System.out.println("\n\tAddition:");
        System.out.println("x: " + addErg.getX() + "\ny: " + addErg.getY() + "\nz: " + addErg.getZ());

        //Vektor_3D subtractErg = new Vektor_3D().subtract(v1, v2);
        System.out.println("\n\tSubtraktion:");
        System.out.println("x: " + Vektor_3D.subtract(v1, v2).getX() + "\ny: " + Vektor_3D.subtract(v1, v2).getY() + "\nz: " + Vektor_3D.subtract(v1, v2).getZ());

        Vektor_3D erg = Vektor_3D.berechneKreuzprodukt(v1, v2);
        System.out.println("\n\tKreuzprodukt:");
        System.out.println("x: " + erg.getX() + "\ny: " + erg.getY() + "\nz: " + erg.getZ());

        System.out.println("\n\tSkalarprodukt:");
        System.out.println(Vektor_3D.berechneSkalarprodukt(new Vektor_3D(2, -4, 0), new Vektor_3D(3, 2, 5)));

        System.out.println("\n\tBetrag:");
        System.out.println(Vektor_3D.berechneBetrag(new Vektor_3D(2, 4, 7)));

    }
}
