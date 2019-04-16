import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;
import java.lang.Throwable;


public class Exception {

    public static void main(String[] args) {

        {
            try {
                ReadFile();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }

        System.out.println("After try catch");

    }

    public static void ReadFile() throws FileNotFoundException {
        File file1604 = new File("asdf");
        Scanner scanner1604 = new Scanner(file1604);

    }
}
