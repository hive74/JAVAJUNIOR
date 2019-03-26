public class contructor {

    public static void main(String[] args) {
        Man human1 = new Man();

    }
}

class Man {
    private String name;
    private int age;

    public Man(){
        this.name = "Default name";
        this.age = 0;
        System.out.println(name + " " + age);
        //System.out.println("Hi from 1 constructor");
    }

    public Man(String name){
        System.out.println("Hi from 2 constr. and " + name);
        this.name = name;
    }

    public Man(String name, int age){
        System.out.println("Hi from 3 constr. and " + name + " " + age);
        this.name = name;
        this.age = age;
    }




    public void setName(String name) { this.name = name;}

    public void setAge(int age) { this.age = age;}


}