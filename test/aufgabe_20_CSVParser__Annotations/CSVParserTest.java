package aufgabe_20_CSVParser__Annotations;

import aufgabe_13_equals.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CSVParserTest {

    CSVParser parser = new CSVParser();
    Person person1 = new Person(20, "Max", "Mustermann", 180, 70);
    Person person2 = new Person(30, "Anna", "Musterfrau", 180, 80);


    @Test
    void isParsable() {
        boolean actual = parser.isParsable(person1);
        boolean expected = true;

        assertEquals(actual, expected);
    }

    @Test
    void getFields() {
    }

    @Test
    void parse() {
    }

    @Test
    void generateCSVHeader() {
    }

    @Test
    void generateCSVContent() {
    }
}