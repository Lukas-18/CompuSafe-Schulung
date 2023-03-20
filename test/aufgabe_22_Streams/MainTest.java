package aufgabe_22_Streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private List<Tier> tiere;
    private Tier elefant;
    private Tier giraffe;
    private Tier loewe;
    private Tier vogel;
    private Tier gepard;

    @BeforeEach // dadurch muss nicht in jeder Methode init() aufgerufen werden.
    private void init(){
        tiere      = new ArrayList<>();
        elefant    = new Tier("Elefant", 11, 730, 4);
        giraffe    = new Tier("Giraffe", 4, 120, 4);
        loewe      = new Tier("Löwe", 10, 310, 4);
        vogel      = new Tier("Vogel", 6, 4, 2);
        gepard     = new Tier("Gepard", 2, 110, 4);

        tiere.add(elefant);
        tiere.add(giraffe);
        tiere.add(loewe);
        tiere.add(vogel);
        tiere.add(gepard);
    }

    @Test
    void getTiereMitZweiBeinen() {
        List<Tier> actual   = Main.getTiereMitZweiBeinen(tiere);
        List<Tier> expected = new ArrayList<>();
        expected.add(vogel);
        assertEquals(expected, actual);
    }

    @Test
    void getTiereUeber10() {
        List<Tier> actual = Main.getTiereUeber10(tiere);
        List<Tier> expected = new ArrayList<>();
        expected.add(elefant);
        assertEquals(expected, actual);
    }

    @Test
    void streamGetTiereMitZweiBeinen() {
        List<Tier> actual = Main.streamGetTiereMitZweiBeinen(tiere);
        List<Tier> expected = new ArrayList<>();
        expected.add(vogel);
        assertEquals(expected, actual);
    }

    @Test
    void streamGetTiereUeber10() {
        List<Tier> actual = Main.streamGetTiereUeber10(tiere);
        List<Tier> expected = new ArrayList<>();
        expected.add(elefant);
        assertEquals(expected, actual);
    }

    @Test
    void streamGetSchwereUndJungeTiere() {
        double gewicht = 60.0;
        int alter = 7;
        List<Tier> actual = Main.streamGetSchwereUndJungeTiere(tiere, gewicht, alter);
        List<Tier> expected = new ArrayList<>();
        expected.add(giraffe);
        expected.add(gepard);
        assertEquals(expected, actual);
    }
}