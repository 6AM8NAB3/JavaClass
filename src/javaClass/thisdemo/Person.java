package javaClass.thisdemo;

public class Person {
    String name;
    int age;

    Person(){
        this("조준호", 17);
    }
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person returnItSelf() {
        return this;
    }
}
