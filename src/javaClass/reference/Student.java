package javaClass.reference;

public class Student {
    int studentID;
    String studentName;

    subject java = new subject();
    subject db = new subject();

    public Student(int studentID, String studentName) {
         this.studentID = studentID;
         this.studentName = studentName;
    }

    public void setJavaSubject(String subjectName, int score) {
        java.setSubjectName(subjectName);
        java.setScorePoint(score);
    }

    public void setDBSubject(String subjectName, int score) {
        db.setSubjectName(subjectName);
        db.setScorePoint(score);
    }

    public void showStudentInfo() {
        System.out.println(studentName + "님의 "
                + java.getSubjectName() + "과목의 점수는 " + java.getScorePoint() + "점 이고, "
                + db.getSubjectName() + "과목의 점수는 " + db.getScorePoint() + "점 입니다.");
    }
}
