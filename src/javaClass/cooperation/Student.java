package javaClass.cooperation;

public class Student {
    private int money;
    private int grade;
    private String studentName;

    public Student(int money,String studentName) {
        this.money = money;
        this.studentName = studentName;
    }

    public void takeBus(Bus bus) {
        //버스가 승객을 태우는 메소드
        money -= 1100;
    }

    public void takeSubway(Subway subway) {
        money -= 900;
    }

    public void showInfo() {
        System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
    }
}
