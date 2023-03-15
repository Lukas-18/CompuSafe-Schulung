package aufgabe_16_GenerischerArrayWrapper;

import aufgabe_14_ArrayWrapper.ArrayWrapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerischerArrayWrapperTest {

    GenerischerArrayWrapper<Integer> aw = new GenerischerArrayWrapper<>(3);
    @Test
    void add() {
        aw.add(2);
        aw.add(3);
        aw.add(4);
        aw.add(5);
        assertEquals(5, aw.get(3));
        assertEquals(aw.get(0), 2);
    }

    @Test
    void get() {
        aw.add(2);
        assertEquals(2, aw.get(0));
    }

    @Test
    void getArraySize() {
        assertEquals(3, aw.getArraySize());
    }

    @Test
    void getElementCount() {
        assertEquals(0, aw.getElementCount());
        aw.add(2);
        assertEquals(1, aw.getElementCount());
    }

}