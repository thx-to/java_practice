package JAVA_241015_PRTC_03;

public class Sedan extends Car {

    static int speed = 200;
    static int fuelRate = 12;
    static int fuelTank = 45;
    static int seat = 4;
    static String carName = "GB80";

    public Sedan(int speed, int fuelRate, int fuelTank, int seat, String carName) {
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
