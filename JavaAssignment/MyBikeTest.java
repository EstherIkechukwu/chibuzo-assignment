package classTask.TestCases;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyBikeTest {
    private MyBike personalBike;

    @BeforeEach
    public void startWith() {
        personalBike = new MyBike();
    }

    @Test
    public void testThatMyBikeIsTurnedOff() {
        personalBike.turnOff();
        assertFalse(personalBike.isOn());
    }

    @Test
    public void testThatMyBikeIsTurnedOn() {
        personalBike.turnOn();
        assertTrue(personalBike.isOn());
    }

    @Test
    public void testThatMyBikeCanBeTurnedOff_whenItIsTurnedOn() {
        personalBike.turnOn();
        assertTrue(personalBike.isOn());

        personalBike.turnOff();
        assertFalse(personalBike.isOn());
    }

    @Test
    public void testThatWhenMyBikeIsOnGearOneAndItAccelerates_speedIncreasesBy1(){
        personalBike.turnOn();

        assertTrue(personalBike.accelerate());
        assertEquals(16, personalBike.gearOne(15));
    }

    @Test
    public void testThatWhenMyBikeIsOnGearTwoAndItAccelerates_speedIncreasesBy2(){
        personalBike.turnOn();

        assertTrue(personalBike.accelerate());
        assertEquals(26, personalBike.gearTwo(24));
    }

    @Test
    public void testThatWhenMyBikeIsOnGearThreeAndItAccelerates_speedIncreasesBy3(){
        personalBike.turnOn();

        assertTrue(personalBike.accelerate());
        assertEquals(38, personalBike.gearThree(35));
    }

    @Test
    public void testThatWhenMyBikeIsOnGearFourAndItAccelerates_speedIncreasesBy4(){
        personalBike.turnOn();

        assertTrue(personalBike.accelerate());
        assertEquals(48, personalBike.gearFour(44));
    }

    @Test
    public void testThatWhenMyBikeIsOnGearOneAndItDecelerates_speedDecreasesBy1(){
        personalBike.turnOn();

        assertTrue(personalBike.decelerate());
        assertEquals(14, personalBike.gearOne(15));
    }

    @Test
    public void testThatWhenMyBikeIsOnGearTwoAndItDecelerates_speedDecreasesBy2(){
        personalBike.turnOn();

        assertTrue(personalBike.decelerate());
        assertEquals(22, personalBike.gearTwo(24));
    }

    @Test
    public void testThatWhenMyBikeIsOnGearThreeAndItDecelerates_speedDecreasesBy3(){
        personalBike.turnOn();

        assertTrue(personalBike.decelerate());
        assertEquals(32, personalBike.gearThree(35));
    }

    @Test
    public void testThatWhenMyBikeIsOnGearFourAndItDecelerates_speedDecreasesBy4(){
        personalBike.turnOn();

        assertTrue(personalBike.decelerate());
        assertEquals(40, personalBike.gearFour(44));
    }


}
