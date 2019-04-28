public class test2804 {
    public static void main(String[] args) {
    Animal2804 animal = Animal2804.CAT;

    switch (animal){
        case CAT:
            System.out.println("It's a cat!");
            break;
        case DOG:
            System.out.println("It's a dog!");
            break;


    }
    Animal2804 animal1 = Animal2804.CAT;
        System.out.println(animal1.getTranslation());
    // Object -> Enum -> Season (enum)

    //    System.out.println(season instanceof Season);
        /*
        Methods
        season.name()
        season.valueOf()
        season.ordinal()
         */


        Season season1 = Season.Spring;
        System.out.println(season1.getTemperature());

    Season season = Season.Summer;
    switch (season){
        case Summer:
            System.out.println("Hot");
            break;
        case Autumn:
            System.out.println("Cold");
            break;
    }
    }
}
