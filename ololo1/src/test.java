import Forest.Smth.SomeClass;
import Forest.Squirell;
import Forest.Tree;
import Forest.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class test extends Person {
    public static void main(String[] args) {

    /*    Animal animal = new Animal();
        animal.eat();
        Dog dog = new Dog();
        Cat cat = new Cat();

        testik(animal);
        testik(cat);
        testik(dog);
    }
    public static void testik(Animal animal){
        animal.eat();
    } */
        //Upcasting - восходящее преобр
    /*    Dog dog = new Dog();
        Animal animal1 = dog;

        //Downcasting
        Dog dog1 = (Dog) animal1;
        dog1.bark();
    } */

    List<Animal> listOfAnimal = new ArrayList<>();
    listOfAnimal.add(new Animal());
    listOfAnimal.add(new Animal());



    }

    private static void test(List<Animal> list) {
        for(Animal animal : list) {
            System.out.println(animal);
        }
    }

}






