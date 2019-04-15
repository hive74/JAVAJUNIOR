import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {

        String separator = File.separator;
        String path1 = separator + "C" + separator + "Users" + separator + "Yan" + separator + "Desktop" + separator + "test.txt";
        String path = "C:\\Users\\Yan\\Desktop\\test.txt";
        File file = new File(path);
        File file1 = new File(path1);

        Scanner scanner1 = new Scanner(file);
        while(scanner1.hasNextLine()) {
            System.out.println(scanner1.nextLine());
        }
        scanner1.close();

        //Scanner scanner = new Scanner(System.in);
        //String input = scanner.nextLine();




    }




}
