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
        Student studentJun = new Student(); //클래스 생성
        studentJun.studentName = "조준호";

        Student student6AM = new Student(); //클래스 생성
        student6AM.studentName = "6AM8NAB3";

        Student studentGit = new Student(); //클래스 생성
        studentGit.studentName = "GitHub";

        System.out.println(studentJun.getStudentName());
        System.out.println(student6AM.getStudentName());
        System.out.println(studentGit.getStudentName());

        System.out.println(studentJun);
        System.out.println(student6AM);
        System.out.println(studentGit);

    }
}
