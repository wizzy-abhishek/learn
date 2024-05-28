package learning.io_serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Student implements Serializable {
    public int roll ;
    public  String name ;
    public String dept ;

    public Student(){

    }

    @Override
    public String toString() {
        return "Student details : \n" +
                "Roll " + roll + "\n" +
                "Name " + name + "\n" +
                "Department " + dept + "\n" ;

    }
}

public class ObjectOutputS {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("P:\\Code\\learning\\serialization\\OOSfile.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Student s = new Student();
        s.roll = 5 ;
        s.name = "Suraj" ;
        s.dept = "Mechanical/Diploma" ;

        oos.writeObject(s);
        oos.flush();

        fos.close();
    }
}
