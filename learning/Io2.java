package learning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

public class Io2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("P:\\Code\\learning\\IO_LEARNING\\Text.txt");
        byte[] b = new byte[fis.available()];
        FileReader fr = new FileReader("P:\\Code\\learning\\IO_LEARNING\\Text.txt");
        fis.read(b);

        //String str = (Charset.defaultCharset(String.valueOf(b)));
        String str1 = new String(b);

        System.out.println(str1);
        inputStream(fis);
        fileReader(fr);

    }

    static void inputStream (FileInputStream xyz) throws IOException {
        int x ;
        while(xyz.read() != -1){
            x = xyz.read();
            System.out.print((char)x);
        }
    }

    static void fileReader(FileReader fr) throws IOException {
        //ArrayList<Character> abc = new ArrayList<>();
        char[] abc = new char[40];
        fr.read(abc);
        System.out.println(abc);
    }
}
