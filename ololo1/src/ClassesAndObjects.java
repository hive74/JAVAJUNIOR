public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();

        person1.setName("Alexxxo");
        person1.setAge(70);
        person1.speak();
        System.out.println("Выводим значение в main method:" + person1.getAge());
        System.out.println("Выводим значение в main method:" + person1.getName());

        String s2 = "Dorothea";
        Person person2 = new Person();
        person2.setNameAndAge(s2, 29);

        person2.sayHello();
        person2.speak();
        int year1 = person1.calculateYearsToRetirement();
        int year2 = person2.calculateYearsToRetirement();
        //System.out.println(person1.name + " to retire: " + year1 + " years");
        //System.out.println(person2.name + " to retire: " + year2 + " years");
    }
}
class Person{
    // данные(поля) + действия(методы)
    private String name;
    private int age;

    public void setName(String userNameSet){
        if (userNameSet.isEmpty()){
            System.out.println("Empty name");
        } else {
        name = userNameSet;}
    }
    public String getName(){
        return name;
    }

    public void setAge(int userAgeSet){
        if(userAgeSet<0){
            System.out.println("Error, age > 0");
        } else{
                age = userAgeSet;}
    }
    public int getAge(){
        return age;
    }


    void setNameAndAge(String username, int userage){
        name = username;
        age = userage;
    }

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