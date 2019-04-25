import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

    public static void main(String[] args) {
        //Person2304 person1 = new Person2304(1,"Jack");
        //Person2304 person2 = new Person2304(5, "Keicy");
        Person2304[] people = {new Person2304(1,"Jack"), new Person2304(5, "Keicy"), new Person2304(7, "Charles")};

        try (ObjectOutputStream fos = new ObjectOutputStream(new FileOutputStream("people.bin")  )) {
            //FileOutputStream fos = new FileOutputStream("people.bin");
                //ObjectOutputStream oos = new ObjectOutputStream(fos);

                fos.writeInt(people.length);
                for(Person2304 Person2304 : people) {
                    fos.writeObject(Person2304);
                }

                //oos.writeObject(person1);
                //oos.writeObject(person2);

                //fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
