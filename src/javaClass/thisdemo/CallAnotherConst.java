package javaClass.thisdemo;

public class CallAnotherConst {
    public static void main(String[] args) {
        Person personJoo = new Person("조예빈", 14);

        System.out.println(personJoo.name);
        System.out.println(personJoo.age);

        System.out.println(personJoo.returnItSelf()); //주소값 같음
        System.out.println(personJoo); //주소값 같음
    }
}
