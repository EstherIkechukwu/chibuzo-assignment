package classTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirConditionerTest {

    @Test
    public void myAirConditionerIsOnTest() {
        AirConditioner myAC = new AirConditioner();
        assertTrue(myAC.isOff());

        myAC.isOn();
        assertTrue(myAC.isOn());
    }
    @Test
    public void testThatMyAirConditionerIsOff() {
        AirConditioner myAC = new AirConditioner();
        assertTrue(myAC.isOn());

        myAC.isOff();
        assertTrue(myAC.isOff());
    }
    @Test
    public void testThatWhenIIncreaseTemperature_TemperatureIsIncreased() {
        AirConditioner myAC = new AirConditioner();
        assertTrue(myAC.isOn());
        int temperature = 16;



    }
}
