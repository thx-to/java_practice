package JAVA_241015_PRTC_01;
// Do it! 자바 프로그래밍 입문 교재 pp.298

public class AdvancedLevel extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("빠르게 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("높이 Jump합니다.");
    }

    @Override
    public void turn() {
        System.out.println("Turn할 줄 모르지롱.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***** 중급자 레벨입니다 *****");
    }

}
