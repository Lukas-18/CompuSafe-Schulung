package aufgabe_11_Geometrische_Objekte;

import aufgabe_9_2D_Punkt.Punkt_2D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DreieckTest {

    private final double DELTA = 0.01;
    private Dreieck d = new Dreieck(new Punkt_2D(1, 1), new Punkt_2D(27, 1), new Punkt_2D(4, 32));

    @Test
    void berechneUmfang() {
        assertEquals(d.berechneUmfang(), 0.0, DELTA);
    }

    @Test
    void berechneFlaeche() {
        assertEquals(d.berechneFlaeche(), 403.0, DELTA);
    }
}