package JAVA_241015_PRTC_02;
// Do it! 자바 프로그래밍 입문 교재 pp.311

import java.util.ArrayList;

public class CarTest {
    public static void main(String[] args) {

        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Sonata());
        carList.add(new Grandeur());
        carList.add(new Avante());
        carList.add(new Genesis());

        for (Car e : carList) {
            e.run();
            System.out.println("====================");
        }
    }
}
