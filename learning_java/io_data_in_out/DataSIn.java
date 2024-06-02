package learning_java.io_data_in_out;


import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataSIn {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("P:\\Code\\learning\\io_data_in_out\\DataS");
        DataInputStream dis = new DataInputStream(fis);

        Student s = new Student();
        s.roll = dis.readInt();
        s.name = dis.readUTF();
        s.dept = dis.readUTF();

        System.out.println(s.roll + " " + s.name + " " +  s.dept );
    }
}
