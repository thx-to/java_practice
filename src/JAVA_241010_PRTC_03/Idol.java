package JAVA_241010_PRTC_03;
// Do it! 자바 프로그래밍 입문 교재 pp.213

public class Idol {

    private String groupName;
    private String memberName;

    // 빈 생성자
    public Idol() {
    }

    // 그룹 이름과 멤버 이름을 매개변수로 받는 생성자
    public Idol(String groupName, String memberName) {
        this.groupName = groupName;
        this.memberName = memberName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void showIdolInfo() {
        System.out.println(groupName + "," + memberName);

    }
}