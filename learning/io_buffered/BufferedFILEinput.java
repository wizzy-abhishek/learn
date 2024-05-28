package learning.io_buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedFILEinput {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("P:\\Code\\learning\\IO_LEARNING\\io_practice");
        BufferedInputStream bis = new BufferedInputStream(fis);
        byte[] arr = bis.readAllBytes();
        for(byte b : arr){
            System.out.print((char)b);
        }
        bis.close();
        fis.close();
    }
}
