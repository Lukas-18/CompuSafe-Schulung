package aufgabe_11_Geometrische_Objekte;

import aufgabe_9_2D_Punkt.Punkt_2D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RechteckTest {

    private static final double DELTA = 0.01;
    private Punkt_2D a = new Punkt_2D(1, 1);
    private Punkt_2D b = new Punkt_2D(7, 1);
    private Punkt_2D c = new Punkt_2D(7, 5);
    private Punkt_2D d = new Punkt_2D(1, 5);
    private Rechteck r1 = new Rechteck(a, b, c, d);

    @Test
    public void berechneUmfang(){
        assertEquals(r1.berechneUmfang(), 20.0, DELTA);
    }

    @Test
    public void berechneFlaeche(){
        assertEquals(r1.berechneFlaeche(), 24.0, DELTA);
    }

}