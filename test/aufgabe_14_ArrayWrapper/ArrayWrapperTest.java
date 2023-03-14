package aufgabe_14_ArrayWrapper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayWrapperTest {

    ArrayWrapper aw = new ArrayWrapper(3);
    @Test
    void add() {
        aw.add(2);
        aw.add(3);
        aw.add(4);
        aw.add(5);
        assertEquals(aw.get(3), 5);
    }

    @Test
    void get() {
        aw.add(2);
        assertEquals(aw.get(0), 2);
    }

    @Test
    void getArraySize() {
        assertEquals(aw.getArraySize(), 3);
    }

    @Test
    void getElementCount() {
        assertEquals(aw.getElementCount(), 0);
        aw.add(2);
        assertEquals(aw.getElementCount(), 1);
    }
}