package JAVA_241015_PRTC_01;
// Do it! 자바 프로그래밍 입문 교재 pp.298

public class SuperLevel extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("엄청 빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("아주 높이 Jump합니다.");
    }

    @Override
    public void turn() {
        System.out.println("한 바퀴 돕니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***** 고급자 레벨입니다 *****");
    }

}
