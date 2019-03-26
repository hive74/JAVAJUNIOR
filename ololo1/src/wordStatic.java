public class wordStatic {
     public static void main(String[] args) {

         Men m1 = new Men("Bob",20);
         Men m2 = new Men("Jerry", 22);
         m1.printNumberOfPeople();
         m2.printNumberOfPeople();

         //System.out.println(Math.pow(2,4));
        }
    }

class Men {
        private String name;
        private int age;

        //public static String description;
        private static int countPeople; //=0


        public Men(String name, int age){
            System.out.println("Hi from 3 constr. and " + name + " " + age);
            this.name = name;
            this.age = age;
            countPeople++;
        }


        public void setName(String name) { this.name = name;}

        public void setAge(int age) { this.age = age;}

        public void printNumberOfPeople(){
            System.out.println("Count of people = " + countPeople);
        }


        //public void getAllFields(){
        //    System.out.println(name+","+age+","+description);
        //}

        //public static void printAllField(){
        //    System.out.println();
        //}

}
