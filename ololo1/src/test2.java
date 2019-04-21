public class test2 {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();


        //Animal animal = new Animal(); //error abstract

        dog.makeSound();
        cat.makeSound();
        cat.eat();
        dog.eat();

    }

}
