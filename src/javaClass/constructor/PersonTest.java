package javaClass.constructor;

public class PersonTest {
    public static void main(String[] args) {
        Person personJun = new Person("조준호");
        System.out.println(personJun.name);

        Person person6AM =  new Person();
        person6AM.name = "6AM8NAB3";
        System.out.println(person6AM.name);

        Person personKim = new Person("김도현", 180.0f, 70.0f);
        System.out.println(personKim.name + "의 키는 " + personKim.height + "cm 이고, 몸무게는 " + personKim.weight + "kg 이다.");
    }
}
