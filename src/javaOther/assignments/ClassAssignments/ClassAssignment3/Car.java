package javaOther.assignments.ClassAssignments.ClassAssignment3;

public class Car {
    private static int serial = 10001;
    private int carNum;

    public Car() {
        this.carNum = serial;
        serial++;
    }

    public int getCarNum() {
        return carNum;
    }
}
