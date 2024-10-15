package JAVA_241015_PRTC_01;
// Do it! 자바 프로그래밍 입문 교재 pp.298

public abstract class PlayerLevel {

    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();

    final public void go (int count) {
        run();
        for (int i = 0; i < count; i++) {
            jump();
        }
        turn();
    }

}
