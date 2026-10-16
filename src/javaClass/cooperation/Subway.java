package javaClass.cooperation;

public class Subway {
    private int lineNumber;
    private int passengerCount;
    private int money;

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void takePerson() {
        money += 900;
        passengerCount++;
    }

    public void showInfo() {
        System.out.println(lineNumber + "호 지하철의 승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
    }
}
