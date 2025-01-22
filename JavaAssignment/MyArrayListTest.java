package classTask;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
    public void testThatMyArrayListIsNotEmpty() {
        personalArrayList.add("malik");
        assertTrue(personalArrayList.listIsNotEmpty());
    }

    @Test
    public void testThatWhenIAddXY_ICanGetXY(){
        personalArrayList.add("malik");
        personalArrayList.add("Abimbola");
        assertEquals("Abimbola", personalArrayList.get(1));

    }

}
