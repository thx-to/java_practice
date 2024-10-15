package JAVA_241015_PRTC_02;
// Do it! 자바 프로그래밍 입문 교재 pp.311

public abstract class Car {
    public abstract void start();
    public abstract void drive();
    public abstract void stop();
    public abstract void turnOff();

    public void washCar() {
        System.out.println("세차를 합니다.");
    }

    public void run() {
        start();
        drive();
        stop();
        turnOff();
        washCar();

    }
}
