package JAVA_241015_PRTC_03;

import java.util.Scanner;

import static JAVA_241015_PRTC_03.Common.*;

public class CarMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4]광주 : ");
        int selArea = sc.nextInt();

        switch (selArea) {
            case 1 :
                System.out.println(busan);
                return busan;
                break;
            case 2 :
                return daejeon;
                break;
            case 3 :
                return gangneung;
                break;
            case 4 :
                return gwangju;
                break;
            default :
                System.out.println("지역을 잘못 선택하셨습니다.");
                break;

        }
        System.out.print("이동할 승객 수 입력 : ");
        int selCustomer = sc.nextInt();

        System.out.print("부가 기능 [1]ON [2]OFF : ");
        int selOption = sc.nextInt();

        System.out.print("날씨 [1]맑음 [2]비 [3]눈 : ");
        int selWeather = sc.nextInt();

        System.out.println(Car.getCarInfo);
    }


}
