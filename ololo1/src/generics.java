import java.util.ArrayList;
import java.util.List;

public class generics {
    public static void main(String[] args) {
        ////////// before Java5 //////////////
        List  animals =new ArrayList();
        AnimalG newAnimal = new AnimalG();
        animals.add("kitty");
        animals.add("puppy");
        animals.add("bear");
        animals.add(newAnimal);
        String animal = (String) animals.get(1);

        System.out.println(animal);

        ///////// after java5 with generics //////////

        List<String> animals2= new ArrayList<String>();
        animals2.add("kitty");
        animals2.add("puppy");
        animals2.add("bear");
        //animals2.add(newAnimal);  ERROR compile
        String animal2 = animals2.get(1);


        ///////// after java7 with generics //////////

        List<String> animals3 = new ArrayList<>();



    }


}

class AnimalG {

}