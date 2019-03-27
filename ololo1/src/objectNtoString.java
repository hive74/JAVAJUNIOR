public class objectNtoString {
    public static void main(String[] args) {
        Pet p1 = new Pet("Lessy", 55);
        System.out.println(p1);
    }



}
class Pet {
    private String name;
    private int age;

    public Pet(String name, int age){
        this.name = name;
        this.age = age;

    }

    public String toString(){
        return name + "," + age;
    }


}