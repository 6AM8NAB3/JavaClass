package javaClass.reference;

import javax.security.auth.Subject;

public class StudentTest {
    public static void main(String[] args) {
        Student studentJoo = new Student(1001, "조준호");
        Student studentPark = new Student(1002, "박병일");

        studentJoo.setJavaSubject("자바", 100);
        studentJoo.setDBSubject("데이터베이스", 100);

        studentPark.setJavaSubject("자바", 82);
        studentPark.setDBSubject("데이터베이스", 100);

        studentJoo.showStudentInfo();
        studentPark.showStudentInfo();
    }
}
