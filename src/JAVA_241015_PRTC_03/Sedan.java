package JAVA_241015_PRTC_03;

public class Sedan extends Car {

    public Sedan(String carName) {
        super(200, 12, 45, 4, carName);
    }

    @Override
    void setMode (boolean isMode) {
        if (isMode) seat += 1;
    }

}
