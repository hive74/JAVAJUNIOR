interface Naimal {
    public void eat();
}

class Animal14041 implements Naimal {
    @Override
    public void eat() {
        System.out.println("InferfaceAnonOA is eating");
    }
}
public class test1 {
    public static void main(String[] args) {
    Animal animal = new Animal();
    animal.eat();
    OtherAnimal animall1 = new OtherAnimal();
    animall1.eat();
    Animal animal2 = new Animal() {
      public void eat(){
          System.out.println("AnonOA is eating");
      }
    };
    animal2.eat();
     Animal14041 Naimal2 = new Animal14041();
    Naimal2.eat();

    Naimal Naimal3 = new Naimal() {
        @Override
        public void eat() {
            System.out.println("111111InferfaceAnonOA is eating");
        }

    };
        Naimal3.eat();
    }


}
class OtherAnimal extends Animal1404{
    public void eat(){
        System.out.println("OA is eating");
    }
}
class Animal1404{
    public void eat(){
        System.out.println("Animal is eating");
    }

}
