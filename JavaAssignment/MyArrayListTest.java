package classTask;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {
    private MyArrayList personalArrayList;

    @BeforeEach
    public void setUp() {
        personalArrayList = new MyArrayList();
    }

    @Test
    public void testThatMyArrayListIsEmpty() {
        assertTrue(personalArrayList.listIsEmpty());
    }

    @Test
    public void testThatMyArrayListIsNotEmptyWhenIAddToMyArrayList() {
        assertTrue(personalArrayList.listIsEmpty());

        personalArrayList.add("Gloria");
        assertTrue(personalArrayList.listIsNotEmpty());
        assertEquals(1, personalArrayList.size());
    }

    @Test
    public void testThatWhenIAddXY_ICanGetXY(){
        personalArrayList.add("Esther");
        personalArrayList.add("Mercy");
        assertEquals("Mercy", personalArrayList.get(1));
        assertEquals(2, personalArrayList.size());
    }

    @Test
    public void testThatWhenIAddXYZ_IRemoveY(){
        personalArrayList.add("malik");
        personalArrayList.add("Abimbola");
        personalArrayList.add("Femi");
        personalArrayList.add("Bimbola");
        personalArrayList.add("Samuel");

        personalArrayList.remove("Femi");
        assertEquals("Bimbola", personalArrayList.get(2));

        personalArrayList.add("leke");
        personalArrayList.remove("Bimbola");
        assertEquals("Samuel", personalArrayList.get(2));
    }

    @Test
    public void testThatWhenIAddMoreElementsCapacityIncreases (){
        personalArrayList.add("malik");
        personalArrayList.add("Abimbola");
        personalArrayList.add("Femi");
        personalArrayList.add("JohDan");
        personalArrayList.add("Samuel");
        personalArrayList.add("Gloria");
        assertEquals(6, personalArrayList.size());
        assertEquals(10, personalArrayList.capacity());
    }

    @Test
    public void testThatPersonalArrayListContainsASpecificElement (){
        personalArrayList.add("malik");
        personalArrayList.add("Abimbola");
        personalArrayList.add("Femi");
        personalArrayList.add("JohDan");
        assertTrue(personalArrayList.contains("malik"));
    }

    @Test
    public void testThatPersonalArrayListDoesNotContainsASpecificElement (){
        personalArrayList.add("malik");
        personalArrayList.add("Abimbola");
        personalArrayList.add("Femi");
        personalArrayList.add("JohDan");
        assertFalse(personalArrayList.contains("Emmanuel"));
    }

    @Test
    public void testThatWhenIInsertAnElementToASpecificIndex_itAddsElement(){
        personalArrayList.add("Tosin");
        assertTrue(personalArrayList.indexOf("Tosin"));
    }

    @Test
    public void testThatICanAddXYZRemoveYAndReturnIndexOfZ(){
        personalArrayList.add("Tosin");
        personalArrayList.add("Favour");
        personalArrayList.add("Hamid");
        assertEquals(3,personalArrayList.size());
        assertEquals(2 ,personalArrayList.getElementByIndex("Hamid"));
    }

    @Test
    public void testThatWhenICanAddAnElementAtASpecificIndex(){
        personalArrayList.add("David");
        personalArrayList.add("Steven");
        personalArrayList.addAtIndex("Hannah",1);
        assertEquals(2 ,personalArrayList.getElementByIndex("Steven"));
    }

    @Test
    public void testThatMyArrayListCanClearAllElements(){
        personalArrayList.add("Tosin");
        personalArrayList.add("Favour");
        personalArrayList.clear();
        assertEquals(0, personalArrayList.size());
    }








}
