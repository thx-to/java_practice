package JAVA_241015_PRTC_03;

import java.text.DecimalFormat;
import static JAVA_241015_PRTC_03.Common.FUEL_PRICE;

public abstract class Car {

    protected String carName;
    protected int speed;
    protected int fuelRate;
    protected int fuelTank;
    protected int seat;

    public Car(int speed, int fuelRate, int fuelTank, int seat, String carName) {
        this.speed = speed;
        this.fuelRate = fuelRate;
        this.fuelTank = fuelTank;
        this.seat = seat;
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    int getMovingCnt(int passCnt) {
        if (passCnt % seat != 0) return (passCnt / seat) + 1;
        return passCnt / seat;
    }

    int getRefuelCnt(int dist, int moveCnt) {
        if (((dist * moveCnt) / fuelRate) % fuelTank != 0) return (((dist * moveCnt) / fuelRate) / fuelTank) + 1;
        return ((dist * moveCnt) / fuelRate) / fuelTank;
    }

    String getTotalCost(int dist, int moveCnt) {
        DecimalFormat df = new DecimalFormat("#,###");
        return df.format(((long) dist / fuelRate) * FUEL_PRICE * moveCnt);
    }

    String getMovingTime(int dist, int moveCnt, int weather) {
        double getTime = (double) dist * moveCnt / speed;
        switch (weather) {
            case 2 : getTime *= 1.2; break;
            case 3 : getTime *= 1.4; break;
            default :
        }

        int totalMinute = (int) (getTime * 60);
        int hour = totalMinute / 60;
        int minute = totalMinute % 60;
        return String.format("%d시간 %d분", hour, minute);
    }

    abstract void setMode (boolean isMode);

}






