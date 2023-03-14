package aufgabe_11_Geometrische_Objekte;

import aufgabe_9_2D_Punkt.Punkt_2D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KreisTest {

    private final double DELTA = 0.01;
    private Punkt_2D m = new Punkt_2D(1, 1);
    private double r = 4;
    private Kreis k = new Kreis(m, r);

    @Test
    public void berechneUmfang(){
        assertEquals(k.berechneUmfang(), 25.13, DELTA);
    }

    @Test
    public void berechneFlaeche(){
        assertEquals(k.berechneFlaeche(), 50.26, DELTA);
    }
}