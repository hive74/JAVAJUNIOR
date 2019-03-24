public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Alex";
        person1.age = 25;
        person1.speak();

        Person person2 = new Person();
        person2.name = "Dorothea";
        person2.age = 29;
        //person2.speak();
        person2.sayHello();
        person2.speak();
        int year1 = person1.calculateYearsToRetirement();
        int year2 = person2.calculateYearsToRetirement();
        System.out.println("Person1 to retire: " + year1 + " years");
        System.out.println("Person2 to retire: " + year2 + " years");
    }
}
class Person{
    // данные(поля) + действия(методы)
    String name;
    int age;

    int calculateYearsToRetirement(){
        int years = 65-age;
        return years;
        // System.out.println("Years to retirement: "+years);
    }


    void speak(){
        for (int i = 0; i < 1; i++) {
            System.out.println("My name is " + name + ", I'm " + age + " y.o.");}
    }
    void sayHello(){
        System.out.println("Hello!");
    }


}