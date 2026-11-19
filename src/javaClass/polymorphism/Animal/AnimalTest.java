package javaClass.polymorphism.Animal;

public class AnimalTest {
    public static void main(String[] args){
        /* AnimalTest atest = new AnimalTest();
        atest.moveAnimal(new Human());
        atest.moveAnimal(new Tiger());
        atest.moveAnimal(new Eagle()); */

        Animal animal = new Human();
//        Tiger tiger = (Tiger) animal;
        //Human human = (Human) animal;


        if (animal instanceof Tiger tiger) {
            tiger.move();
        }
        else if (animal instanceof Human human){
            human.move();
        }
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }
}
