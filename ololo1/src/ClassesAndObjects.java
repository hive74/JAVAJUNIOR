public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Alex";
        person1.age = 25;
        System.out.println("My name is " + person1.name + ", I'm " + person1.age + " y.o.");
        Person person2 = new Person();
        person2.name = "Dorothea";
        person2.age = 29;
        System.out.println("My name is " + person2.name + ", I'm " + person2.age + " y.o.");
    }
}
class Person{
    // данные(поля) + действия(методы)
    String name;
    int age;

}