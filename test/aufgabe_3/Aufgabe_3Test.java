package aufgabe_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Aufgabe_3Test {
    // zu testende Zahlen: 0, 2, 13

    @Test
    public void shouldBeDivisibleByTwo(){
        int zahl = 2;
        int zahl2 = 0;

        assertTrue(Aufgabe_3.isDivisibleByTwo(zahl));
        assertTrue(Aufgabe_3.isDivisibleByTwo(zahl2));
    }

    @Test
    public void shouldNotBeDivisibleByTwo(){
        int zahl = 13;
        int zahl2 = 11_111;

        assertFalse(Aufgabe_3.isDivisibleByTwo(zahl));
        assertFalse(Aufgabe_3.isDivisibleByTwo(zahl2));
    }
}