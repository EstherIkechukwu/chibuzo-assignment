package classTask.TestCases;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListTest {
    private MyLinkedList personalLinkedList;

    @BeforeEach
    public void startWith() {
        personalLinkedList = new MyLinkedList();
    }

    @Test
    public void testThatMyLinkedListIsEmpty() {
        assertTrue(personalLinkedList.isEmpty());
    }

    @Test
    public void testThatMyLinkedListIsNotEmpty() {
        assertTrue(personalLinkedList.isEmpty());

        personalLinkedList.add();
        assertTrue(personalLinkedList.isNotEmpty());
    }

    @Test
    public void testThatWhenIAddXY_ICanGetXY(){
        personalLinkedList.add();
        personalLinkedList.add();
        personalLinkedList.get();
        assertEquals(2, personalLinkedList.size());
    }
}
