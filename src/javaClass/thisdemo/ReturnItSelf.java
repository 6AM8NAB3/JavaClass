package javaClass.thisdemo;

public class ReturnItSelf {
    public static void main(String[] args) {
        ThisStudent student = new ThisStudent();

        /*student.setId(1316);
        student.setName("조준호");
        student.setGrade(1);*/

        ThisStudent student1 = student.setId(1316);
        ThisStudent student2 = student1.setName("조준호");
        ThisStudent student3 = student2.setGrade(1);

        student1.setName("조준호").setGrade(1).showStudentInfo();
    }
}
