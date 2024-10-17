package JAVA_241015_PRTC_03;

public class Bus extends Car {

    public Bus (String carName) {
        super(150, 5, 100, 20, carName);
    }

    @Override
    void setMode (boolean isMode) {
        if (isMode) fuelTank += 30;
    }

}
