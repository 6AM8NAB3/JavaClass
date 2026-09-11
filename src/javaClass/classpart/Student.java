package javaClass.classpart;

public class Student {

    int StudentID;
    String studentName;
    int grade;
    String address;

    public void showStudentInfo() {
        System.out.println(studentName + " " + address);
    }

    public String getStudentName() {
        return studentName;
    }

    public static void main(String[] args) {
        Student studentJun = new Student();
        studentJun.studentName = "조준호";

        System.out.println(studentJun.studentName);
        System.out.println(studentJun.getStudentName());
    }
}
