import edai.tema1.IReadonlyList;
import org.junit.jupiter.api.Test;
import edai.tema1.ReadonlyArrays;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;


public class ReadonlyArraysTest {

    @Test
    public void emptyArrayTest(){
        IReadonlyList<Integer> numbers = ReadonlyArrays.asReadonlyList();

        assertTrue(numbers.empty());
        assertFalse(numbers.iterator().hasNext());
    }

    @Test
    public void throwsWhenNoMoreNext(){
        IReadonlyList<Integer> numbers = ReadonlyArrays.asReadonlyList();

        assertThrows(IndexOutOfBoundsException.class, () -> numbers.iterator().next());
    }

    @Test
    public void arrayOneValue(){
        IReadonlyList<Integer> numbers = ReadonlyArrays.asReadonlyList(10);

        assertFalse(numbers.empty());

        Iterator<Integer> iter = numbers.iterator();

        assertTrue(iter.hasNext());
        assertEquals(10, iter.next());
        assertFalse(iter.hasNext());
    }

    @Test
    public void arrayManyValue(){
        IReadonlyList<Integer> numbers = ReadonlyArrays.asReadonlyList(10, 20, 30, 40);

        assertFalse(numbers.empty());

        Iterator<Integer> iter = numbers.iterator();

        assertTrue(iter.hasNext());
        assertEquals(10, iter.next());
        assertTrue(iter.hasNext());
        assertEquals(20, iter.next());
        assertTrue(iter.hasNext());
        assertEquals(30, iter.next());
        assertTrue(iter.hasNext());
        assertEquals(40, iter.next());
        assertFalse(iter.hasNext());
    }
}
