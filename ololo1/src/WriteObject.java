import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

    public static void main(String[] args) {
        Person2304 person1 = new Person2304(1,"Jack");
        Person2304 person2 = new Person2304(5, "Keicy");

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
                ObjectOutputStream oos = new ObjectOutputStream(fos);

                oos.writeObject(person1);
                oos.writeObject(person2);

                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
