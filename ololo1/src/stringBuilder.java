public class stringBuilder {
    public static void main(String[] args) {
        /*
        String string1 = "Hello";
        String string2 = " my";
        String string3 = " cat";
        String stringAll = string1 + string2 + string3;
        System.out.println(stringAll);
        */

        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.toString());
        sb.append(" my").append(" kitty");
        System.out.println(sb.toString());

        System.out.printf("Here %-10d This is a string, %s \n" , 111, "N_I_C_E");
        System.out.printf("Here %-10d This is a string, %s \n", 123, "N_I_C_E");
        System.out.printf("Here %10d This is a string, %s \n", 9876546, "N_I_C_E");
        System.out.printf("Here %.3f This is a string \n", 17.123123123);




    }


}
