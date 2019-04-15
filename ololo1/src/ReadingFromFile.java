import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {

        String separator = File.separator;
        String path1 = separator + "C" + separator + "Users" + separator + "Yan" + separator + "Desktop" + separator + "test.txt";
        String path = "C:\\Users\\Yan\\Desktop\\test.txt";
        File file = new File(path);
        File file1 = new File(path1);

        Scanner scanner1 = new Scanner(file);
        String line = scanner1.nextLine();
        String[] numbers = line.split(" ");
        System.out.println(Arrays.toString(numbers));
        int [] numberI = new int[3];
        int counter = 0;
        for(String number : numbers) {
            numberI[counter++] = Integer.parseInt(number);

        }

        System.out.println(Arrays.toString(numberI));

        scanner1.close();

        //Scanner scanner = new Scanner(System.in);
        //String input = scanner.nextLine();




    }




}
