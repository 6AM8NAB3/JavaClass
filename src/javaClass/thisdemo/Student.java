package javaClass.thisdemo;

public class Student {
    private int id;
    private String name;
    private int grade;

    public int getAge() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void setAge(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void showStudentInfo() {
        System.out.println("학번: " + id + "이름: " + name + "학년: " + grade);
    }
}
