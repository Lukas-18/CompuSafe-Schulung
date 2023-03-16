package aufgabe_19_Comparator;

import aufgabe_13_equals.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GroesseComparatorTest {
    static Person person1 = new Person(20, "Max", "Musterman", 180, 80);
    static Person person2 = new Person(22, "Anna", "Musterfrau", 180, 80);

    static GroesseComparator gc = new GroesseComparator();

    @Test
    void compare() {
        Integer groessePerson1 = person1.getGroesseInCm();
        Integer groessePerson2 = person2.getGroesseInCm();
        System.out.println(person1.getVorname() + " ist " + groessePerson1 + "cm groß.");
        System.out.println(person1.getVorname() + " ist " + groessePerson2 + "cm groß.");
        assertEquals(0, gc.compare(groessePerson1, groessePerson2));
        System.out.println("wie erwartet 0.");
    }
}