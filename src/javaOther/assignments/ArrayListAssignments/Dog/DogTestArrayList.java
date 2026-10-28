package javaOther.assignments.ArrayListAssignments.Dog;

import java.util.ArrayList;

public class DogTestArrayList {
    public static void main(String[] args) {
        ArrayList<Dog> dog = new ArrayList<Dog>();

        dog.add(new Dog("멍멍이", "치와와"));
        dog.add(new Dog("뽀삐", "진돗개"));
        dog.add(new Dog("순심이", "삽살개"));
        dog.add(new Dog("철이", "마르티스"));
        dog.add(new Dog("삐쭈", "푸들"));

        for (Dog dogs : dog) {
            dogs.showInfo();
        }
    }
}
