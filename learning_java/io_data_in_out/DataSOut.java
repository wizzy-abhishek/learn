package learning_java.io_data_in_out;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataSOut {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("P:\\Code\\learning\\io_data_in_out\\DataS");
        DataOutputStream dos = new DataOutputStream(fos);

        Student s = new Student();
        s.roll = 84 ;
        s.name = "Gargi parmar" ;
        s.dept = "CSE" ;

        dos.writeInt(s.roll);
        dos.writeUTF(s.name);
        dos.writeUTF(s.dept);

        dos.flush();

        fos.close();

    }
}
