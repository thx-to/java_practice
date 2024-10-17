package JAVA_241015_PRTC_03;

import java.util.Scanner;
import static JAVA_241015_PRTC_03.Common.*;

public class CarMain {
    public static void main(String[] args) {

        Car car = null;

        Scanner sc = new Scanner(System.in);

        int location = 0, carType = 0, option = 0, weather = 0;

        while (true) {
            System.out.print("이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4]광주 : ");
            location = sc.nextInt();
            if (location > 0 && location < 5) break;
            System.out.println("지역을 잘못 선택하셨습니다.");
        }

        System.out.print("이동할 승객 수 입력 : ");
        int passCnt = sc.nextInt();

        while (true) {
            System.out.print("차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
            carType = sc.nextInt();
            if (carType > 0 && carType < 4) break;
            System.out.println("차량을 잘못 선택하셨습니다.");
        }

        switch (carType) {
            case 1 : car = new SportsCar("Ferrari"); break;
            case 2 : car = new Sedan("GV80"); break;
            case 3 : car = new Bus("관광버스"); break;
            default : System.out.println("차량을 잘못 선택하셨습니다.");
        }

        while (true) {
            System.out.print("부가 기능 [1]ON [2]OFF : ");
            option = sc.nextInt();
            if (option > 0 && option < 3) break;
            System.out.println("옵션을 잘못 선택하셨습니다.");
        }

        boolean isMode = (option == 1) ? true : false;

        while (true) {
            System.out.print("날씨 [1]맑음 [2]비 [3]눈 : ");
            weather = sc.nextInt();
            if (weather > 0 && weather < 4) break;
            System.out.println("날씨를 잘못 선택하셨습니다.");
        }

        if (car != null) {
            car.setMode(isMode);
            int moveCnt = car.getMovingCnt(passCnt);
            System.out.println("=".repeat(7) + car.getCarName() + "=".repeat(7));
            System.out.println("총 비용 : " + car.getTotalCost(DISTANCE[location], moveCnt) + "원");
            System.out.println("총 주유 횟수 : " + car.getRefuelCnt(DISTANCE[location], moveCnt) + "회");
            System.out.println("총 이동 시간 : " + car.getMovingTime(DISTANCE[location], moveCnt, weather));
        }
    }
}
