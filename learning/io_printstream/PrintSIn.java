package learning.io_printstream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class PrintSIn {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("P:\\Code\\learning\\io_printstream\\PrintS");
        BufferedReader bis = new BufferedReader(new InputStreamReader(fis));

        Student s = new Student();
        s.roll = Integer.parseInt(bis.readLine());
        s.name = bis.readLine();
        s.dept = bis.readLine();

        System.out.println(s.roll);
        System.out.println(s.name);
        System.out.println(s.dept);
    }
}
