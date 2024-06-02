package learning_java.io_buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedFILEoutput {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("P:\\Code\\learning\\IO_LEARNING\\ByteArrayOutputFile");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        String str = "I am abhishek";

        byte[] arr = str.getBytes();

        for(byte b : arr){
            bos.write(b);
        }
        bos.flush();
    }
}
