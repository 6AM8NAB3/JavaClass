package javaClass.staticdemo;

public class Student {
    public static int serialNum = 1300;

    private int studentID;
    private String StudentName;
    private int grade;
    private String address;

    public Student(){
        this.studentID = ++serialNum;
    }

    public String getStudentName(){
        return StudentName;
    }

    public void setStudentName(String StudentName){
        this.StudentName = StudentName;

    }

    public int getStudentID(){
        return studentID;
    }

    public static int getSerialNum(){
        return serialNum;
    }
}