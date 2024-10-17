package JAVA_241015_PRTC_03;

public class SportsCar extends Car {

    public SportsCar(String carName) {
        super(250, 8, 30, 2, carName);
    }

    @Override
    void setMode(boolean isMode) {
        if (isMode) speed *= 1.2;
    }

}
