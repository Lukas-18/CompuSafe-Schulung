package aufgabe_13_equals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {


    Person peter = new Person(20, "Peter", "Müller", 170, 75);
    Person klaus = new Person(20, "Klaus", "Müller", 170, 75);
    Person peterKopie = new Person(20, "Peter", "Müller", 170, 75);

    @Test
    void testEqualsFALSE() {
        assertNotEquals(peter, klaus);
    }

    @Test
    void testEqualsTRUE() {
        assertEquals(peter, peterKopie);
    }
}