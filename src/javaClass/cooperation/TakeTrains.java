package javaClass.cooperation;

public class TakeTrains {
    public static void main(String[] args) {
        Student studentKim = new Student(60000, "김도현");
        Student studentLee = new Student(10000, "이하랑");

        Bus busA = new Bus(937);
        Subway subwayA = new Subway(2);

        studentKim.takeBus(busA);
        studentKim.takeSubway(subwayA);
        studentLee.takeSubway(subwayA);

        studentKim.showInfo();
        studentLee.showInfo();
    }
}
