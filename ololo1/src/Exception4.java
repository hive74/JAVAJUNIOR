import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Exception4 {
    public static void main(String[] args) {
        try {
            run();

        }
        catch (ParseException t) {
            System.out.println("lalala");
        }

        catch (java.lang.Exception e) {
            e.printStackTrace();
        }

    }


    public static void run() throws IOException, ParseException, IllegalArgumentException{



    }


}
