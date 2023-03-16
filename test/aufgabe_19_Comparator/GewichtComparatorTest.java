package aufgabe_19_Comparator;

import aufgabe_13_equals.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GewichtComparatorTest {
    Person person1 = new Person(20, "Max", "Musterman", 180, 70);
    Person person2 = new Person(22, "Anna", "Musterfrau", 180, 80);

    GewichtComparator gc = new GewichtComparator();

    @Test
    void compare() {
        assertEquals(-1, gc.compare(person1, person2));
    }
}