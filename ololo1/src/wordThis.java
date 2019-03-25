public class wordThis {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setAge(20);
        human1.setName("Tomcat");
        human1.getInfo();


        Human human2 = new Human();
        human2.setAge(97);
        human2.setName("Connor");
        human2.getInfo();

    }


}
class Human{
    String name;
    int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int Age){
        this.age = Age;
    }
    public int getAge(){
        return age;
    }

    public void getInfo(){
        System.out.println(name + " " + age);
    }
}