package classTask.TestCases;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyMapTest {
    private MyMap personalMap;

    @BeforeEach
    public void startWith(){
        personalMap = new MyMap();
    }

    @Test
    public void testThatMyMapIsEmpty(){
        assertTrue(personalMap.isEmpty());
    }

    @Test
    public void testThatMyMapIsNotEmpty(){
        assertTrue(personalMap.isEmpty());

        personalMap.put("key", "value");
        assertTrue(personalMap.isNotEmpty());
        assertEquals(1, personalMap.size());
    }

    @Test
    public void testThatMyMapContainsKey(){
        personalMap.put("key", "Rice is delicious");
        personalMap.put("key2", "I enjoy eating Pasta");
        assertTrue(personalMap.contains("key"));
    }

    @Test
    public void testThatMyMapContainsValue(){
        personalMap.put("key", "Rice is delicious");
        personalMap.put("key2", "I love purple");
        assertTrue(personalMap.contains("key2"));
//        assertEquals("I love purple", personalMap.get());
    }

    @Test
    public void testThatMyMapContainsKeyAndValue(){
        personalMap.put("key", "Rice is delicious");
        personalMap.put("key2", "I love purple");
        assertTrue(personalMap.containsKeyAndValue("key", "Rice is delicious"));
    }

    @Test
    public void testThatMyMapCanRemoveASpecificKey(){
        personalMap.put("key", "Rice is delicious");
        personalMap.put("key2", "I love purple");
        personalMap.put("key3", "I am grateful");
        personalMap.remove("key2");
        assertEquals(3, personalMap.size());
    }

    @Test
    public void testThatWhenIAddABCDE_myMapSizeIncreases(){
        personalMap.put("key", "Rice is delicious");
        personalMap.put("key2", "I love purple");
        personalMap.put("key3", "I am grateful");
        personalMap.put("key4", "Blue is a beautiful colour");
        personalMap.put("key5", "Brown is soothing");
        assertEquals(5, personalMap.size());
    }


}
