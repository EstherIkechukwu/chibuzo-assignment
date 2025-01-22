package classTask;

public class AirConditioner {
    private boolean isOn;
    private boolean isOff;
    private int temperature;

    public AirConditioner(boolean isOn, boolean isOff, int temperature) {
        this.isOn = isOn;
        this.isOff = isOff;
        this.temperature = temperature;
    }

    public AirConditioner() {

    }

    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public boolean isOn() {
        this.isOn = true;
        return isOn;
    }

    public boolean isOff() {
        this.isOff = true;
        return isOff;
    }


}
