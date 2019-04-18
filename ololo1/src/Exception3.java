import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) {
    //Checked exception (Compile time exception) = искл случай в работе программы
    //Unchecked exception (Runtime exception) = ошибка в работе   int a = 1/0

        File file1804 = new File("test");
        try {
            Scanner scanner1804 = new Scanner(file1804);
        } catch (FileNotFoundException e) {
            System.out.println("Checked exception");;
        }

        String name = null;         // NullPointerException
        name.length();


        int[] arr = new int[2];     //ArrayIndexOutOfBound
        System.out.println(arr[2]);

    }



}
