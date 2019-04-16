import javax.script.ScriptException;
import java.io.IOException;
import java.util.Scanner;



public class Exception2 {
    public static void main(String[] args) throws ScannerException {
    Scanner scanner16040 = new Scanner(System.in);
    while(true){
        int x = Integer.parseInt(scanner16040.nextLine());

        if( x != 0){
                throw new ScannerException("What's going wrong");
        }



    }


    }


}
