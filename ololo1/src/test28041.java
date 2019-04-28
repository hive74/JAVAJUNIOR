public class test28041 {

    public static void main(String[] args) {
        //SomeCounter(3);

        System.out.println(fact(5));
    }

    public static void SomeCounter(int n){
        if (n == 0)
            return;
        System.out.println(n);



        SomeCounter(n-1);

    }

    public static int fact(int n){
        if(n == 1)
            return 1;

        return n * fact(n-1);
    }
}
