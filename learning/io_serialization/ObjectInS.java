package learning.io_serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInS {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("P:\\Code\\learning\\serialization\\OOSfile.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s = (Student) ois.readObject();

        System.out.println(s);

        fis.close();
        ois.close();
    }
}
