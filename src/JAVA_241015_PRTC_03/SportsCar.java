package JAVA_241015_PRTC_03;

public class SportsCar extends Car {

    static int speed = 250;
    static int fuelRate = 8;
    static int fuelTank = 30;
    static int seat = 2;
    static String carName = "Ferrari";

    public SportsCar() {
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
