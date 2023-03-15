package aufgabe_15_CopyObjects;

import aufgabe_13_equals.Person;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CopyObjectsTest {
    CopyObjects copy3 = new CopyObjects(new Person(30, "Hans", "Glück", 175, 70), 3);

    @Test
    public void getList(){
        Person person = new Person(30, "Hans", "Glück", 175, 70);
        List<Person> l = new CopyObjects(person, 3).getList();
        for(Person p : l){
            assertEquals(person, p);
        }
    }
}