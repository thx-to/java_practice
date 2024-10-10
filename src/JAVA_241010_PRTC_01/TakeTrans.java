package JAVA_241010_PRTC_01;
// Do it! 자바 프로그래밍 입문 교재 pp.175

public class TakeTrans {
    public static void main(String[] args) {

        Student studentJames = new Student("James", 5000);
        Student studentTomas = new Student("Tomas", 10000);
        Student studentEdward = new Student("Edward", 10000);

        Bus bus100 = new Bus(100);
        studentJames.takeBus(bus100);
        studentJames.showInfo();
        bus100.showInfo();

        Subway subwayGreen = new Subway("2호선");
        studentTomas.takeSubway(subwayGreen);
        studentTomas.showInfo();
        subwayGreen.showInfo();

        Taxi taxiDefault = new Taxi();
        studentEdward.takeTaxi(taxiDefault);
        studentEdward.showInfo();
        taxiDefault.showInfo();
    }

}
