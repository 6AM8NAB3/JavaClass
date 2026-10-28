package javaOther.assignments.ArrayListAssignments.Student;

import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {
        String[] names = {"강하늘", "김도영", "박영현", "안세영", "우상혁", "최인호"};
        int i = 1101;

        ArrayList<Student> students = new ArrayList<>();

        for (int j = 0; j < names.length; j++) {
            students.add(new Student(i + j, names[j]));
        }
        for (Student stu : students) {
            System.out.println("학번: " + stu.getNum() + ", 이름: " + stu.getName());
        }
    }
}