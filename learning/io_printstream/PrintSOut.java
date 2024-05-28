package learning.io_printstream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintSOut {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("P:\\Code\\learning\\io_printstream\\PrintS");
        PrintStream ps = new PrintStream(fos);

        Student s = new Student();
        s.roll = 6 ;
        s.name = "Abhishek";
        s.dept = "CSE" ;

        ps.println(s.roll);
        ps.println(s.name);
        ps.println(s.dept);

        ps.flush();

        fos.close();
        ps.close();
    }
}


