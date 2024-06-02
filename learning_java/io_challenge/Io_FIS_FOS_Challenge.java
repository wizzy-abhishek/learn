package learning_java.io_challenge;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Io_FIS_FOS_Challenge {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("P:\\Code\\learning\\IO_LEARNING\\Source1.txt");
        FileOutputStream fos = new FileOutputStream("P:\\Code\\learning\\IO_LEARNING\\Source2.txt");
        dataFeeder(fis , fos);
       /* int b ;
        while((b = fis.read()) != -1){
            if(b<= 90 && b >= 65){
                fos.write(b+32);
            }else {
                fos.write(b);
            }
        }*/
        fis.close();
        fos.close();
    }

    static void dataFeeder(FileInputStream fis ,FileOutputStream fos) throws IOException {
       int b ;
       while((b=fis.read())!= -1){
           fos.write(b);
           System.out.print((char)b);
       }
    }
}
