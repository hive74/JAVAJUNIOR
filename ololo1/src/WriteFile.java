import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteFile {

    public static void main(String[] args) throws FileNotFoundException {

        File file2204 = new File("testFile");
        PrintWriter pw = new PrintWriter(file2204);


        pw.println("lalala test lalala row1");
        pw.println("testRow2");
        pw.close();

    }

}
