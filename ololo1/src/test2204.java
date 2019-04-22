public class test2204 {
    public static void main(String[] args) {
    Animal2204 animal1 = new Animal2204(1);
    Animal2204 animal2 = new Animal2204(1);

        System.out.println(animal1==animal2); //false 

    }

}

class Animal2204{
    private int id;
    public Animal2204(int id){
        this.id = id;
    }
}
