import java.io.IOException;
import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
    Scanner scanner16040 = new Scanner(System.in);
    while(true){
        int x = Integer.parseInt(scanner16040.nextLine());

        if( x != 0){
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Not 0");
            }
        }



    }


    }


}
