package aufgabe_10_3D_Vektor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vektor_3DTest {

    private static final double DELTA = 0.01;
    private Vektor_3D v1 = new Vektor_3D(1, 2, 1);
    private Vektor_3D v2 = new Vektor_3D(2, 4, 1);

    @Test
    void add() {
        assertEquals(Vektor_3D.add(v1, v2).getX(), 3.0, DELTA);
        assertEquals(Vektor_3D.add(v1, v2).getY(), 6.0, DELTA);
        assertEquals(Vektor_3D.add(v1, v2).getZ(), 2.0, DELTA);
    }

    @Test
    void subtract() {
        assertEquals(Vektor_3D.subtract(v1, v2).getX(), -1.0, DELTA);
        assertEquals(Vektor_3D.subtract(v1, v2).getY(), -2.0, DELTA);
        assertEquals(Vektor_3D.subtract(v1, v2).getZ(), 0.0, DELTA);
    }

    @Test
    void berechneKreuzprodukt() {
        assertEquals(Vektor_3D.berechneKreuzprodukt(v1, v2).getX(), -2.0, DELTA);
        assertEquals(Vektor_3D.berechneKreuzprodukt(v1, v2).getY(), 1.0, DELTA);
        assertEquals(Vektor_3D.berechneKreuzprodukt(v1, v2).getZ(), 0.0, DELTA);
    }

    @Test
    void berechneSkalarprodukt() {
        assertEquals(Vektor_3D.berechneSkalarprodukt(new Vektor_3D(2, -4, 0), new Vektor_3D(3, 2, 5)), -2.0, DELTA);
    }

    @Test
    void berechneBetrag() {
        assertEquals(Vektor_3D.berechneBetrag(new Vektor_3D(2, 4, 7)), 8.31, DELTA);
    }
}