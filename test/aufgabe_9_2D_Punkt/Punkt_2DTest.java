package aufgabe_9_2D_Punkt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Punkt_2DTest {

    private static final double DELTA = 0.01;
    private Punkt_2D p1;
    private Punkt_2D p2;
    @BeforeEach
    public void initPunkte(){
        p1 = new Punkt_2D(4.0, 4.0);
        p2 = new Punkt_2D(2.0, 2.0);
    }

    @Test
    public void add(){
        //3. parameter DELTA gibt an auf wie viele Nachkommastellen geprüft werden soll / Genauigkeit
        p1.add(p2);
        assertEquals(p1.getX(), 6.0, DELTA);
        assertEquals(p1.getY(), 6.0, DELTA);
    }

    @Test
    public void subtract(){
        p1.subtract(p2);
        assertEquals(p1.getX(), 2, 0.01);
        assertEquals(p1.getY(), 2, 0.01);
    }

    @Test
    public void multiply(){
        p1.multiply(10.0);
        assertEquals(p1.getX(), 40);
        assertEquals(p1.getY(), 40);
    }

    @Test
    public void divide(){
        p1.divide(4);
        assertEquals(p1.getX(), 1, DELTA);
        assertEquals(p1.getY(), 1, DELTA);
    }

}