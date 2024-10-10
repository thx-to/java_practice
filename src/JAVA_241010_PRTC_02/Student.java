package JAVA_241010_PRTC_02;
// Do it! 자바 프로그래밍 입문 교재 pp.211

public class Student {

    int studentID;
    String name;

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    public void showStudentInfo() {
        System.out.println(studentID + "," + name);
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}


