public class test2204 {
    public static void main(String[] args) {
        // animal1 ->      {1}
        // animal2 ->      {1}
    Animal2204 animal1 = new Animal2204(1);
    Animal2204 animal2 = new Animal2204(1);

        System.out.println(animal1==animal2); //false

        //Object object2204 = new Object();

        System.out.println(animal1.equals(animal2));

        String string1 = "Hello";           // string1 -> {"Hello"}
        String string2 = "Hello";           // string2 -> Hello (string1) String Pull
        System.out.println(string1.equals(string2));

        String string3 = "Hello";
        String string4 = "Hello123".substring(0,5);

        System.out.println(string3 == string4);

    }

}
class Animal2204{
    private int id;
    public Animal2204(int id){
        this.id = id;
    }
    public boolean equals(Object obj) {
        Animal2204 otherAnimal = (Animal2204) obj;
        return this.id == otherAnimal.id;




    }
}
