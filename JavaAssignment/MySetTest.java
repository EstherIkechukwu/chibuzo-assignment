package classTask.TestCases;

import classTask.MySet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MySetTest {
    private MySet mySet;

    @BeforeEach
    public void startWith() {
        mySet = new MySet();
    }

    @Test
    public void testThatMySetIsEmpty() {
        assertTrue(mySet.isEmpty());
    }

    @Test
    public void testThatMySetIsNotEmptyWhenIAddToMySet() {
        assertTrue(mySet.isEmpty());

        assertTrue(mySet.isNotEmpty());
        mySet.add("Gloria");
        assertEquals(1, mySet.size());
    }

    @Test
    public void testThatWhenIAddXY_ICanGetXY() {
        mySet.add("Esther");
        mySet.add("Mercy");
        assertEquals("Mercy", mySet.get(1));
        assertEquals(2, mySet.size());
    }

    @Test
    public void testThatWhenIAddXY_ICanGetXYWhenIAddToMySet() {
        mySet.add("Esther");
        mySet.add("Mercy");
        mySet.add("Chidimma");
        mySet.add("Daniel");
        mySet.add("James");
        mySet.remove("Mercy");
        assertEquals("Daniel", mySet.get(2));
    }

    @Test
    public void testThatWhenIAddXYZ_capacityIncreases() {
        mySet.add("Esther");
        mySet.add("Mercy");
        mySet.add("Chidimma");
        mySet.add("Daniel");
        mySet.add("James");
        mySet.add("Gloria");
        assertEquals(6, mySet.size());
        assertEquals(10, mySet.capacity());
    }

    @Test
    public void testThatMySetCanClearAllElements() {
        mySet.add("Esther");
        mySet.add("Mercy");
        mySet.add("Chidimma");
        mySet.clear();
        assertEquals(0, mySet.size());
    }
}