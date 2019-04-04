import Forest.Smth.SomeClass;
import Forest.Squirell;
import Forest.Tree;
import Forest.*;

import java.util.Scanner;


public class test extends Person {



    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat();
        Dog dog = new Dog();
        Cat cat = new Cat();

        testik(animal);
        testik(cat);
        testik(dog);



    }

    public static void testik(Animal animal){
        animal.eat();
    }
}




