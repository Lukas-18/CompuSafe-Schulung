package aufgabe_19_Comparator;

import aufgabe_13_equals.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlterComparatorTest {
    Person person1 = new Person(20, "Max", "Musterman", 180, 80);
    Person person2 = new Person(22, "Anna", "Musterfrau", 180, 80);

    AlterComparator ac = new AlterComparator();

    @Test
    void compare() {
        Integer alterPerson1 = person1.getAlter();
        Integer alterPerson2 = person2.getAlter();
        System.out.println(person1.getVorname() + " ist " + alterPerson1);
        System.out.println(person2.getVorname() + " ist " + alterPerson2);
        assertEquals(-1, ac.compare(alterPerson1, alterPerson2));
        System.out.println("wie erwartet -1.");
    }
}