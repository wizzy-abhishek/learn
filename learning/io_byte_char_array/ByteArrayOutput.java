package learning.io_byte_char_array;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutput {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bos.write('a');
        bos.write('b');
        bos.write('h');
        bos.write('i');
        byte[] arr = bos.toByteArray();;
        for (byte b : arr){
            System.out.print((char)b);
        }
        bos.writeTo(new FileOutputStream("P:\\Code\\learning\\IO_LEARNING\\ByteArrayOutputFile"));
        bos.close();
    }
}
