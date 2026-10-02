package javaClass.thisdemo;

public class ThisStudent {
    private int id;
    private String name;
    private int grade;

    public int getId() {
        return id;
    }

    public ThisStudent setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ThisStudent setName(String name) {
        this.name = name;
        return this;
    }

    public int getGrade() {
        return grade;
    }

    public ThisStudent setGrade(int grade) {
        this.grade = grade;
        return this;
    }

    public void showStudentInfo() {
        System.out.println("학번: " + id + "\n이름: " + name + "\n학년: " + grade);
    }
}
