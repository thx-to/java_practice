package JAVA_241015_PRTC_01;
// Do it! 자바 프로그래밍 입문 교재 pp.298

public class Player {

    private PlayerLevel level;

    public Player() {
        level = new BeginnerLevel();
        level.showLevelMessage();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel (PlayerLevel level) {
        this.level = level;
        level.showLevelMessage();
    }

    public void play (int count) {
        level.go(count);
    }

}
