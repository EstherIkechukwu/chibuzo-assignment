package classTask;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyQueueTest {
    private MyQueue myQueue;

    @BeforeEach
    public void startWith() {
        myQueue = new MyQueue();
    }

    @Test
    public void testThatMyQueueIsEmpty() {
        assertTrue(myQueue.isEmpty());
    }

    @Test
    public void testThatMyQueueIsNotEmpty() {
        assertTrue(myQueue.isEmpty());

        myQueue.add("Emmanuel");
        assertTrue(myQueue.isNotEmpty());

    }

    @Test
    public void testThatICanCheckMyQueueSize() {
        myQueue.add("Emmanuel");
        myQueue.add("Favour");
        myQueue.add("Christian");
        assertEquals(3, myQueue.size());
    }

    @Test
    public void testThatMyQueueReducesInSizeWhenACharacterIsRemoved() {
        myQueue.add("Emmanuel");
        myQueue.add("Favour");
        myQueue.add("Esther");
        myQueue.add("Onyinye");
        myQueue.remove("Esther");
        assertEquals(3, myQueue.size());
    }

    @Test
    public void testThatWhenIAddXY_myQueueOffersZA(){
        myQueue.add("Emmanuel");
        myQueue.add("Favour");
        myQueue.offer("Esther");
        myQueue.offer("Onyinye");
        assertEquals(4, myQueue.size());
    }

}


