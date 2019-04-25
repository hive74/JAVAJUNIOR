import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("people.bin");

                ObjectInputStream ois = new ObjectInputStream(fis);

                int personCount = ois.readInt();
                Person[] people = new Person[personCount];

                for(int i = 0; i < personCount; i++) {
                    try {
                        people[i] = (Person) ois.readObject();
                    } catch (ClassNotFoundException e1) {
                        e1.printStackTrace();
                    }
                }

                //Person2304 person1 = (Person2304)ois.readObject();
                //Person2304 person2 = (Person2304)ois.readObject();
                //System.out.println(person1);
                //System.out.println(person2);

                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        }





