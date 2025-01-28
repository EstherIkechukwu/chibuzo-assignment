package classTask.TestCases;

public class MyBike {
    private boolean isOn;
    private boolean decelerate;
    private boolean accelerate;

    public boolean turnOff() {
        isOn = false;
        return isOn;
    }

    public boolean turnOn() {
       isOn = true;
       return true;
    }

    public boolean isOn() {
        return isOn;
    }

    public boolean accelerate() {
        accelerate = true;
        return true;
    }

    public boolean decelerate() {
        decelerate = true;
        return true;
    }

    public int gearOne(int speed) {
        if(speed >= 0 && speed <= 20 && accelerate) {
            speed += 1;
        } else if (speed >= 0 && speed <= 20 && decelerate) {
            speed -= 1;
        }
        return speed;
    }

    public int gearTwo(int speed) {
        if(speed >= 21 && speed <= 30 && accelerate) {
            speed += 2;
        }
        else if(speed >= 21 && speed <= 30 && decelerate) {
            speed -= 2;
        }
        return speed;
    }

    public int gearThree(int speed) {
        if(speed >= 31 && speed <= 40 && accelerate) {
            speed += 3;
        }
        else if(speed >= 31 && speed <= 40 && decelerate) {
            speed -= 3;
        }
        return speed;
    }

    public int gearFour(int speed) {
        if(speed >= 41 && accelerate ) {
            speed += 4;
        }
        else if(speed >= 41 && decelerate) {
            speed -= 4;
        }
        return speed;
    }
}
