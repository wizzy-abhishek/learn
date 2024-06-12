package learning_java.combination;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap; //current database

public class Checker {

    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("P:\\Code\\learning_java\\combination\\Database");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student stu ;
        HashMap<Integer ,Student> hm = new HashMap<>();

        int count = ois.readInt();
        for(int i = 0 ; i < count ; i++){
            stu = (Student) ois.readObject();
            hm.put(stu.roll , stu);
        }
        fis.close();

        for(Student student : hm.values()){
            System.out.println(student);
        }

        FileOutputStream fos = new FileOutputStream("P:\\Code\\learning_java\\combination\\Database");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeInt(hm.size());

        for (Student a : hm.values())
        {
            oos.writeObject(a);
        }
        fos.close();
    }
}
