package classTask.TestCases;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {
    private MyStack personalStack;

    @BeforeEach
    public void setUp() {
        personalStack = new MyStack();
    }

    @Test
    public void testThatMyStackIsEmpty() {
        assertTrue(personalStack.isEmpty());
    }

    @Test
    public void testThatMyStackIsNotEmpty() {
        assertTrue(personalStack.isEmpty());

        personalStack.push("Orange");
        assertTrue(personalStack.isNotEmpty());
    }

    @Test
    public void testThatWhenIAddXY_iCanGetYX(){
        personalStack.push("Orange");
        personalStack.push("Mango");
        assertEquals(2, personalStack.size());
    }

    @Test
    public void testThatWhenIAddXYZ_andIRemoveY_IGetXZ() {
        personalStack.push("Orange");
        personalStack.push("Mango");
        personalStack.push("Apple");
        personalStack.pop();
        assertEquals(2, personalStack.size());
    }

    @Test
    public void testThatPersonalStackCanCheckForASpecificObject(){
        personalStack.push("Orange");
        personalStack.push("Mango");
        personalStack.push("Apple");
        personalStack.search("pear");
        assertFalse(personalStack.contains("pear"));
    }

    @Test
    public void testThatPersonalStackReturnsFirstElement() {
        personalStack.push("Orange");
        personalStack.push("Mango");
        String first = personalStack.peek();
        assertEquals("Mango", first);
    }

}
