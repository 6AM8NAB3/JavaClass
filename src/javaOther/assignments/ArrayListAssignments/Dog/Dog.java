package javaOther.assignments.ArrayListAssignments.Dog;

public class Dog {
    private String name;
    private String type;

    public Dog(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void showInfo() {
        System.out.println(name + "," + type);
    }
}
