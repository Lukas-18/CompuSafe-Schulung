package aufgabe_18_hashCode_und_equals;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class HashCodeUndEqualsTest {

    HashCodeUndEquals person1 = new HashCodeUndEquals(20, "Max", "Musterman", 180, 80);
    HashCodeUndEquals person2 = new HashCodeUndEquals(20, "Max", "Musterman", 180, 80);


    Map<Integer, HashCodeUndEquals> hashmap = new HashMap<>();

    void init(){
        hashmap.put(1, person1);
        hashmap.put(2, person2);
    }


    @Test
    void testHashCode() {
        init();
        System.out.println(hashmap.get(1) + "\n" + hashmap.get(2));
        System.out.println(person1.hashCode() + "\n" + person2.hashCode());
        assertEquals(person1.hashCode(), person2.hashCode());
    }


}