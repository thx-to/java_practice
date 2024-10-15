package JAVA_241015_PRTC_01;
// Do it! 자바 프로그래밍 입문 교재 pp.298

public class PlayMain {
    public static void main(String[] args) {

        Player player = new Player();
        player.play(1);

        AdvancedLevel advancedLevel = new AdvancedLevel();
        player.upgradeLevel(advancedLevel);
        player.play(2);

        SuperLevel superLevel = new SuperLevel();
        player.upgradeLevel(superLevel);
        player.play(3);

    }
}
