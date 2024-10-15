package JAVA_241015_PRTC_03;

public class Bus extends Car {

    static int speed = 150;
    static int fuelRate = 5;
    static int fuelTank = 100;
    static int seat = 20;
    static String carName = "관광버스";

    public Bus(int speed, int fuelRate, int fuelTank, int seat, String carName) {
        this.speed = speed;
        this.fuelRate = fuelRate;
        this.fuelTank = fuelTank;
        this.seat = seat;
        this.carName = carName;
    }

    @Override
    public int speed() {
        return this.speed;
    }

    @Override
    public int fuelRate() {
        return this.fuelRate;
    }

    @Override
    public int fuelTank() {
        return this.fuelTank;
    }

    @Override
    public int seat() {
        return this.seat;
    }

    @Override
    public String carName() {
        return this.carName;
    }

}
