import java.io.Serializable;

public class Person2304 implements Serializable {
    private int id;
    private transient  String  name;



    public Person2304(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public String toString(){
        return id + ":" + name;
    }

}
