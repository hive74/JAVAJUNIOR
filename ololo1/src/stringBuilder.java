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
    }


}
